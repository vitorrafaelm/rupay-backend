package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
