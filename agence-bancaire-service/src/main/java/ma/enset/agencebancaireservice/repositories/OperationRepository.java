package ma.enset.agencebancaireservice.repositories;

import ma.enset.agencebancaireservice.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {
}
