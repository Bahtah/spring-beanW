package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println("Бир helloworld?: " + (bean == bean1));

        System.out.println();

        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.printCat();
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        cat1.printCat();

        System.out.println("Бир мышыкпы?: " + (cat == cat1));
    }
}
