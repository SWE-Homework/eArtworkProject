package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.UserAccount;

import java.util.List;
import java.util.Optional;

public interface UserAccountService {
    UserAccount createNewUserAccount(UserAccount userAccount);
    List<UserAccount> getAllUserAccounts();
    Optional<UserAccount> getUserAccountByEmail(String email);
    UserAccount updateUserAccountById(UserAccount userAccount, Long userAccountId);
    void deleteUserAccountById(Long userAccountId);
    UserAccount getUserAccountById(long id);
    UserAccount updateUserAccount(UserAccount userAccount);
}
