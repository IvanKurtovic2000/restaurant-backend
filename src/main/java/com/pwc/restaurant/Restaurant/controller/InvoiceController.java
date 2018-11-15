package com.pwc.restaurant.Restaurant.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.restaurant.Restaurant.entities.Invoice;
import com.pwc.restaurant.Restaurant.repository.InvoiceRepository;

@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@GetMapping("/invoice")
	private List<Invoice> findAll() {
		return invoiceRepository.findAll();
	}
	
	@GetMapping("/invoice/{id}")
	public Invoice findInvoice(@PathVariable Long id) {
		Optional<Invoice> invoice = invoiceRepository.findById(id);
		return invoice.get();
	}
	
	@PostMapping("/invoice")
	public Invoice createInvoice(@RequestBody Invoice invoice) {
		return invoiceRepository.save(invoice);
	}
	
	@PutMapping("/invoice/{id}")
	public Invoice updateInvoice(@PathVariable Long id, @Valid @RequestBody Invoice invoice) {
		invoice.setId(id);
        return  invoiceRepository.save(invoice);
    }
	
	 @DeleteMapping("/invoice/{id}")
	 public void deleteInvoice(@PathVariable(name="id")Long id) {
		 invoiceRepository.deleteById(id);
		 System.out.println("Invoice Deleted Successfully");
	 }

}
