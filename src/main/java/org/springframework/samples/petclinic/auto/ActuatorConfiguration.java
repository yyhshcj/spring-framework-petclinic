package org.springframework.samples.petclinic.auto;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorConfiguration {

    @Bean
    public HealthIndicator sampleHealthIndicator() {
        return Health.up()
            .withDetail("info", "Petclinic is Healthy!")
            ::build;
    }

    @Bean
    public InfoContributor provideSampleInfos() {
        return builder ->
            builder
                .withDetail("app-title", "Actuator Available on Petclinic Application!");

    }
}
