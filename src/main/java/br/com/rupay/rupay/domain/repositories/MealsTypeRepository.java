package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.MealsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsTypeRepository extends JpaRepository<MealsType, Long> {
}
