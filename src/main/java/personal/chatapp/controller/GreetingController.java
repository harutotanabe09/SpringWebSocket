package personal.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import personal.chatapp.entity.Message;
import personal.chatapp.entity.Response;
import personal.chatapp.service.GreetingService;

/**
 * トピック用のコントローラー
 */
@Controller
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Response greeting(Message message) throws Exception {
        Thread.sleep(1000);
        greetingService.save(message);
        return new Response(
                HtmlUtils.htmlEscape(message.getName())
                        + " : "
                        + HtmlUtils.htmlEscape(message.getMessage()));
    }
}
