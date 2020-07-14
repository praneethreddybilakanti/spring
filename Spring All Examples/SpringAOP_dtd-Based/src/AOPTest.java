import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class AOPTest {
public static void main(String[] args) {
	 Resource res = new ClassPathResource("SpringConfig.xml");
     BeanFactory factory = new XmlBeanFactory(res);
     
     Account account = (Account) factory.getBean("proxy");
     account.deposite(500);
}
}
