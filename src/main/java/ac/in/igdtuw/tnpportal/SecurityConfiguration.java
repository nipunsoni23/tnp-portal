package ac.in.igdtuw.tnpportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
	@Autowired
	  MongoUserDetailsService userDetailsService;
	
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers( "/public/**").permitAll()
            .antMatchers("/static/**").permitAll()
            .antMatchers("/images/**").permitAll()
            .antMatchers("/alumni.html").permitAll()
            .antMatchers("/contact-us.html").permitAll()
            .antMatchers("/courses-offered.html").permitAll()
            .antMatchers("/faculty&research.html").permitAll()
            .antMatchers("/history.html").permitAll()
            .antMatchers("/home.html").permitAll()
            .antMatchers("/policy.html").permitAll()
            .antMatchers("/procedure.html").permitAll()
            .antMatchers("/students.html").permitAll()
            .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login.html")
                .successForwardUrl("/")
                .failureUrl("/login-error.html")
                .permitAll()
                .and()
            .logout()
            	.invalidateHttpSession(true)
                .permitAll()
        		.and()
        	.csrf().disable();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//            .withUser("user")
//            .password("{noop}pass") // Spring Security 5 requires specifying the password storage format
//            .roles("USER");
        auth.userDetailsService(userDetailsService);
    }
}


