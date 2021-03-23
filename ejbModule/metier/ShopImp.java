package metier;

import javax.ejb.Stateless;

@Stateless(name = "Shop")
public class ShopImp implements ShopLocal, ShopRemote {

	@Override
	public String hello(String name) {
		return "Hello World : " + name;
	}

}
