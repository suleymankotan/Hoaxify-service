package com.suleyman.hoaxifywebservice.configuration.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@ConfigurationProperties(value = "verify-code")
public class VerifyCodeProperties {
    private Integer length;
    private Integer leftLimit;
    private Integer rightLimit;
}
