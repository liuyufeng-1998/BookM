package cn.edu.guet;

import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")

public class SpringTest {
    @Autowired
    IUserService userService;

    @Test
    public void testViewUserById(){
        User user=userService.viewUserById("000002");
        System.out.println(user.getUsername());
        System.out.println(user.getPhone());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
    }

}