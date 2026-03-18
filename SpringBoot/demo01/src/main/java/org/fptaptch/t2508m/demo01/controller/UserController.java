package org.fptaptch.t2508m.demo01.controller;

import org.fptaptch.t2508m.demo01.entity.User;
import org.fptaptch.t2508m.demo01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private IUserService userService;
    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }
    @PostMapping ("/login")

    public boolean login(@RequestBody User u) {
        try {
            User user = this.userService.login(u.getUsername(), u.getPassword());
            if (user != null&&user.getUsername()!=null) {
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
              return false;
        }
    }
}
