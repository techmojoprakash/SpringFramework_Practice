/*
 * Without interface we are implementing inversion of control concepts
 * Medical student and Engg student is two classes 
 * In StudentConfig class Configure and bean created with bean name
 * from main method we can call from ApplicationConfigApplicationContext - get bean method by passing params
 * 
 */

package com.spring_ioc.project;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringIocNewApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringIocNewApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		EnggStudent engg_student = context.getBean("enggstudent",EnggStudent.class);
		engg_student.studentVersion();
		context.close();
	}

}
