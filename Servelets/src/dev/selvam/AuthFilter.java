package dev.selvam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/home")
public class AuthFilter implements Filter {
	
	Connection conn = null;

    /**
     * Default constructor. 
     */
    public AuthFilter() {
    	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    	final String DB_URL = "jdbc:mysql://192.168.160.81:3306/selvamdb";
    	final String USER = "root";
    	final String PASS = "Bullet_123";
    	
    	try {
    		Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


		String userid = request.getParameter("uid");
		String userpass = request.getParameter("pass");
//		response.getWriter().append("Welcome "+userid);
		String checkSql = "select * from users where userid=? and password=?";

		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(checkSql);
			ps.setString(1, userid);
			ps.setString(2, userpass);
			ResultSet rs = ps.executeQuery();
			if ( rs.next()) {
				System.out.println("Login passed");
//				RequestDispatcher rd = request.getRequestDispatcher("/auth");
//				Cookie uid = new Cookie("userid", userid);
//				Cookie upass = new Cookie("userpass", userpass);
//				
//				response.addCookie(uid);
//				response.addCookie(upass);
//				rd.include(request, response);
				chain.doFilter(request, response);
			}
			else {
				System.out.println("im here");
				PrintWriter out = response.getWriter();
				out.println("<p>Invalid username / password </p>");
				RequestDispatcher rd = request.getRequestDispatcher("Login");

				rd.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
