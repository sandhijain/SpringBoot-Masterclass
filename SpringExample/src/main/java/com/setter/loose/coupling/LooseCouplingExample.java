package com.setter.loose.coupling;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
        UserManager userManagerWithDatabaseProvider = (UserManager) context.getBean("userManagerWithDatabaseProvider");
        System.out.println(userManagerWithDatabaseProvider.getUserInfo());

        UserManager userManagerWithWebServiceProvider = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWebServiceProvider.getUserInfo());
    }

}
