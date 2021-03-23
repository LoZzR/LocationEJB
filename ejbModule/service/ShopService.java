package service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

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
}
