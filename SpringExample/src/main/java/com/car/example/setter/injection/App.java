package com.car.example.setter.injection;
import com.car.example.setter.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
    Car myCar = (Car) context.getBean("car");
        myCar.displayDetails();

    }
}
