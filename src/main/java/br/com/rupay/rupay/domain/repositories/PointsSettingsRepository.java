package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.PointsSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsSettingsRepository extends JpaRepository<PointsSettings, Long> {
}
