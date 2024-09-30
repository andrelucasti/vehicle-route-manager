package io.andrelucas.vechicleroutemanager.station;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StationRepository extends MongoRepository<Station, String> {
}
