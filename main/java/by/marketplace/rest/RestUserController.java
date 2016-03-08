package by.marketplace.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import by.marketplace.config.ApplicationConfiguration;
import by.marketplace.logic.User;
import by.marketplace.logic.UserService;

@Controller
public class RestUserController {
	private static final ApplicationContext appContext = 
		new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	
	@ResponseBody
	@RequestMapping(value = "/user", params = {"id"})
	public static String getUsers(@RequestParam("id") int id) {
		UserService service = (UserService) appContext.getBean("userService");
		return ((User) service.get(122)).toString();
	}
}
