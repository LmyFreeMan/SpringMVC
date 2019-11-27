package com.web.demo.entity;


import org.hibernate.validator.constraints.NotEmpty;

public class User {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
  //  @NotEmpty(message="用户名不能为空")
     @NotEmpty(message = "{username.not.empty}")
    private String username;
   // @NotEmpty(message="手机号码不能为空")
    @NotEmpty(message = "{phone.not.empty}")
    private String phone;
}