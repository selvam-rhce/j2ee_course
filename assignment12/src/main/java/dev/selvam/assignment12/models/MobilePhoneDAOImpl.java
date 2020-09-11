package dev.selvam.assignment12.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class MobilePhoneDAOImpl implements MobilePhoneDAO {

	
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional(readOnly = false)
	@Override
	public void saveMobile(Mobile e) {
		ht.save(e);
	}

	@Transactional(readOnly = false)
	@Override
	public void updateMobile(Mobile e) {
		ht.update(e);

	}

	@Override
	public void deleteMobile(Mobile e) {
		ht.delete(e);

	}

	@Override
	public Mobile getById(int id) {
		Mobile e=(Mobile)ht.get(Mobile.class,id);
		return e;
	}

	@Override
	public List<Mobile> getMobiles() {
		List<Mobile> list=new ArrayList<Mobile>(); 
		list = ht.loadAll(Mobile.class); 
		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public Mobile findMobile(String name) {
		List<Mobile> mobileList = new ArrayList<Mobile>();
		String findQuery = "from mobile as mob where mob.name = ?0";
		mobileList = (List<Mobile>) ht.find(findQuery, name);
		return mobileList.get(0);
	}

}
