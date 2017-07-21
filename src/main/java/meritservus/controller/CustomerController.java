package meritservus.controller;

import meritservus.model.Customer;
import meritservus.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	final static Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Customer> addEmployee(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		logger.debug("Added: " + customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateEmployee(@RequestBody Customer customer) {

		Customer currentCustomer = customerService.getCustomer(customer.getCustomer());
		if (currentCustomer == null) {
			logger.debug("Customer with id: " + customer.getId() + " does not exist");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else {
			customerService.addCustomer(currentCustomer);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getEmployee(@PathVariable("name") String name) {
		Customer customer = customerService.getCustomer(name);

		if (customer == null) {
			logger.debug("Customer with name: " + name + " does not exist");
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		logger.debug("Found customer: " + customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		if (customers.isEmpty()) {
			logger.debug("Customers do not exist");
			return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		}
		logger.debug("Found " + customers.size() + " customers");
		logger.debug(customers);
		logger.debug(Arrays.toString(customers.toArray()));
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("name") String name) {
		Customer customer = customerService.getCustomer(name);
		if (customer == null) {
			logger.debug("Customer with name: " + name + " does not exist");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else {
			customerService.deleteCustomer(customer);
			logger.debug("Customer with name: " + customer + " was deleted");
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}

}
