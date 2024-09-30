package io.andrelucas.vechicleroutemanager.route;

import org.springframework.stereotype.Service;

@Service
public class CreateRoute {

    private final RouteRepository routeRepository;

    public CreateRoute(final RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public void execute(final RouteRequest request){
        var route = new Route();
        route.setStops(request.stations());
        route.setName(request.name());
        route.setVehicleId(request.vehicleId().toString());

        routeRepository.save(route);

    }
}
