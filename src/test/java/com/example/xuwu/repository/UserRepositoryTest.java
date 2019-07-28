package com.example.xuwu.repository;

import com.example.xuwu.ApplicationTests;
import com.example.xuwu.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findOne(){
        User user = userRepository.findOne(1L);
        Assert.assertNotNull(user);
        Assert.assertEquals("wali", user.getName());
    }

}