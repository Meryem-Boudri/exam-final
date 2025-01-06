package ma.enset.commercantservice.repositories;

import ma.enset.commercantservice.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeRepository extends JpaRepository<Cheque,Long> {
}
