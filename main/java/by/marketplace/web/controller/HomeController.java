package by.marketplace.web.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Inject ViewResolver viewResolver;
	
	@RequestMapping(value = "/")
	public View adimnPanel(Map<String, Object> model) {
		return new RedirectView("/admin/dashboard", true);
	}
}
