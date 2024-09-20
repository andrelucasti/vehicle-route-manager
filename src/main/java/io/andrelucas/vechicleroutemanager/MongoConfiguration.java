package io.andrelucas.vechicleroutemanager;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableMongock
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
