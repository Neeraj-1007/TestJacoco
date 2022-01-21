package com.test.springsonarCube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSonarCubeApplication {

	public static void main(String[] args) {
		System.out.println("use command clean org:jacoco:jacoco-maven-plugin:prepare-agent install");
		System.out.println(" use command sonar:sonar -Dsonar.login=genereated token from sonarqube");
		SpringApplication.run(SpringSonarCubeApplication.class, args);
	}

}
