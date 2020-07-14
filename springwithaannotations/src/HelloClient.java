import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class HelloClient
{
   public static void main(String[] args)
    {        
  ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        HelloWorld hw= (HelloWorld) context.getBean("helloBean");
        hw.display("spring5");

    }
}