package metier;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Location;

@Stateless(name = "Shop")
public class ShopImp implements ShopLocal, ShopRemote {

	@PersistenceContext(unitName = "UP_LOCATION")
	EntityManager em;
	
	@Override
	public String hello(String name) {
		return "Hello World : " + name;
	}

	@Override
	public Location getLocationByIdShop(long idShop) {
		
		Query query = em.createQuery("select l from Location l where l.idShop = :idShop");
		
		query.setParameter("idShop", idShop);
		
		Location location = null;
		try {
			location = (Location)query.getSingleResult();
		} catch (NoResultException  e) {
			throw new RuntimeException("ID NOT FOUND !");
		}
		
		return location;
	}

}
