package io.andrelucas.vechicleroutemanager.route;

import io.andrelucas.vechicleroutemanager.vehicle.stop.Stop;

import java.util.List;
import java.util.UUID;

public record RouteRequest(String name, List<Stop> stops, UUID vehicleId) {}