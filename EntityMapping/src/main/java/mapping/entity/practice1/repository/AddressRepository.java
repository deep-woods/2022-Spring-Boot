package mapping.entity.practice1.repository;

import mapping.entity.practice1.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
