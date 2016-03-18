package by.marketplace.web.controller;

import java.util.Date;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.RedirectView;

import by.marketplace.logic.User;
import by.marketplace.logic.UserImpl;
import by.marketplace.logic.UserService;
import by.marketplace.web.form.UserRegistrationForm;

@Controller
@RequestMapping("admin")
public class AdminController 
{
	@Inject UserService userService;
	@Inject ViewResolver viewResolver;

	@RequestMapping(value = "/")
	public View home(Map<String, Object> model) {
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/user/addrandom")
	public View addRandomUser(Map<String, Object> model) {
		User user = new UserImpl();
		user.setCity("CITY: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setEmail("EMAIL: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setPhone("PHONE: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setRegdate(new Date(System.currentTimeMillis()));
		userService.save(user);
		model.put("status", "Добавил случайного пользователя в БД");
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/user/action/register", 
			method = RequestMethod.POST)
	public View registerUser(Map<String, Object> model, @RequestParam
			(name = "userForm", required = false) UserRegistrationForm form) {
		
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/dashboard")
	public String dashboard(Map<String, Object> model,
			@RequestParam(name="status", required = false) String status) {
		model.put("status", status);
		return "/admin/dashboard";
	}
	
	@RequestMapping(value = "/user/list")
	public String userList(Map<String, Object> model) {
		model.put("users", userService.getAll());
		return "/admin/user/list";
	}
	
	@RequestMapping(value = "/user/new")
	public String userRegistrationPage(Map<String, Object> model) {
		return "/admin/user/registration";
	}
}
