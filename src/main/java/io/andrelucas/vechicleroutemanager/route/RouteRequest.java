package io.andrelucas.vechicleroutemanager.route;

import io.andrelucas.vechicleroutemanager.vehicle.stop.Station;

import java.util.List;
import java.util.UUID;

public record RouteRequest(String name, List<Station> stations, UUID vehicleId) {}