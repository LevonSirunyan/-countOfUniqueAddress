package am.springbatch.repository;

import am.springbatch.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(value = "SELECT count(da.addressValue )FROM (SELECT DISTINCT a.address_value as addressValue FROM unique_addresses.address a) da", nativeQuery = true)
    long countOfUniqAddresses();
}
