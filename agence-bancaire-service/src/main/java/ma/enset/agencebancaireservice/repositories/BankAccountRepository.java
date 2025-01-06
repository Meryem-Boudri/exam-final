package ma.enset.agencebancaireservice.repositories;

import ma.enset.agencebancaireservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
