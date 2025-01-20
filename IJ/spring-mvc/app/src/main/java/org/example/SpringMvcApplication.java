package org.example;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringMvcApplication {
    public static void main(String[] args) throws LifecycleException {
        // Create Tomcat instance
        Tomcat tomcat = new Tomcat();

        // Configure Tomcat server
        tomcat.setPort(8080);
        tomcat.getConnector(); // Initialize connector

        // Add web app context
        tomcat.addWebapp("", System.getProperty("user.dir") + "/src/main/webapp");

        System.out.println("Starting Tomcat...");
        tomcat.start();
        tomcat.getServer().await();
    }
}
