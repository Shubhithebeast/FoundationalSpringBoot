package com.shubh.springbootTut;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MySQLDB implements DataBase{

    @Override
    public void saveUser(String user) {
        System.out.println("User " + user + " saved successfully in MySQl DB.");
    }
}
