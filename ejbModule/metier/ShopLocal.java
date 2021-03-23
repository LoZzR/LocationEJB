package metier;

import javax.ejb.Local;

@Local
public interface ShopLocal {

	String hello(String name);
}
