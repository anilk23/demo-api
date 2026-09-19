package com.iwks.demoapi.services;

import com.iwks.demoapi.models.Employee;
import com.iwks.demoapi.models.Gender;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.*;

@Service
@Scope("singleton")
public class EmployeeService {
    private List<Employee> employees;
    public EmployeeService() {
        employees = new ArrayList<>();
        Employee e1 = Employee.builder()
                .id(UUID.randomUUID()).name("KEmp")
                .birthDate(LocalDate.of(1999,10,20))
                .email("kemp@mail.com")
                .gender(Gender.Male)
                .salary(20000.0).build();
        employees.add(e1);
        employees.add( Employee.builder()
                .id(UUID.randomUUID()).name("PEmp")
                .email("pemp@mail.com")
                .birthDate(LocalDate.of(1992,07,05))
                .gender(Gender.Female)
                .salary(30000.0).build());
        employees.add( Employee.builder()
                .id(UUID.randomUUID()).name("YEmp")
                        .email("yemp@mail.com")
                .birthDate(LocalDate.of(1994,04,25))
                .gender(Gender.Male)
                .salary(35000.0).build());
        employees.add( Employee.builder()
                .id(UUID.randomUUID()).name("PTEmp")
                .email("ptemp@mail.com")
                .birthDate(LocalDate.of(1995,01,20))
                .gender(Gender.Female)
                .salary(31000.0).build());
        employees.add( Employee.builder()
                .id(UUID.randomUUID()).name("LHEmp")
                .email("lhemp@mail.com")
                .birthDate(LocalDate.of(1996,10,15))
                .gender(Gender.Male)
                .salary(34000.50).build());
        employees.add( Employee.builder()
                .id(UUID.randomUUID()).name("UEmp")
                .email("uemp@mail.com")
                .birthDate(LocalDate.of(1991,02,02))
                .gender(Gender.Female)
                .salary(34000.89).build());
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public Optional< Employee> getEmployee(UUID id) {
        Optional<Employee> employee = employees.stream().filter(e -> e.getId().equals(id)).findFirst();
        return employee;
    }

    public void addEmployee( Employee employee) {

        employees.add(employee);
    }

    public void deleteEmployee(UUID id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }
}
