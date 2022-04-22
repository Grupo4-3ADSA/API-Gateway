package autg.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfiguration{
		
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}
//	@Bean
//	  public CorsWebFilter corsFilter() {
//	    org.springframework.web.cors.CorsConfiguration corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
//	    corsConfiguration.setAllowCredentials(true);
//	    corsConfiguration.addAllowedOrigin("*");
//	    corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"));
//	    corsConfiguration.addAllowedHeader("origin");
//	    corsConfiguration.addAllowedHeader("content-type");
//	    corsConfiguration.addAllowedHeader("accept");
//	    corsConfiguration.addAllowedHeader("authorization");
//	    corsConfiguration.addAllowedHeader("cookie");
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", corsConfiguration);
//	    return new CorsWebFilter(source);
//	  }

}
