package org.zs.boot.autoconfigure.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleAutoConfigurationTests {

	private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
			.withConfiguration(AutoConfigurations.of(ExampleAutoConfiguration.class));

	/**
	 * Expects the {@link org.springframework.context.ApplicationContext
	 * ApplicationContext} to fail to load since {@link ExampleAutoConfiguration}
	 * requires
	 */
	@Test
	void contextFails() {
		contextRunner.run(context -> assertThat(context).hasFailed());
	}

}
