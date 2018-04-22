package spring.custom.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
@Controller
public class HomepageController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "/home";
    }

    @GetMapping({"/admin"})
    public String admin(){
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
