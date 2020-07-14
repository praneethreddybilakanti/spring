package bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource res=new ClassPathResource("resources/context.xml");
	BeanFactory bf=new XmlBeanFactory(res);
	BeanFactoryExample e=bf.getBean(BeanFactoryExample.class);
	
}
}
