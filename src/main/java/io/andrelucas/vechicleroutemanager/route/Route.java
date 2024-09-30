package io.andrelucas.vechicleroutemanager.route;

import io.andrelucas.vechicleroutemanager.vehicle.stop.Station;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
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
    private String name;

    @Field
    private String vehicleId;

    @Field
    private List<Station> stations;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public List<Station> getStops() {
        return stations;
    }

    public void setStops(List<Station> stations) {
        this.stations = stations;
    }
}
