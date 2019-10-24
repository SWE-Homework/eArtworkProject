package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.RoleUser;
import com.artwork.online.eartwork.model.ShoppingCart;
import com.artwork.online.eartwork.model.UserAccount;
import com.artwork.online.eartwork.service.UserAccountService;
import com.artwork.online.eartwork.service.impl.FileStorageService;
import com.artwork.online.eartwork.service.impl.FileUploadResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201", "http://localhost"}, allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/useraccount", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserAccountController {
    private UserAccountService userAccountService;
    private FileStorageService fileStorageService;

    public UserAccountController(UserAccountService userAccountService,FileStorageService fileStorageService) {
        this.userAccountService = userAccountService;
        this.fileStorageService = fileStorageService;
    }

    @GetMapping(value = {"/login"})
    public UserAccount userAccountList(@RequestBody UserAccount userLog) {
        UserAccount user = userAccountService.getUserAccountByEmail(userLog.getEmail()).orElse(null);
        if(user != null)if(user.getPassword().equals(userLog.getPassword())) return user;
        return null;
    }

    @GetMapping(value = {"/list"})
    public List<UserAccount> userAccountList() {
        return userAccountService.getAllUserAccounts();
    }

    @PostMapping(value = "/add")
    public UserAccount addNewUserAccount(@Valid @RequestBody UserAccount userAccount) {
        UserAccount userAccount1 = userAccountService.getUserAccountByEmail(userAccount.getEmail()).orElse(null);
        if(userAccount1==null){

        userAccount.setLoginStatus(".");
        userAccount.setRoleUser(RoleUser.CUSTOMER);
        userAccount.setActive(true);
        userAccount.setShoppingCart(new ShoppingCart());
        System.out.println("User About to be save : "+userAccount.toString());
        return userAccountService.createNewUserAccount(userAccount);
        }else return null;
    }

    @PostMapping(value = "/add/update/{email}")
    public UserAccount addUploadUserPic( @PathVariable String email ,
                                        @RequestBody MultipartFile file) {
        System.out.println("----------------------------"+email+"---------------------");
        try {
            UserAccount userAccount = userAccountService.getUserAccountByEmail(email).orElse(null);
            String fileName = fileStorageService.storeFile(file);
            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/api/downloadFile/")
                    .path(fileName)
                    .toUriString();
            FileUploadResponse fileUploadResponse = new FileUploadResponse(fileName, fileDownloadUri,
                    file.getContentType(), file.getSize());
            userAccount.setUserProfilePic(fileUploadResponse.getFileDownloadUri());
            userAccountService.createNewUserAccount(userAccount);
            System.out.println("----------------------------" + fileUploadResponse.getFileDownloadUri() + "---------------------");
            return userAccount;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
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
