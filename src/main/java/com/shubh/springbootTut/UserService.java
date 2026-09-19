package com.shubh.springbootTut;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    DataBase dataBase;

    @Value("${db.type}")
    String property;
    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void saveUser(String user){
        System.out.println("User " + user + " saved successfully in " + property + " database.");
        dataBase.saveUser(user);
    }
}
