package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
}
