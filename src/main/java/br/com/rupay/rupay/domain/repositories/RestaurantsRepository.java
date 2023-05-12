package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurant, Long> {
}
