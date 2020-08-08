package com.initmrd.aliddns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class AliddnsApplication implements EnvironmentAware {
    static String domain;
    static String accessKeyId;
    static String accessKeySecret;

    public static void main(String[] args) {

        SpringApplication.run(AliddnsApplication.class, args);
        DDNS ddns = new DDNS();
        ddns.run(domain, accessKeyId, accessKeySecret);
    }

    @Override
    public void setEnvironment(Environment environment) {
        domain = environment.getProperty("domain");
        accessKeyId = environment.getProperty("accessKeyID");
        accessKeySecret = environment.getProperty("accessKeySecret");
    }
}
