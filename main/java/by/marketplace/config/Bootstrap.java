package by.marketplace.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Bootstrap implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		//Root context configuration
		AnnotationConfigWebApplicationContext rootContext = 
				new AnnotationConfigWebApplicationContext();
		rootContext.register(RootContextConfiguration.class);
		container.addListener(new ContextLoaderListener(rootContext));
		
		//Servlet context configuration
		AnnotationConfigWebApplicationContext servletContext = 
				new AnnotationConfigWebApplicationContext();
		servletContext.register(WebServletContextConfiguration.class);
		
		//Register Spring dispatcher servlet
		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"springDispatcher", new DispatcherServlet(servletContext)
		);
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		//REST context configuration
		AnnotationConfigWebApplicationContext restContext = 
				new AnnotationConfigWebApplicationContext();
		restContext.register(RestServletContextConfiguration.class);
		
		//Register REST servlet
		DispatcherServlet servlet = new DispatcherServlet(restContext);
		//Process HTTP OPTIONS method to support discovery
		servlet.setDispatchOptionsRequest(true);
		dispatcher = container.addServlet("springRestDispatcher", servlet);
		dispatcher.setLoadOnStartup(2);
		dispatcher.addMapping("/services/Rest/*");
	}

}
