package com.example.Task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

}
//    <mirrors>
//
//        <mirror>
//            <id>jboss-ga-mirror</id>
//            <mirrorOf>jboss-ga-repository</mirrorOf>
//            <url>https://maven.repository.redhat.com/techpreview/all</url>
//        </mirror>
//
//        <mirror>
//            <id>cmic-mirror</id>
//            <mirrorOf>CMIC</mirrorOf>
//            <url>http://continuousintegration:8081/nexus/content/groups/CMIC/</url>
//        </mirror>
//
//        <mirror>
//            <id>jboss-public-mirror</id>
//            <mirrorOf>jboss</mirrorOf>
//            <url>https://repository.jboss.org/nexus/content/groups/publicl</url>
//        </mirror>
//
//        <mirror>
//            <id>jboss-deprecated-mirror</id>
//            <mirrorOf>jboss-deprecated</mirrorOf>
//            <url>http://repository.jboss.org/nexus/content/repositories/deprecated/</url>
//        </mirror>
//
//    </mirrors>
