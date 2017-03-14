package com.discoverorg.starters.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Import({
        DataSourceAutoConfiguration.class
})
public class UserControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUserById() throws Exception {
        this.mockMvc.perform(get("/users/51300"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":51300,\"state\":2,\"username\":\"jonathan.coombs@discoverorg.com\",\"firstName\":\"Jonathan\",\"lastName\":\"Coombs\",\"email\":\"jonathan.coombs@discoverorg.com\",\"phone\":\"360-524-2501\",\"activeTo\":1527836400000,\"activeFrom\":1401606000000}"));
    }
}
