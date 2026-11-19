package org.mecerintered.studentdepartmentmanager.repositories;

import org.mecerintered.studentdepartmentmanager.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
