package io.andrelucas.vechicleroutemanager.station;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document
public class Station {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private Coordinate coordinate;

    @Field
    private String externalId;

    public Station(String name, Coordinate coordinate) {
        this.externalId = UUID.randomUUID().toString();
        this.name = name;
        this.coordinate = coordinate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getExternalId() {
        return externalId;
    }
}
