package com.app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.app.services.PaymentServiceImpl.makePayments())")
    public void printBefore(){
        System.out.println("Payment started...");
    }

    @After("execution(* com.app.services.PaymentServiceImpl.makePayments())")
    public void printAfter(){
        System.out.println("After created");
    }
}
