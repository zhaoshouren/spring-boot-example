package org.zs.boot.autoconfigure.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(ExampleConfigurationPropertiesUsingRecord.class)
public class ExampleAutoConfiguration {

    @Bean
    ExampleBean exampleBean(ExampleConfigurationPropertiesUsingRecord configProps) {
        return new ExampleBean(configProps);
    }

    @Getter
    @RequiredArgsConstructor
    public static class ExampleBean {
        private final ExampleConfigurationPropertiesUsingRecord configProps;
    }
}
