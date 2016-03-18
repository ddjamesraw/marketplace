package by.marketplace.web.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import by.marketplace.config.ApplicationConfiguration;
import by.marketplace.logic.User;
import by.marketplace.logic.UserServiceImpl;

@RestController
public class RestUserController {
	private static final ApplicationContext appContext = 
		new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	
	@RequestMapping(value = "/user", params = {"id"})
	public User getUser(@RequestParam("id") int id) {
		UserServiceImpl service = (UserServiceImpl) appContext.getBean("userService");
		return (User) service.get(122);
	}
}
