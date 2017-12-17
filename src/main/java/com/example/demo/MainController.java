package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ilyasov Damir
 */
@Controller
public class MainController {
    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
