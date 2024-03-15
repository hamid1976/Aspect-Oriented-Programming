package com.aop;

import com.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/aop/config.xml");

        PaymentService paymentObject= context.getBean("payment", PaymentService.class);
        
        
        //auth ,print:PaymentStarted
        paymentObject.makePayment(123);
        
    }
}
