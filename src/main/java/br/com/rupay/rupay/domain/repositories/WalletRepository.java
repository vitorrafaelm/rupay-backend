package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
