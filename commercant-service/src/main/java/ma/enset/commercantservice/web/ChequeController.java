package ma.enset.commercantservice.web;

import ma.enset.commercantservice.entities.Cheque;
import ma.enset.commercantservice.repositories.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cheques")
public class ChequeController {


    @Autowired
    private ChequeRepository chequeRepository;

    @GetMapping
    public List<Cheque> getAllCheques(){
        return chequeRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cheque> getChequeById(@PathVariable Long id) {
        return chequeRepository.findById(id)
                .map(cheque -> new ResponseEntity<>(cheque, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
