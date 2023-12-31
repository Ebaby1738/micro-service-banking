package com.kokoro.loanservice;

import com.kokoro.loanservice.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.kokoro.loanservice.controller") })
@EnableJpaRepositories("com.kokoro.loanservice.repository")
@EntityScan("com.kokoro.loanservice.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "kokoro Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ebenezer Irene",
						email = "kokorobank@gmail.com",
						url = "https://www.kokorobank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.kokorobank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "kokorobank Loans microservice REST API Documentation",
				url = "https://www.kokorobank.com/swagger-ui.html"
		)
)
@EnableConfigurationProperties(value = LoansContactInfoDto.class)
public class LoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

}
