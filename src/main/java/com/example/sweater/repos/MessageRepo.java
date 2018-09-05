package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// // CRUD refers Create, Read, Update, Delete

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}