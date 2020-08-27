package demo.springboot.springdatarest.dao;

import demo.springboot.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Spring Data JPA implementation (Minimal coding)
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
