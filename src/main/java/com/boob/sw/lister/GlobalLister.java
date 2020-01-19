package com.boob.sw.lister;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class GlobalLister implements ServletContextListener {

    @Value("${project.teamPre}")
    private String teamPre;
    @Value("${project.teamAft}")
    private String teamAft;


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("teamPre", teamPre);
        sce.getServletContext().setAttribute("teamAft", teamAft);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("teamPre");
        sce.getServletContext().removeAttribute("teamAft");
    }
}
