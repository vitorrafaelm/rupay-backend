package br.com.rupay.rupay.domain.repositories;

import br.com.rupay.rupay.domain.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsHistoryRepository extends JpaRepository<TransactionHistory, Long> {
}
