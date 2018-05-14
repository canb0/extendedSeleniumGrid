package com.swtestacademy;

import org.openqa.grid.common.RegistrationRequest;
import org.openqa.grid.internal.GridRegistry;
import org.openqa.grid.internal.TestSession;
import org.openqa.grid.internal.listeners.TestSessionListener;
import org.openqa.grid.selenium.proxy.DefaultRemoteProxy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExtendedProxy extends DefaultRemoteProxy  implements TestSessionListener
{

    public ExtendedProxy(RegistrationRequest request, GridRegistry registry) {
        super(request, registry);
    }


    @Override
    public void beforeCommand(TestSession session, HttpServletRequest request,
                              HttpServletResponse response) {
        System.out.println("****** SWTESTACADEMY *****");
        System.out.println("Selenium Extending Grid - Before Command");
        System.out.println("Method " +request.getMethod());
        System.out.println("getRequestURI " +request.getRequestURI());
        System.out.println("Session "+session.toString());


    }


    @Override
    public void afterCommand(TestSession session, HttpServletRequest request,
                              HttpServletResponse response) {
        System.out.println("****** SWTESTACADEMY *****");
        System.out.println("Selenium Extending Grid - After Command");
    }

    @Override
    public void beforeSession(TestSession session){
        System.out.println("****** SWTESTACADEMY *****");
        System.out.println("Selenium Extending Grid - Before Session");
        System.out.println("Internal key "+session.getInternalKey());


    }

    @Override
    public void afterSession(TestSession session){
        System.out.println("****** SWTESTACADEMY *****");
        System.out.println("Selenium Extending Grid - After Session");


    }


}
