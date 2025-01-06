package ma.enset.bankcentraleservice.web;

import ma.enset.bankcentraleservice.entities.BankAgency;
import ma.enset.bankcentraleservice.repositories.BankAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bank-agencies")
public class BankAgencyController {

    @Autowired
    private BankAgencyRepository bankAgencyRepository;
    @GetMapping
    public List<BankAgency> getAllBankAgencies() {
        return bankAgencyRepository.findAll();
    }
}
