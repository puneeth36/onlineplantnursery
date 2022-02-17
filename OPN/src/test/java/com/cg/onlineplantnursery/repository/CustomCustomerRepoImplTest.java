package com.cg.onlineplantnursery.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineplantnursery.entity.Customer;


@SpringBootTest
class CustomCustomerRepoImplTest {

	@Mock
    ICustomerRepository repository;

    @Test
    void testGetCustomerById() {
        Customer actualCustomer = new Customer();
         Optional<Customer> output = Optional.of(actualCustomer); 
        when((repository.findById(1))).thenReturn(output);

        assertEquals(new Customer(), actualCustomer);

    }
 
    @Test
    void testGetAllCustomers() {

        List<Customer> actualOutput = new ArrayList<>();

        when(repository.findAll()).thenReturn(actualOutput);
        // verify
        assertIterableEquals(new ArrayList<Customer>(), actualOutput);
    }
 
   
    

}
