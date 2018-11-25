package com.taiji.demo09.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



@Component
@Data
@ConfigurationProperties(prefix = "user")

public class User {

    private String name;
    private Integer age;
    private String gender;

}
