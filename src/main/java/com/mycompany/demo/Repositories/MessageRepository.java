package com.mycompany.demo.Repositories;

//import com.example.simple_twitter.domain.Message;
//import com.example.simple_twitter.domain.User;
import com.mycompany.demo.domain.Message;
import com.mycompany.demo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// Create the Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

    Page<Message> findAll(Pageable pageable);

    Page<Message> findByTag(String tag, Pageable pageable); // поиск в БД по тэгу

    @Query("from Message m where m.author = :author")
    Page<Message> findByUser(Pageable pageable, @Param("author") User author);
}
