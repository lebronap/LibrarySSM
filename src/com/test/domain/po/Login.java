package com.test.domain.po;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("login")
public class Login implements Serializable{
    private Integer id;
    private Integer number;
    private String password;
    private String identity;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", number=" + number +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
