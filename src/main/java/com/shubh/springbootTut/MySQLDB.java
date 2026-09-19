package com.shubh.springbootTut;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLDB implements DataBase{

    @Override
    public void saveUser(String user) {
        System.out.println("User " + user + " saved successfully in MySQl DB.");
    }
}
