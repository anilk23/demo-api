package com.iwks.demoapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    private UUID id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Gender gender;
    private Double salary;
}
