package com.artwork.online.eartwork;

import com.artwork.online.eartwork.model.RoleUser;
import com.artwork.online.eartwork.model.UserAccount;
import com.artwork.online.eartwork.service.UserAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EartworkApplicationTests {
    @Autowired
    private UserAccountService userAccountService;

    @Test
    public void contextLoads() {
        UserAccount userAccount= new UserAccount();
        userAccount.setFirstName("Bisrat");
        userAccount.setLastName("Kidane");
        userAccount.setEmail("bsur91@gmail.com");
        userAccount.setPassword("admin12345");
        userAccount.setLoginStatus("");
        userAccount.setRoleUsers(Arrays.asList(RoleUser.Admin,RoleUser.Customer));
        userAccountService.createNewUserAccount(userAccount);

        UserAccount userAccount1= new UserAccount();
        userAccount1.setFirstName("Akile");
        userAccount1.setLastName("Afwerki");
        userAccount1.setEmail("aki@gmail.com");
        userAccount1.setPassword("customer1234");
        userAccount1.setLoginStatus("");
        userAccount1.setRoleUsers(Arrays.asList(RoleUser.Customer));
        userAccountService.createNewUserAccount(userAccount1);
    }

}
