package io.andrelucas.vechicleroutemanager.route;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {
}
