package com.example.sobes_boot;

import com.example.sobes_boot.model.*;
import com.example.sobes_boot.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class SobesBootApplication {
    CompanyRepository cr;
    CatRepository catRepository;
    DogRepository dogRepository;
    ItemRepository itemRepository;
    CartRepository cartRepository;
    @PersistenceContext
	EntityManager em;

	public SobesBootApplication(CompanyRepository cr, CatRepository catRepository, DogRepository dogRepository, ItemRepository itemRepository, CartRepository cartRepository) {
		this.cr = cr;
		this.catRepository = catRepository;
		this.dogRepository = dogRepository;
		this.itemRepository = itemRepository;
		this.cartRepository = cartRepository;
	}


	@PostConstruct
	void Test() {
		Cart cart = new Cart();
		Item item1 = new Item();
		Item item2 = new Item();
		cart.setItems(new HashSet<>(Arrays.asList(new Item[]{item1, item2})));
		cartRepository.save(cart);
		cart.getItems().remove(item1);
		cartRepository.save(cart);

		Company company = new Company();
		company.setSex(Sex.HZ);
		company.setContact(Arrays.asList(new ContactPerson[]{new ContactPerson(), new ContactPerson()}));
    	cr.save(company);
		cr.save(new Company());
		catRepository.save(new Cat1());
		catRepository.save(new Cat());
		catRepository.save(new Cat());
		dogRepository.save(new Dog());
		dogRepository.save(new Dog());
		Dog dog = dogRepository.findAll().get(1);
		System.out.println(dog.getId());
		System.out.println(catRepository.existsById(3));
		List<Animal> list = em.createQuery("select a from Animal a").getResultList();
		System.out.println(list);

	}

    public static void main(String[] args) {
        SpringApplication.run(SobesBootApplication.class, args);

    }

}
