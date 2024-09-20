package io.andrelucas.vechicleroutemanager;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;


@Configuration
@EnableMongock
@EnableMongoAuditing
public class MongoConfiguration {

//    @Bean // Replicas configuration
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
