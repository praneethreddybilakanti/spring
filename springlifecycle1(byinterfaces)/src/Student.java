import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}
@Override
	public void destroy() throws Exception {
		System.out.println("destory");
	}
public void cleanUp()
{
	System.out.println("cleanup");
}
}
