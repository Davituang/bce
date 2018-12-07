package com.heiyo.bce.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BCDListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(BCDListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("bce is starting......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("bce is stopping......");
    }
}
