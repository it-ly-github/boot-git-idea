package com.java.DI1;

import com.java.pojo.DB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class DITest {

    public static void main(String[] args) {
        // 通过set方式

        // 通过构造方法方式

        // 启动Spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DB db = context.getBean("db", DB.class);
        System.out.println(db);

        // 关闭spring 容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
