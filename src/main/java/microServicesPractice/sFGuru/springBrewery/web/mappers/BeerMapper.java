package microServicesPractice.sFGuru.springBrewery.web.mappers;

import microServicesPractice.sFGuru.springBrewery.domain.Beer;
import microServicesPractice.sFGuru.springBrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
