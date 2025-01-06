package ma.enset.bankcentraleservice.repositories;

import ma.enset.bankcentraleservice.entities.BankAgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAgencyRepository extends JpaRepository<BankAgency,Long> {
}
