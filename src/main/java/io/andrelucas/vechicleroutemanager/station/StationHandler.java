package io.andrelucas.vechicleroutemanager.station;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;


@Service
public class StationHandler {
    private final StationRepository stationRepository;

    public StationHandler(final StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Bean(name = "station-consumer")
    public Consumer<StationMessage> stationConsumer() {
        return stationMessage -> {
            System.out.println("Station received: " + stationMessage);
            final var station = new Station(stationMessage.name(), stationMessage.coordinate());
            stationRepository.save(station);
        };
    }
}
