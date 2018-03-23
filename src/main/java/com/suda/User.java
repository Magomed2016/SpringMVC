package com.suda;

import javax.validation.constraints.Size;

public class User {

   // @Size(min = 6, message = "ты чо апух?")
    private String name;

   // @Size(min = 5, max = 10, message = "Пароль должен быть от 5 до 10 символов")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
