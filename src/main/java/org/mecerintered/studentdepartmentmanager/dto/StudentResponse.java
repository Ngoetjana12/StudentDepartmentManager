package org.mecerintered.studentdepartmentmanager.dto;

public record StudentResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        Long departmentId,
        String departmentName

) {
}
