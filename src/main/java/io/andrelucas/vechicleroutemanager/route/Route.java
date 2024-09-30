package io.andrelucas.vechicleroutemanager.route;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Document
public class Route {
    public static final String COLLECTION_NAME = "route";

    @Id
    private String id;

    @Field
    private String externalId;

    @Field
    private String name;

    @Field
    private String vehicleId;

    @Field
    private List<StationSequence> stations;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Route(final String name,
                 final List<StationSequence> stations,
                 final UUID vehicleId) {

        this.externalId = UUID.randomUUID().toString();
        this.name = name;
        this.vehicleId = vehicleId.toString();
        this.stations = stations;
    }

    public String getId() {
        return id;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getName() {
        return name;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public List<StationSequence> getStations() {
        return stations;
    }
}
