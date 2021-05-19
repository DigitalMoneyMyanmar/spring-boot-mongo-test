package com.wavemoney.appcommandcenter.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.wavemoney.appcommandcenter.model.*;

@Repository
public interface AppConfigRepository extends MongoRepository<AppConfig,String>{

	 @Query("{ 'app' : ?0 }")
	  List<AppConfig> findByApp(String app);
}
