package personal.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import personal.chatapp.service.GreetingService;

/**
 * indexコントローラー
 */
@Controller
public class IndexController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("messages", greetingService.findAll());
        return "index";
    }
}
