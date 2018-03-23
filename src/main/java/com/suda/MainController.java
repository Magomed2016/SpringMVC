package com.suda;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String view(){
        return "index";
    }

    @GetMapping(value = "/test")
    public ModelAndView main(){
        return new ModelAndView("login","user", new User());
    }


    @PostMapping(value = "/check-user")
    public ModelAndView chekUser(@ModelAttribute("user") User user){
        System.out.println(user.getName()+user.getPassword());
        return new ModelAndView("main","user",user);
    }





}
