package com.liuhongyin.mybatispluslearn;

import com.liuhongyin.mybatispluslearn.mapper.UserMapper;
import com.liuhongyin.mybatispluslearn.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> users = userMapper.selectList(null);

        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);

    }
}
