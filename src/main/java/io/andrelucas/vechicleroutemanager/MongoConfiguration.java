package io.andrelucas.vechicleroutemanager;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import io.mongock.runner.springboot.EnableMongock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
@EnableMongock
public class MongoConfiguration {

//    @Bean
//    public MongoTransactionManager transactionManager(MongoTemplate mongoTemplate) {
//        TransactionOptions transactionOptions = TransactionOptions.builder()
//                .readPreference(ReadPreference.primary())
//                .writeConcern(WriteConcern.MAJORITY.withJournal(true))
//                .readConcern(ReadConcern.MAJORITY)
//                .build();
//
//        return new MongoTransactionManager(mongoTemplate.getMongoDatabaseFactory(), transactionOptions);
//    }
}
