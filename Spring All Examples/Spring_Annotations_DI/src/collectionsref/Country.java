package collectionsref;

import java.util.List;
 
//File : Country.java
public class Country {
	private String countryName;
	private List<State> states;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	 
	 
}
