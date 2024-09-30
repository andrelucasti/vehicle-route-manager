package io.andrelucas.vechicleroutemanager.vehicle.stop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class StationHandler {

    @Bean(name = "station-consumer")
    public Consumer<Station> stationConsumer() {
        return System.out::println;
    }
}
