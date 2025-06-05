package com.gcs.FilMasters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;
import com.gcs.FilMasters.application.CreateMovieUseCase;

@SpringBootApplication
public class FilMastersApplication {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "");
		SpringApplication.run(FilMastersApplication.class, args);

	}
}
