package com.shubh.springbootTut;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    DataBase dataBase;
    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void saveUser(String user){
        System.out.println("User " + user + " saved successfully.");
        dataBase.saveUser(user);
    }
}
