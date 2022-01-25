package com.example.demo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListener implements ServletContextListener {
    @Override

    public void contextDestroyed(ServletContextEvent arg0) {

        // TODO Auto-generated method stub

    }

    @Override

    public void contextInitialized(ServletContextEvent arg0) {

        System.out.println("SecondListener..init.....");

    }

}
