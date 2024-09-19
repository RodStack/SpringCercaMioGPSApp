package com.rodgps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodgps.models.PointOfInterest;
import com.rodgps.repository.PointOfInterestRepository;

@SpringBootApplication
public class RodGpsApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(RodGpsApplication.class, args);
    }
    
    @Autowired
    PointOfInterestRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new PointOfInterest("Cafeteria", 27L, 12L));
		repository.save(new PointOfInterest("Farmacia", 31L, 18L));
		repository.save(new PointOfInterest("Heladeria", 15L, 12L));
		repository.save(new PointOfInterest("Floreria", 19L, 21L));
		repository.save(new PointOfInterest("Pub", 12L, 8L));
		repository.save(new PointOfInterest("Supermercado", 23L, 6L));
		repository.save(new PointOfInterest("Sandwicheria", 28L, 2L));		
	}
    
}
