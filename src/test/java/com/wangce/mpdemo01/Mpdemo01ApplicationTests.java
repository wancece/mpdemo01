package com.wangce.mpdemo01;

import com.wangce.mpdemo01.entities.User;
import com.wangce.mpdemo01.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static net.sf.jsqlparser.parser.feature.Feature.insert;

@SpringBootTest
class Mpdemo01ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);

        System.out.println(users);
    }
    @Test
    void add(){
        User user = new User();
        user.setAge(19);
        user.setName("李老师");
        user.setEmail("111@135.com");
//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
    @Test
    void update(){
        User user = new User();
        user.setAge(35);
        user.setName("王策123");
        user.setEmail("138@13ss5.com");
        user.setId(1401007801911754754L);
        int i = userMapper.updateById(user);
        System.out.println(i);
    }
    @Test
    void delete(){
        int i = userMapper.deleteById(1400996723467325442L);
        System.out.println(i);
    }
}
