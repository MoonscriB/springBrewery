package microServicesPractice.sFGuru.springBrewery.web.mappers;

import microServicesPractice.sFGuru.springBrewery.domain.Customer;
import microServicesPractice.sFGuru.springBrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
