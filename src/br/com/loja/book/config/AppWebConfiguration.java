package br.com.loja.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.loja.book.controllers.HomeController;
import br.com.loja.book.daos.ProductDAO;

/**
 *
 * @author paulo
 */
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class , ProductDAO.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter{
    
    
    
@Bean
public InternalResourceViewResolver internalResourceViewResolver() {
    InternalResourceViewResolver resolver = 
                               new InternalResourceViewResolver();
    
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    
    return resolver;
    }
}