package com.xw.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		//普通启动
		SpringApplication.run(EurekaApplication.class, args);

		//输入profile启动
		/*System.out.println("请输入profile");
		Scanner sc=new Scanner(System.in);
		final String profile = sc.nextLine();
		new SpringApplicationBuilder(EurekaApplication.class).profiles(profile).run(args);
		sc.close();*/

		//输入端口启动
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入端口号");
		String port=sc.nextLine();
		new SpringApplicationBuilder(ServiceProvider1Application.class).properties("server.port="+port).run(args);
		sc.close();*/
	}
}
