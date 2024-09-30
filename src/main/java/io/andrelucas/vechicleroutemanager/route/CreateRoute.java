package io.andrelucas.vechicleroutemanager.route;

import org.springframework.stereotype.Service;

@Service
public class CreateRoute {

    private final RouteRepository routeRepository;

    public CreateRoute(final RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public void execute(final RouteRequest request){
        var route = new Route(request.name(), request.stations(), request.vehicleId());
        routeRepository.save(route);
    }
}
