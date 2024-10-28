package org.zs.boot.autoconfigure.example;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * Example {@link ConfigurationProperties} using a {@link Record} to which makes
 * it immutable. I also leverages the {@link Validated} annotation from Spring
 * to make the field {@code required} required by using the {@link NotBlank}
 * validation constraint
 */
@Validated
@ConfigurationProperties("zs.example")
public record ExampleConfigurationPropertiesUsingRecord(@NotBlank String required, String optional) {

}
