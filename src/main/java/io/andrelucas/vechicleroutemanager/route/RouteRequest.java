package io.andrelucas.vechicleroutemanager.route;

import java.util.List;
import java.util.UUID;

public record RouteRequest(String name, List<StationSequence> stations, UUID vehicleId) {}