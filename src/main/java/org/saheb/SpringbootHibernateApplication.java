package org.saheb;

import org.saheb.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.saheb")
public class SpringbootHibernateApplication implements CommandLineRunner{
	@Autowired
	DataService dataService;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateApplication.class, args);
	}
	@Override
    public void run(String... arg0) throws Exception {
		System.out.println("inside get");
		dataService.getAllTeamPlayers(20);
	}

}
