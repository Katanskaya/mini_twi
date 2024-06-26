package com.mycompany.demo.service;

//import com.example.simple_twitter.domain.User;
//import com.example.simple_twitter.repositories.MessageRepository;
//import com.example.twi.domain.Message;
import com.mycompany.demo.Repositories.MessageRepository;
import com.mycompany.demo.domain.Message;
import com.mycompany.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Page<Message> messageList(Pageable pageable, String filter) {
        if (filter != null && !filter.isEmpty()) {
            return messageRepository.findByTag(filter, pageable);
        } else {
            return messageRepository.findAll(pageable);
        }
    }

    public Page<Message> messageListForUser(Pageable pageable, User currentUser, User author) {
        return messageRepository.findByUser(pageable, author);
    }
}