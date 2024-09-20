package io.andrelucas.vechicleroutemanager;

import java.util.List;

public record RouteRequest(String name, List<String> stops) {}