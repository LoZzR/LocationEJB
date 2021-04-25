package metier;

import java.util.List;

import javax.ejb.Local;

import entities.Location;
import entities.Shop;

@Local
public interface ShopLocal {

	String hello(String name);
	
	Location getLocationByIdShop(long idShop);
	
	List<Shop> getAllShop();
	
}
