package by.marketplace.config;

import java.nio.charset.StandardCharsets;

import javax.inject.Inject;

import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@ComponentScan(
		basePackages = "by.marketplace",
		excludeFilters = 
		@ComponentScan.Filter({Controller.class, ControllerAdvice.class})
)
public class RootContextConfiguration {
//	
//	@Inject
//	private MessageSource messageSource;
//	
//	@Inject LocalValidatorFactoryBean localValidatorFactoryBean;
//	
//	@Bean
//	public MethodValidationPostProcessor methodValidationPostProcessor() throws ClassNotFoundException {
//		MethodValidationPostProcessor processor = 
//				new MethodValidationPostProcessor();
//		processor.setValidator(this.localValidatorFactoryBean);
//		return processor;
//	}
//
//	@Bean
//	public LocalValidatorFactoryBean localValidatorFactoryBean() 
//			throws ClassNotFoundException {
//		LocalValidatorFactoryBean validator = 
//				new LocalValidatorFactoryBean();
//		validator.setProviderClass(HibernateValidator.class);
//		validator.setValidationMessageSource(this.messageSource);
//		return validator;
//	}
//	
//	@Bean
//	public MessageSource messageSource() {
//		ReloadableResourceBundleMessageSource messageSource = 
//				new ReloadableResourceBundleMessageSource();
//		messageSource.setCacheSeconds(-1);
//		messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
//		messageSource.setBasenames(
//				"/WEB-INF/i18n/titles", "/WEB-INF/i18n/messages",
//				"/WEB-INF/i18n/errors", "/WEB-INF/i18n/validation"
//		);
//		return messageSource();
//	}
}
