package com.SpringbootRestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringbootRestApi.Entity.Worker;
import com.SpringbootRestApi.Repository.WorkerRepo;

@SpringBootApplication
public class SpringBootRestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@Autowired
	WorkerRepo workerrepo;

	@Override
	public void run(String... args) throws Exception {
		Worker worker = Worker.builder().firstName("Imteyaz").lastName("junaidi").email("Imteyaz@123").build();
		workerrepo.save(worker);

		Worker worker2 = Worker.builder().firstName("imroj").lastName("ahmed").email("imroz@123").build();
		workerrepo.save(worker2);

		Worker worker3 = Worker.builder().firstName("lolaha").lastName("korepo").email("korepo.lola@123").build();
		workerrepo.save(worker3);

		Worker worker4 = Worker.builder().firstName("radha").lastName("rani").email("rani.radha@123").build();
		workerrepo.save(worker4);
	}
}
