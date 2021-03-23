package metier;

import javax.ejb.Remote;

@Remote
public interface ShopRemote {

	String hello(String name);
	
}
