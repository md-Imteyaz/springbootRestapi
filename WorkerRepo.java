package com.SpringbootRestApi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SpringbootRestApi.Entity.Worker;
@RepositoryRestResource(path="members")
public interface WorkerRepo extends JpaRepository<Worker, Long> {

	List<Worker> findByFirstName(@Param("firstName") String firstName);
}
