package com.artwork.online.eartwork;

import com.artwork.online.eartwork.model.RoleUser;
import com.artwork.online.eartwork.model.UserAccount;
import com.artwork.online.eartwork.service.UserAccountService;
import org.testng.annotations.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest
public class EartworkApplicationTests {
    @Autowired
    private UserAccountService userAccountService;

    @Test
    public void contextLoads() {
    }

}
