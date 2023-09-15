package com.project.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.entity.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private String ssn;

    private String name;

    private String surname;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDay;

    private String birthPlace;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String email;

    private boolean built_in;

    private String motherName;

    private String fatherName;

    private int studentNumber;

    private boolean isActive;

    private Boolean isAdvisor;

    private Long advisorTeacherId; // bu field studentlar icin eklendi

    private Gender gender;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UserRole userRole;

    // Not: Student-Info-LessonProgram-Meet
}
