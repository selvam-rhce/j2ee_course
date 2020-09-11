package dev.selvam.assignment12.models;

import java.util.List;

public interface MobilePhoneDAO {

	
	public void saveMobile(Mobile e);
	public void updateMobile(Mobile e);
	public void deleteMobile(Mobile e);
	public Mobile getById(int id);
	public List<Mobile> getMobiles();
	public Mobile findMobile(String name);
}
