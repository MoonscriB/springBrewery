package microServicesPractice.sFGuru.springBrewery.web.service;

import lombok.extern.slf4j.Slf4j;
import microServicesPractice.sFGuru.springBrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplementation implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Death Valley")
                .beerStyle("Triple IPA")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
