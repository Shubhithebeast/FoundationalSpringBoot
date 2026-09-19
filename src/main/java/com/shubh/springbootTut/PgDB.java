package com.shubh.springbootTut;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class PgDB implements DataBase{

    @Override
    public void saveUser(String user) {
        System.out.println("User " + user + " saved successfully in postgres.");
    }
}
