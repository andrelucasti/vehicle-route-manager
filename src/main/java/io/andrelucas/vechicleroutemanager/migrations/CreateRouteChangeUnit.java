package io.andrelucas.vechicleroutemanager.migrations;

import io.andrelucas.vechicleroutemanager.Route;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeUnit(id="create-route-change", order = "0001", author = "andrelucas")
public class CreateRouteChangeUnit {

    @Execution
    public void beforeExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.createCollection(Route.COLLECTION_NAME);
    }

    @RollbackExecution
    public void rollbackExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.dropCollection(Route.COLLECTION_NAME);
    }
}
