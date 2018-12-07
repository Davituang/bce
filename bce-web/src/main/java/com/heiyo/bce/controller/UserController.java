package com.heiyo.bce.controller;

import com.heiyo.bce.model.ResultModel;
import com.heiyo.bce.model.User;
import com.heiyo.bce.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/web/v1")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/bce/user/{id}")
    public User getUser(
            @PathVariable("id") Long id){
        User user = userService.get(id);
        logger.info("查询到的用户："+user.toString());
        return user;
    }


    public ResultModel uploadFile(MultipartFile file){
        String originalFilename = file.getOriginalFilename();

        return null;
    }

}
