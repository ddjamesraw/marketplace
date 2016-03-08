package by.marketplace.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMvcBootstrap implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		//Register root context configuration
		AnnotationConfigWebApplicationContext rootContext = 
				new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringMvcRootContextConfiguration.class);
		container.addListener(new ContextLoaderListener(rootContext));
		
		//Register servlet context configuration
		AnnotationConfigWebApplicationContext servletContext = 
				new AnnotationConfigWebApplicationContext();
		servletContext.register(SpringMvcServletContextConfiguration.class);
		
		//Register Spring dispatcher servlet
		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"springDispatcher", new DispatcherServlet(servletContext)
		);
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}

}
