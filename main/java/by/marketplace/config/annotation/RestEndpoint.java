package by.marketplace.config.annotation;

import java.lang.annotation.*;

import org.springframework.stereotype.Controller;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
public @interface RestEndpoint {
	String value() default "";
}
