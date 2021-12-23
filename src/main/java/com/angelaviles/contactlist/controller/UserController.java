package com.angelaviles.contactlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelaviles.contactlist.modals.User;
import com.angelaviles.contactlist.service.UserService;

import java.util.List;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public String list(Model modelo) {
    	
      List<User> users = userService.findAll();
      modelo.addAttribute("users", users);
      return "contactlist";
      
    }

    @GetMapping("/user/{nickname}")
    public String edit(@PathVariable("nickname") String nickname, Model model) {
     if (nickname != null && !nickname.equalsIgnoreCase("newuser") ) {
      model.addAttribute("user", userService.get(nickname));
     } else {
      model.addAttribute("user", new User());
     }
     
     return "user";
     
    }
    
    @PostMapping("/user")
    public String add(User persona, Model model) {
     userService.save(persona);
     return "redirect:/";
    }
    
    @GetMapping("/delete/{nickname}")
    public String delete(@PathVariable String nickname, Model model) {
     userService.delete(nickname);
    
     return "redirect:/";
    }

}
