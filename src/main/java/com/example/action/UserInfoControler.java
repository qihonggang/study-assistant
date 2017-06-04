package com.example.action;

import com.example.domain.UserInfo;
import com.example.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yonyou on 4/06/2017.
 */
@RestController
public class UserInfoControler {
    @Autowired
    UserInfoRepository userInfoRepository;


    /**
     * 查询用户列表
     * @return
     */
    @GetMapping(value = "/users")
    public List<UserInfo> userList(){
        return userInfoRepository.findAll();
    }

    /**
     * 添加一名用户
     * @param age
     * @param email
     * @param qq
     * @param sex
     * @param userIcon
     * @param userName
     * @param userSign
     * @return
     */
    @PostMapping(value = "/users")
    public UserInfo addUser(@RequestParam("age") Integer age,
                            @RequestParam("email") String email,
                            @RequestParam("qq") String qq,
                            @RequestParam("sex") String sex,
                            @RequestParam("userIcon") String userIcon,
                            @RequestParam("userName") String userName,
                            @RequestParam("userSign") String userSign){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(age);
        userInfo.setEmail(email);
        userInfo.setQq(qq);
        userInfo.setSex(sex);
        userInfo.setUserIcon(userIcon);
        userInfo.setUserName(userName);
        userInfo.setUserSign(userSign);

        return userInfoRepository.save(userInfo);
    }

    /**
     * 查询一位用户
     * @param id
     * @return
     */
    @GetMapping(value = "/users/{id}")
    public UserInfo userFindOne(@PathVariable("id") Integer id){
        return userInfoRepository.findOne(id);
    }

    /**
     * 更新用户
     * @param id
     * @param age
     * @param email
     * @param qq
     * @param sex
     * @param userIcon
     * @param userName
     * @param userSign
     * @return
     */
    @PutMapping(value = "/users/{id}")
    public UserInfo userUpdate(@PathVariable("id") Integer id,
                               @RequestParam("age") Integer age,
                               @RequestParam("email") String email,
                               @RequestParam("qq") String qq,
                               @RequestParam("sex") String sex,
                               @RequestParam("userIcon") String userIcon,
                               @RequestParam("userName") String userName,
                               @RequestParam("userSign") String userSign){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setAge(age);
        userInfo.setEmail(email);
        userInfo.setQq(qq);
        userInfo.setSex(sex);
        userInfo.setUserIcon(userIcon);
        userInfo.setUserName(userName);
        userInfo.setUserSign(userSign);

        return userInfoRepository.save(userInfo);
    }

    /**
     * 删除用户
     * @param id
     */
    @DeleteMapping("/users/{id}")
    public void userDelete(@PathVariable("id") Integer id){
        userInfoRepository.delete(id);
    }

}
