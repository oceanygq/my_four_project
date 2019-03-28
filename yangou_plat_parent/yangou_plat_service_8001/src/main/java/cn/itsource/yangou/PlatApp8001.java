package cn.itsource.yangou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatApp8001.class);
    }
}
