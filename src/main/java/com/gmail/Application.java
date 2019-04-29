package com.gmail;

import com.gmail.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final String APPLICATION_CONTEXT = "ApplicationContext.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT);
        Car bmwSingleton = context.getBean("bmwSingleton", Car.class);
        Car bmwPrototype = context.getBean("bmwPrototype", Car.class);
        Car audiSingleton = context.getBean("audiSingleton", Car.class);
        Car audiPrototype = context.getBean("audiPrototype", Car.class);
    }
}
