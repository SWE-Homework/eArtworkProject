package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.RoleUser;
import com.artwork.online.eartwork.model.UserAccount;
import com.artwork.online.eartwork.repository.UserAccountRepository;
import com.artwork.online.eartwork.service.UserAccountService;
import org.apache.catalina.filters.ExpiresFilter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.iterableWithSize;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@RunWith(SpringRunner.class)
@WebMvcTest(UserAccountController.class)
public class UserAccountControllerTest {

   @MockBean
    private UserAccountService userAccountService;
    @MockBean
    private UserAccountRepository userAccountRepository;
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        List<UserAccount> userAccounts = Arrays.asList(
                new UserAccount("Bisrat","Kidane", "bsur91@gmail.com",
                        "admin12345", "active",
                        Arrays.asList(RoleUser.Admin,RoleUser.Customer)),
                new UserAccount("Akile","Afwerki", "afie@gmail.com",
                        "customer12345", "notactive",
                        Arrays.asList(RoleUser.Customer))

        );
        userAccounts.get(0).setUserAccountId(1);
        Mockito.when(userAccountService.getAllUserAccounts()).thenReturn(userAccounts);




    }



        @Test
        public void testGetAllUserAccounts() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/eartwork/api/useraccount/list").accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$",hasSize(2))).andDo(print());
        }


        @Test
    public void testAddNewUserAccount() throws Exception {

        UserAccount userAccount1= new UserAccount("Bsr","Kidan", "bsr91@gmail.com",
                "admin123456", "active",
                Arrays.asList(RoleUser.Admin,RoleUser.Customer));
        Mockito.when(userAccountService.createNewUserAccount(userAccount1)).thenReturn(userAccount1);
        UserAccount result = userAccountService.createNewUserAccount(userAccount1);
        assertEquals(userAccount1, result);

    }

    @Test
    public void getUserAccountByEmail() {

    }

    @Test
    public void updateBook() {

    }

    @Test

    public void deleteUserAccount() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("eartwork/api/useraccount/delete/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.message").value("user1 has been deleted"))
                .andDo(print());
    }
}