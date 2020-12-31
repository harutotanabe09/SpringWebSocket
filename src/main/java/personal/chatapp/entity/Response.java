package personal.chatapp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
  private String content;

  public Response(String content) {
    this.content = content;
  }
}
