package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.UserAccount;
import com.artwork.online.eartwork.service.UserAccountService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"}, allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/useraccount", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserAccountController {
    private UserAccountService userAccountService;

    public UserAccountController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @GetMapping(value = {"/list"})
    public List<UserAccount> userAccountList() {
        return userAccountService.getAllUserAccounts();
    }

    @PostMapping(value = "/add")
    public UserAccount addNewUserAccount(@Valid @RequestBody UserAccount userAccount) {
        return userAccountService.createNewUserAccount(userAccount);
    }

    @GetMapping(value = "/get/{email}")
    public Optional<UserAccount> getUserAccountByEmail(@PathVariable String email) {
        return userAccountService.getUserAccountByEmail(email);
    }
    @PutMapping(value = "/update/{userAccountId}")
    public UserAccount updateBook(@Valid @RequestBody UserAccount editedUserAccount, @PathVariable Long userAccountId) {
        return userAccountService.updateUserAccountById(editedUserAccount,userAccountId);
    }
    @DeleteMapping(value = "/delete/{userAccountId}")
    public void deleteUserAccount(@PathVariable Long userAccountId) {
        userAccountService.deleteUserAccountById(userAccountId);
    }

}
