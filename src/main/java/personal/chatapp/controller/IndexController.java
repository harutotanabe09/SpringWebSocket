package personal.chatapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** indexコントローラー */
@Controller
public class IndexController {

  @GetMapping("/")
  public String index(Model model) {
    return "index";
  }
}
