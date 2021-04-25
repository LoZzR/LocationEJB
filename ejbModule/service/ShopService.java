package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entities.Location;
import entities.Shop;
import metier.ShopLocal;

@Stateless
@WebService
public class ShopService {

	@EJB
	private ShopLocal shop;
	
	@WebMethod
	public String hello(@WebParam(name="nom") String name) {
		return shop.hello(name);
	}
	

	
	@WebMethod
	public Location findShopLocation(@WebParam(name="id") int id) {
		return shop.getLocationByIdShop(id);
	}
	
	@WebMethod
	public List<Shop> getAllShop() {
		List<Shop> shops = shop.getAllShop();
		return shops;
	}
}
