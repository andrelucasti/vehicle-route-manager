package io.andrelucas.vechicleroutemanager;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Document
public class Route {
    public static final String COLLECTION_NAME = "route";

    @Id
    private String id;

    @Field
    private List<Geolocation> stops;


    public List<Geolocation> getStops() {
        return stops;
    }

    public void setStops(List<Geolocation> stops) {
        this.stops = stops;
    }
}
