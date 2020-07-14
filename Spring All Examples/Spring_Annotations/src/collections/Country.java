package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

//File : Country.java
public class Country {
	private String countryName;
	private List<String> states; //Allow Duplicates
	private Set<String> rivers; //Not-Allow Duplicates
	private Map<String, String> capitals;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}
	public Set<String> getRivers() {
		return rivers;
	}
	public void setRivers(Set<String> rivers) {
		this.rivers = rivers;
	}
	public Map<String, String> getCapitals() {
		return capitals;
	}
	public void setCapitals(Map<String, String> capitals) {
		this.capitals = capitals;
		}	

}
