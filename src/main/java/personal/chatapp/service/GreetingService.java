package personal.chatapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import personal.chatapp.entity.Message;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // データの一覧を返す
    public List<Message> findAll() {
        // 実行する SQL を組み立てて実行
        String query = "SELECT * from public.messages";
        List<Message> message = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Message.class));
        return message;
    }
}
