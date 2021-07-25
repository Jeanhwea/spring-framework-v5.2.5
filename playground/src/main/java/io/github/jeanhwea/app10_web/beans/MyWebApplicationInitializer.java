package io.github.jeanhwea.app10_web.beans;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Component
public class MyWebApplicationInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    // Load Spring web application configuration
    AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
    // ac.setServletContext(servletContext);
    ac.register(WebConfig.class);
    ac.refresh();

    // Create and register the DispatcherServlet
    DispatcherServlet servlet = new DispatcherServlet(ac);
    ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
    registration.setLoadOnStartup(1);
    registration.addMapping("/hello");
  }
}
