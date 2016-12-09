package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;




@SuppressWarnings("deprecation")
@SpringBootApplication
public class SpringBootCaveApplication /*extends SpringBootServletInitializer*/  {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCaveApplication.class, args);
		
	}
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootCaveApplication.class);
	}*/
	/*@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		
		String[] defs = {"/WEB-INF/tiles.xml"};
		tilesConfigurer.setDefinitions(defs);
		
		return tilesConfigurer;
	}
	*/
	
	
	/*@Bean
	public UrlBasedViewResolver tilesViewResolver(){
	
		UrlBasedViewResolver  tilesViewResolver= new UrlBasedViewResolver();
		
		tilesViewResolver.setViewClass(TilesView.class);
		
		return tilesViewResolver;
	}*/
		
	@Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { "/WEB-INF/tiles.xml" });
        configurer.setCheckRefresh(true);
        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver resolver = new TilesViewResolver();
        resolver.setViewClass(TilesView.class);
        return resolver;
    }
}
