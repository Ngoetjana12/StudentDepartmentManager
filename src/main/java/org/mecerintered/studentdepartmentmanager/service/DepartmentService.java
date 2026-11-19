package org.mecerintered.studentdepartmentmanager.service;

import org.mecerintered.studentdepartmentmanager.dto.DepartmentRequest;
import org.mecerintered.studentdepartmentmanager.dto.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest request);

    List<DepartmentResponse> findAll();

    DepartmentResponse findById(Long id);
}
