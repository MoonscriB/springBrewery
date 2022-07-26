package microServicesPractice.sFGuru.springBrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import microServicesPractice.sFGuru.springBrewery.web.model.BeerDto.BeerStyleEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;
    private BeerStyleEnum beerStyle;

    @Positive
    private Long upc;
}
