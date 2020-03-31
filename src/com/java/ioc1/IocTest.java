package com.java.ioc1;

import com.java.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog smallDog = context.getBean("smallDog", Dog.class);
//        Dog smallDog2 = context.getBean("smallDog", Dog.class);
          smallDog.eait();
//        System.out.println(smallDog);
//        System.out.println(smallDog2);
        ((ClassPathXmlApplicationContext)context).close();

        System.out.println("开发人员修改了,,terte");
        // 开发人员再次修改 哈哈
        System.out.println("hh");
    }
}
