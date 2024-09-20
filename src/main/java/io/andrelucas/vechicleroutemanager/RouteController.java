package io.andrelucas.vechicleroutemanager;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }


    public record RouteRequest(List<Geolocation> stops) {}
    @PostMapping
    public ResponseEntity<Route> createRoute(@RequestBody RouteRequest request) {

        Route route = new Route();
        route.setStops(request.stops());

        Route save = routeRepository.save(route);

        return ResponseEntity.ok(save);
    }

    @GetMapping
    public ResponseEntity<List<Route>> getRoute() {
        return ResponseEntity.ok(routeRepository.findAll());
    }
}
