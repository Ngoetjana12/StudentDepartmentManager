package org.mecerintered.studentdepartmentmanager.service;

import org.mecerintered.studentdepartmentmanager.dto.StudentRequest;
import org.mecerintered.studentdepartmentmanager.dto.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> findAll();

    StudentResponse findById(Long id);

    List<StudentResponse> findByDepartment(Long departmentId);
}
