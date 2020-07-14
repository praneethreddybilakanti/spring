package collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File : SIMapStringExample.java
public class SIMapStringExample {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("collections/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object ob = factory.getBean("ob");
		Country c = (Country) ob;

		System.out.println("Country Name : " + c.getCountryName());
		System.out.println("States : " + c.getStates());
		System.out.println("Rivers : " + c.getRivers());
		System.out.println("Capitals : " + c.getCapitals());
	}
}
