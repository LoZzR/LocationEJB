package metier;

import javax.ejb.Local;

import entities.Location;

@Local
public interface ShopLocal {

	String hello(String name);
	
	Location getLocationByIdShop(long idShop);
}
