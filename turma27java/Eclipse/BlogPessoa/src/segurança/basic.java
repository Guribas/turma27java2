package  br.org.generation.blogpessoal.security ;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.context.annotation.Bean ;
import  org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder ;
import  org.springframework.security.config.annotation.web.builders.HttpSecurity ;
import  org.springframework.security.config.annotation.web.configuration.EnableWebSecurity ;
import  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter ;
import  org.springframework.security.config.http.SessionCreationPolicy ;
import  org.springframework.security.core.userdetails.UserDetailsService ;
import  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder ;
import  org.springframework.security.crypto.password.PasswordEncoder ;


@EnableWebSecurity
public  class  BasicSecurityConfig  extends  WebSecurityConfigurerAdapter {

	@Autowired
	private  UserDetailsService userDetailsService;

	@Sobrepor
	protected  void  configure ( AuthenticationManagerBuilder  auth ) lan�a  Exception {
		auth . userDetailsService (userDetailsService);
		
		auth . inMemoryAuthentication ()
		.withUser ( " root " )
		.password (passwordEncoder () . encode ( " root " ))
.authorities 		( " ROLE_USER " );
	
	}

	@Feij�o
	public  PasswordEncoder  passwordEncoder () {
		retornar  novo  BCryptPasswordEncoder ();
	}

	@Sobrepor
	protected  void  configure ( HttpSecurity  http ) lan�a  Exception {
		http . authorizeRequests ()
		.antMatchers ( " / usuarios / logar " ) . permitAll ()
		.antMatchers ( " / usuarios / cadastrar " ) . permitAll ()
		.anyRequest () . autenticado ()
		.e () . httpBasic ()
		.e () . sessionManagement ()
		.sessionCreationPolicy ( SessionCreationPolicy . SEM ESTADOS )
		.e () . cors ()
		.e () . csrf () . desativar ();
	}
}
