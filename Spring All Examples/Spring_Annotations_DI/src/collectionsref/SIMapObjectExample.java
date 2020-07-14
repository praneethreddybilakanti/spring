package collectionsref;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File : SIMapObjectExample.java
public class SIMapObjectExample {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("collectionsref/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object ob = factory.getBean("ob");
		Country c = (Country) ob;
		List<State> states = c.getStates();

		System.out.println("Country Name : " + c.getCountryName());
		Iterator<State> itr = states.iterator();
		while (itr.hasNext()) {
			State s = (State) itr.next();
			System.out.println(s.getStName() + " : " + s.getStCapital());
		}
	}
}
