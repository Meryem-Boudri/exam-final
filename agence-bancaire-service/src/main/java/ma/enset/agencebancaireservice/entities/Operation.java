package ma.enset.agencebancaireservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import ma.enset.agencebancaireservice.enums.OperationType;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private Double amount;

    private String chequeNumber;

    private OperationType type; // DEBIT, CREDIT, CERTIFICIATION_CHEQUE

    private String description;
}
