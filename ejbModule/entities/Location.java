package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LOCATION")
	private int id;
	@Column(name = "COORD_X")
	private String coordX;
	@Column(name = "COORD_Y")
	private String coordY;
	
	public Location() {
		
	}
	
	public Location(String coordX, String coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoordX() {
		return coordX;
	}
	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}
	public String getCoordY() {
		return coordY;
	}
	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", coordX=" + coordX + ", coordY=" + coordY + "]";
	}
	
}
