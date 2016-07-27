package com.xtyang.common.controller;

import com.xtyang.common.model.User;
import com.xtyang.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by yangxiaoting on 2016/07/27.
 */

@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list_json", method = RequestMethod.GET)
    @ResponseBody
    public List<User> list_json(){
        return this.userService.list();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(Map<String, Object> model, @PathVariable int id){
        model.put("person", this.userService.show(id));
        return "users/show";
    }
}
