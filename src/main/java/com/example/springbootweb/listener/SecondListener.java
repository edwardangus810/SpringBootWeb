package com.example.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 整合Listener方式二
 */
public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Second....Listener...Init......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

    }
}
