package personal.chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import personal.chatapp.entity.Message;
import personal.chatapp.entity.Response;

/** トピック用のコントローラー */
@Controller
public class GreetingController {

  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Response greeting(Message message) throws Exception {
    Thread.sleep(1000);
    return new Response(
        HtmlUtils.htmlEscape(message.getName())
            + " : "
            + HtmlUtils.htmlEscape(message.getMessage()));
  }
}
