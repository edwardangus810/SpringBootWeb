package com.example.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 整合Listener
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent event) {

    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Listener ...Init.....");
    }
}
