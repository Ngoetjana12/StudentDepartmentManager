package org.mecerintered.studentdepartmentmanager.dto;

public record StudentRequest(
        String firstName,
        String lastName,
        String email,
        Long departmentId
) {
}
