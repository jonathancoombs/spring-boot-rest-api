package com.discoverorg.starters.resources;

import com.discoverorg.core.entity.UserEntity;

import java.io.Serializable;
import java.util.Date;

public class UserResource implements Serializable{
    private Long id;
    private Byte state;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date activeTo;
    private Date activeFrom;

    public UserResource(UserEntity userEntity) {
        id = userEntity.getId();
        state = userEntity.getState();
        username = userEntity.getUsername();
        firstName = userEntity.getFirstName();
        lastName = userEntity.getLastName();
        email = userEntity.getEmail();
        phone = userEntity.getPhone();
        activeTo = userEntity.getActiveTo();
        activeFrom = userEntity.getActiveFrom();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getActiveTo() {
        return activeTo;
    }

    public void setActiveTo(Date activeTo) {
        this.activeTo = activeTo;
    }

    public Date getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(Date activeFrom) {
        this.activeFrom = activeFrom;
    }
}
