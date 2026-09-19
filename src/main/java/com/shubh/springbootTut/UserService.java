package com.shubh.springbootTut;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    DataBase dataBase;

    Configuration configuration;
    public UserService(DataBase dataBase, Configuration configuration) {
        this.dataBase = dataBase;
        this.configuration = configuration;
    }
    public void saveUser(String user){
        System.out.println("User " + user + " saved successfully in " + configuration.getType() + " DB.");
        dataBase.saveUser(user);
    }
}
