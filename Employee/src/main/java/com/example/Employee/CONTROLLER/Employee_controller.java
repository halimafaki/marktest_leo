package com.example.Employee.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.model.employee;
import com.example.Employee.repository.Employee_repo;


@RestController
@RequestMapping("/Employee")
@CrossOrigin
public class Employee_controller {
     @Autowired
     Employee_repo E_repo;
     
     @PostMapping("")
    public ResponseEntity<employee> newLicense(@RequestBody employee lc){
        employee newLicense_Application = E_repo.save(new employee(lc.getId(),lc.getFirstName(),lc.getLastName(),lc.getEmail()));

        return new ResponseEntity<>(newLicense_Application, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll(){
        List<employee> employee = E_repo.findAll();
     
        return new ResponseEntity<List<Employee>>(HttpStatus.OK);
    }

     @GetMapping("/{id}")
    public ResponseEntity<employee> getById(@PathVariable("id")int id){
        java.util.Optional<employee> employee = E_repo.findById(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }

        return null; 
    }

     @DeleteMapping("/{id}")
    public void deleteLicense(@PathVariable Integer id){
        E_repo.deleteById(id);
    }

    @PutMapping("")
    public employee updateLicense(@RequestBody employee newemployee){
        return E_repo.save(newemployee);
    }
    

    
}
