package com.winson.spring.annotation.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author winson
 * @date 2021/10/6
 **/
//@MyComponentScan2(forBP = "com.winson.spring.annotation.demo")
//@MyComponentScan2(subPkg = "com.winson.spring.annotation.demo")
//@MyComponentScan2(subAtPkg = "com.winson.spring.annotation.demo")
@MyComponentScan2(opkg = "com.winson.spring.annotation.demo")
public class ComponentScanDemo implements ApplicationContextAware {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(ComponentScanDemo.class);

        context.refresh();

        TestClass testClass = context.getBean(TestClass.class);
        System.out.println(testClass);

        context.close();

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
