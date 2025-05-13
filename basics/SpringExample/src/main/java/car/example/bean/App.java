package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean bean  = (MyBean) container.getBean("myBean");

        //bean.setMassage("Hello from spring bean");

        bean.showMsg();
    }
}
