package com.artwork.online.eartwork.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Transactional
public class UserAccount {

    /**
     * Default constructor
     */
    public UserAccount() {
    }

    String userProfilePic;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userAccountId;

    @Column(nullable=false)
    @NotBlank(message = "* First Name is required")
    private String firstName;
    @Column(nullable=false)
    @NotBlank(message = "* Last Name is required")
    private String lastName;
    @Column(nullable=false)
    @NotBlank(message = "* Email is required")
    private String email;

    @Column(nullable=false)
    @Size(min=8)
    @NotBlank(message = "* password is required")
    private String password;


    @Column
    private String loginStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "roleUser")
    private RoleUser roleUser;


    public long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
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

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }
}
