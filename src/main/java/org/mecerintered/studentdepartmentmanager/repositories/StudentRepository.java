package org.mecerintered.studentdepartmentmanager.repositories;

import org.mecerintered.studentdepartmentmanager.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDepartmentId(Long departmentId);
}
