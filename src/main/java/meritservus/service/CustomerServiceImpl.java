package meritservus.service;


import meritservus.model.Customer;
import meritservus.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addCustomer(final Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(final Customer customer) {
		customerRepository.delete(customer);
	}

	@Override
	public void updateCustomer(final Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(String name) {
		return customerRepository.getByCustomer(name);
	}
}
