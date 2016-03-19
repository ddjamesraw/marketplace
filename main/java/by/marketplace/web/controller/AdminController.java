package by.marketplace.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.RedirectView;

import by.marketplace.logic.*;
import by.marketplace.web.form.DepositoryForm;
import by.marketplace.web.form.UserForm;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	@Inject UserService userService;
	@Inject DepositoryService depService;
	@Inject ViewResolver viewResolver;

	@RequestMapping(value = "/")
	public View home(Map<String, Object> model) {
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/user/addrandom")
	public View addRandomUser(Map<String, Object> model) {
		User user = userService.getRepository().getEmptyInstance();
		user.setCity("CITY: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setEmail("EMAIL: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setPhone("PHONE: "+String.valueOf(Math.round(Math.random()*10000)));
		user.setRegdate(new Date(System.currentTimeMillis()));
		userService.getRepository().save(user);
		model.put("status", "Добавил случайного пользователя в БД");
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/user/action/add")
	public View addUser(Map<String, Object> model, UserForm form) {
		User user = userService.getRepository().getEmptyInstance();
		user.setCity(form.getCity());
		user.setEmail(form.getEmail());
		user.setPhone(form.getPhone());
		user.setRegdate(new Date(System.currentTimeMillis()));
		try {
			userService.getRepository().save(user);
			model.put("status", "Создал нового пользователя.");
		} catch (Exception e) {
			e.printStackTrace();
			model.put("status", "Ошибка сохранения пользователя");
		}
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/depository/action/add")
	public View addDepository(Map<String, Object> model, DepositoryForm depForm) {
		Depository dep = depService.getRepository().getEmptyInstance();
		dep.setName(depForm.getName());
		try {
			depService.getRepository().save(dep);
			model.put("status", "Создал новый депозитарий");
		} catch (Exception e) {
			e.printStackTrace();
			model.put("status", "Ошибка сохранения депозитария");
		}
		return new RedirectView("/admin/dashboard", true);
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Map<String, Object> model,
			@RequestParam(name="status", required = false) String status) {
		
		model.put("status", status);
		return "/admin/dashboard";
	}
	
	@RequestMapping(value = "/user/list")
	public String userList(Map<String, Object> model) {
		model.put("users", userService.getRepository().getAll());
		
		return "/admin/user/list";
	}
	
	@RequestMapping(value = "/test")
	public String userCriteriaTest(Map<String, Object> model) {
		List<User> users = userService.getRepository()
				.<Integer>getByAttributeBetween("id", 301, 305);
		users.add(null);
		return null;
	}
	
	@RequestMapping(value = "/user/add")
	public String userRegistrationPage(Map<String, Object> model) {
		model.put("userForm", new UserForm());
		return "/admin/user/add";
	}
	
	@RequestMapping(value = "/depository/add")
	public String depRegistrationPage(Map<String, Object> model) {
		model.put("depForm", new DepositoryForm());
		return "/admin/depository/add";
	}
	
	@RequestMapping(value = "/depository/list")
	public String depList(Map<String, Object> model) {
		model.put("deps", depService.getRepository().getAll());
		return "/admin/depository/list";
	}
}
