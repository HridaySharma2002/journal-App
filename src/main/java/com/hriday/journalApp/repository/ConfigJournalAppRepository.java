package com.hriday.journalApp.repository;

import com.hriday.journalApp.entity.ConfigJournalAppEntity;
import com.hriday.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
