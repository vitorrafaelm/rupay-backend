package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.Meals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsRepository extends JpaRepository<Meals, Long> {
}
