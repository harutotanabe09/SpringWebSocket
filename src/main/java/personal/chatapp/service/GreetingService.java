package personal.chatapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
        String query = "SELECT * from messages";
        List<Message> persons = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Message.class));
        return persons;
    }

    // データを追加する
    public Message save(Message massage) {
        // 実行する SQL を組み立てる
        SqlParameterSource param = new BeanPropertySqlParameterSource(massage);
        SimpleJdbcInsert insert =
                new SimpleJdbcInsert(jdbcTemplate)
                        .withTableName("messages")
                        .usingGeneratedKeyColumns("id");
        // SQL を実行
        insert.executeAndReturnKey(param);
        return massage;
    }
}
