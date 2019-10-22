package com.artwork.online.eartwork.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RoleUser {
    Customer(1,"Customer"),
    Admin(2,"Admin");


    private final int role_Id;
    private String name;

    RoleUser(int role_Id, String role_name) {
        this.role_Id = role_Id;
        this.name = role_name;
    }
}
