package com.gmail;

import com.gmail.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final String APPLICATION_CONTEXT = "ApplicationContext.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT);
        Car bmwSingleton = (Car) context.getBean("bmwSingleton");
        Car bmwPrototype = (Car) context.getBean("bmwPrototype");
        Car audiSingleton = (Car) context.getBean("audiSingleton");
        Car audiPrototype = (Car) context.getBean("audiPrototype");
    }
}
