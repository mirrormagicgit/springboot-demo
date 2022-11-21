package com.quest.springboot_demo.repos;

import com.quest.springboot_demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
