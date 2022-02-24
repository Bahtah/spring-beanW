package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld tree = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.getMessage());

        HelloWorld leaf = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(leaf.getMessage());

        System.out.println("Бир helloworld?: " + (tree == leaf));

        System.out.println();

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
        System.out.println(cat1);

        System.out.println("Бир мышыкпы?: " + (cat == cat1));
    }
}
