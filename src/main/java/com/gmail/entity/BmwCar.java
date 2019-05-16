package com.gmail.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Log4j
@Getter
@Setter
public class BmwCar implements Car, BeanPostProcessor, InitializingBean, DisposableBean {
    private int maxSpeed;
    private int cost;

    public BmwCar(int maxSpeed, int cost) {
        this.maxSpeed = maxSpeed;
        this.cost = cost;
        log.info(this + " constructor");
    }


    @Override
    public void go() {
        log.info("Bwm car is going...");
        log.info("Speed " + Math.random() * maxSpeed);
    }

    @Override
    public void stop() {
        log.info("Bmw car've stopped...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(this + " postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(this + " postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(this + " init-method");
    }

    @Override
    public void destroy() {
        log.info(this + " destroy-method");
    }
}
