package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Location;
import entities.Shop;

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
		
		Query query = em.createQuery("select s.location from Shop s where s.id = :idShop");
		
		query.setParameter("idShop", idShop);
		
		Location location = null;
		try {
			location = (Location)query.getSingleResult();
		} catch (NoResultException  e) {
			throw new RuntimeException("ID NOT FOUND !");
		}
		
		return location;
	}

	@Override
	public List<Shop> getAllShop() {
		Query query = em.createQuery("SELECT s.id, s.location FROM Shop s left join s.location order by s.id");
		List<Shop> shops = query.getResultList();
		
		return shops;
	} 

}
