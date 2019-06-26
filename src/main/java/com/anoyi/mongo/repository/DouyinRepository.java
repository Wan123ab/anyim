package com.anoyi.mongo.repository;

import com.anoyi.bean.DouyinUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DouyinRepository extends MongoRepository<DouyinUser, String> {

}
