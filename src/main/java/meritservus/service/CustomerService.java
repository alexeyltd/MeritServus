package meritservus.service;

import meritservus.model.Customer;

import java.util.List;

public interface CustomerService {

	void addCustomer(Customer customer);

	void deleteCustomer(Customer customer);

	void updateCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomer(String name);

}
