package by.marketplace.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import by.marketplace.config.annotation.RestEndpoint;
import by.marketplace.config.annotation.RestEndpointAdvice;

@Configuration
@EnableWebMvc
@ComponentScan(
		basePackages = "by.marketplace",
		useDefaultFilters = false,
		includeFilters = 
		@ComponentScan.Filter({RestEndpoint.class, RestEndpointAdvice.class}))
public class RestServletContextConfiguration extends WebMvcConfigurerAdapter {
//
//	@Inject ObjectMapper objectMapper;
//	@Inject Marshaller marshaller;
//	@Inject Unmarshaller unmarshaller;
//	@Inject SpringValidatorAdapter validator;
//	
//	@Override
//	public void configureMessageConverters(
//			List<HttpMessageConverter<?>> converters) {
//		converters.add(new SourceHttpMessageConverter<>());
//		
//		MarshallingHttpMessageConverter xmlConverter = 
//				new MarshallingHttpMessageConverter();
//		xmlConverter.setSupportedMediaTypes(Arrays.asList(
//				new MediaType("application","xml"),
//				new MediaType("text", "xml")
//		));
//		xmlConverter.setMarshaller(this.marshaller);
//		xmlConverter.setUnmarshaller(this.unmarshaller);
//		converters.add(xmlConverter);
//		
//		MappingJackson2HttpMessageConverter jsonConverter = 
//				new MappingJackson2HttpMessageConverter();
//		jsonConverter.setSupportedMediaTypes(Arrays.asList(
//				new MediaType("application", "json"),
//				new MediaType("text", "json")
//		));
//		jsonConverter.setObjectMapper(this.objectMapper);
//		converters.add(jsonConverter);
//	}
//	
//	@Override
//	public void configureContentNegotiation(
//			ContentNegotiationConfigurer configurer) {
//		
//		configurer.favorPathExtension(false).favorParameter(false)
//			.ignoreAcceptHeader(false)
//			.defaultContentType(MediaType.APPLICATION_JSON);
//	}
//	
//	@Override
//	public Validator getValidator() {
//		return this.validator;
//	}
//	
//	@Bean
//	public LocaleResolver localeResolver() {
//		return new AcceptHeaderLocaleResolver();
//	}
}
