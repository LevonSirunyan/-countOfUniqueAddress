package am.springbatch.service;

import am.springbatch.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public long getCountOfUniqueAddresses(){
        return addressRepository.countOfUniqAddresses();
    }
}
