package io.andrelucas.vechicleroutemanager;

import org.springframework.stereotype.Service;

@Service
public class CreateRoute {

    private final RouteRepository routeRepository;

    public CreateRoute(final RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public void execute(final RouteRequest request){
        var route = new Route();
        route.setStops(request.stops());
        route.setName(request.name());

        routeRepository.save(route);
    }
}
