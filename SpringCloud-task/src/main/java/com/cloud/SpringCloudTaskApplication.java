package com.cloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
	@Bean
	public TaskScheduler taskScheduler() {
		return new TaskScheduler();
	}
	
	public class TaskScheduler implements CommandLineRunner{

		@Override
		public void run(String... strings) throws Exception {
			
			System.out.println("Parameter length: " +strings.length);
			
			String lane_number = strings[1];
			String noofitems = strings[2];
			String o_name = strings[3];
			
			System.out.println("Lane number:"+lane_number+ " Number of Items:"+noofitems+" and Name of person:"+o_name);		
		}
		
	}
}
