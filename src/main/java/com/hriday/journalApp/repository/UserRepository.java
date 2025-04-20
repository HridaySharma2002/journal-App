package com.hriday.journalApp.repository;

import com.hriday.journalApp.entity.JournalEntry;
import com.hriday.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String userName);
}
