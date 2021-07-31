package com.winson.study.spring.aop.v1.demo;

import com.winson.study.spring.aop.v1.bean.Man;
import com.winson.study.spring.aop.v1.config.AopConfig;
import com.winson.study.spring.aop.v1.service.HelloService;
import com.winson.study.spring.aop.v1.service.HelloServiceSon;
import com.winson.study.spring.aop.v1.service.HelloServiceSub;
import com.winson.study.spring.aop.v1.utils.HelpUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author winson
 * @date 2021/7/19
 **/
public class SpringAopDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//        HelpUtils.printlnBeanNames(context);
//        AopConfig aopConfig = context.getBean(AopConfig.class);
//        System.out.println(aopConfig);
//        HelloService service = context.getBean(HelloService.class);
//        service.sayHello("winson");

//        HelloServiceSub service = context.getBean(HelloServiceSub.class);
//        service.sayHello("winson");
//        service.subSayHello("winson");
//        service.sayGoodBye("night", 23);
//        service.sayHuman(new Man());
//        service.sayMan(new Man());

        HelloServiceSon son = context.getBean(HelloServiceSon.class);
        son.sonSayHello("papa");
//        son.sayHello("papa");

    }

}