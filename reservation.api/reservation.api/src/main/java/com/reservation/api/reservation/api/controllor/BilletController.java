package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.reservation.api.reservation.api.model.Billet;
import com.reservation.api.reservation.api.service.BilletService;

@RestController
public class BilletController {
	
	@Autowired 
	
	private BilletService billetService ;
	
	@GetMapping("/billet") // get Mapping nom de l'entité correspondant à celui de la table
	/**
	 * Read - Get all employees
	 * @return - An Iterable object of Employee full filled
	 */
	
	public Iterable<Billet> getBillets(){
		
		return billetService.getAllBillet(); // 
			
	}
	 @GetMapping("/billet")
	 
	 public Optional<Billet> getBilletId(@PathVariable Integer id){
		 
		 return this.billetService.getBilletById(id);
		 
		 /*
			 * Create - Add a new Billet         // appel a la méthode saveBillet ou 
			 *                                   // addBillet pour  creer un nouveu billet
			 * @param employee An object Billet
			 * @return The Billet object saved
			 */ 
	 }
		 @PostMapping("/billet")
		 
		 public Billet postBillets (@RequestBody Billet billet) { // 
			 return billetService.addBillet(billet); //  
		 }
		 
		 
		 
		 
		 /**
		  * Delete - Delete an employee
		  * @param id - The id of the employee to delete
		  */
		 @DeleteMapping("/billet/{id}")
		 public void deleteBillet(@PathVariable("id") final Integer id) {
			 
			 billetService.deleteBilletById(id);
		 }
		 
		    
	 }

/*@GetMapping("/employee/{id}")
public Employee getEmployee(@PathVariable("id") final Long id) {
	Optional<Employee> employee = employeeService.getEmployee(id);
	if(employee.isPresent()) {
		return employee.get();
	} else {
		return null;
	}
}
	
/**
 * Delete - Delete an employee
 * @param id - The id of the employee to delete
 */
/*
@DeleteMapping("/employee/{id}")
public void deleteEmployee(@PathVariable("id") final Long id) {
	employeeService.deleteEmployee(id);
	*/	 


/*
package com.openclassrooms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    *//*
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
*/
