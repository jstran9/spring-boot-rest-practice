package guru.springframework.springrestclientexamples.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    /**
     * this acts as a factory so we request the builder from the Spring framework.
     */
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
