package com.zhsw.securitydemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Author: zhengliang
 * @Description: 用户管理
 * @Date: 2019/12/10 10:40
 */
@RestController
public class UserController {
    @GetMapping("/user1")
    public Object user1(Principal principal){
        return principal;
    }
    @GetMapping("/user2")
    public Object user2(Authentication authentication){
        return authentication;
    }
    @GetMapping("/user3")
    public Object user3(HttpServletRequest httpServletRequest){
        return httpServletRequest.getUserPrincipal();
    }
    @GetMapping("/user4")
    public Object user4(){
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
