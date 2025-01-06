package ma.enset.commercantservice;

import ma.enset.commercantservice.entities.Cheque;
import ma.enset.commercantservice.repositories.ChequeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommercantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommercantServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ChequeRepository chequeRepository) {
        return args -> {
            Cheque cheque1 = Cheque.builder()
                    .chequeNumber("122323")
                    .amount(10000.0)
                    .clientName("name")
                    .bankCode("dty3456")
                    .build();
            Cheque cheque2 = Cheque.builder()
                    .chequeNumber("122323")
                    .amount(10000.0)
                    .clientName("name")
                    .bankCode("dty3456")
                    .build();
            Cheque cheque3 = Cheque.builder()
                    .chequeNumber("122323")
                    .amount(10000.0)
                    .clientName("name")
                    .bankCode("dty3456")
                    .build();

            chequeRepository.save(cheque1);
            chequeRepository.save(cheque2);
            chequeRepository.save(cheque3);


        };
    }
}
