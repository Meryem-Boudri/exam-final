package ma.enset.bankcentraleservice;

import ma.enset.bankcentraleservice.entities.BankAgency;
import ma.enset.bankcentraleservice.repositories.BankAgencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankAgencyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAgencyServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAgencyRepository bankAgencyRepository){
        return args -> {
            BankAgency agency1 = BankAgency.builder()
                    .name("Agence Casablanca")
                    .city("Casablanca")
                    .url("http://casablanca-bank.com/api")
                    .build();

            BankAgency agency2 = BankAgency.builder()
                    .name("Agence Rabat")
                    .city("Rabat")
                    .url("http://rabat-bank.com/api")
                    .build();

            BankAgency agency3 = BankAgency.builder()
                    .name("Agence Marrakech")
                    .city("Marrakech")
                    .url("http://marrakech-bank.com/api")
                    .build();

            bankAgencyRepository.save(agency1);
            bankAgencyRepository.save(agency2);
            bankAgencyRepository.save(agency3);




        };
    }

}
