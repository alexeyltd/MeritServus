package controller;


import meritservus.MeritServusApplication;
import meritservus.model.Customer;
import meritservus.repository.CustomerRepository;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MeritServusApplication.class)
@SpringBootTest
public class CustomerControllerTest {

	@Autowired
	private CustomerRepository repository;

	Customer mickey;
	Customer minnie;
	Customer pluto;

	@Before
	public void setUp() {

		mickey = new Customer("Mickey Mouse");
		minnie = new Customer("Minnie Mouse");
		pluto = new Customer("Pluto");

		repository.deleteAll();
		repository.save(Arrays.asList(mickey, minnie, pluto));
	}


	@Test
	public void canFetchMickey() {

		String mickeyName = mickey.getCustomer();

		when().
				get("/api/customers/{name}", mickeyName)
				.then()
				.statusCode(HttpStatus.OK).
				body("name", Matchers.is("Mickey Mouse")).
				body("name", Matchers.is(mickeyName));
	}

	@Test
	public void canFetchAll() {
		when().
				get("/customers").
				then()
				.statusCode(HttpStatus.OK)
				.body("name", Matchers.hasItems("Mickey Mouse", "Minnie Mouse", "Pluto"));
	}

	@Test
	public void canDeletePluto() {
		String plutoName = pluto.getCustomer();

		when()
				.delete("/api/customers/{name}", plutoName)
				.then()
				.statusCode(HttpStatus.NOT_FOUND);
	}

}
