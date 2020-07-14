package constructorInjection;

import java.util.Iterator;
import java.util.List;

//File : Country.java
public class Country {
	private String countryName;
	private List<State> states;

	public Country(String countryName, List<State> states) {
		super();
		this.countryName = countryName;
		this.states = states;
	}

	public void getCountry() {
		System.out.println("Country Name : " + this.countryName);
		List<State> states = this.states;
		Iterator<State> itr = states.iterator();
		while (itr.hasNext()) {
			State s = (State) itr.next();
			s.getState();
		}

	}
}
