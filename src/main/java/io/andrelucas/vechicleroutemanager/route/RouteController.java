package io.andrelucas.vechicleroutemanager.route;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class RouteController {

    private final CreateRoute createRoute;

    public RouteController(final CreateRoute createRoute) {
        this.createRoute = createRoute;
    }

    @PostMapping
    public ResponseEntity<Route> createRoute(@RequestBody RouteRequest request) {

        createRoute.execute(request);

        return ResponseEntity.ok().build();
    }
}
