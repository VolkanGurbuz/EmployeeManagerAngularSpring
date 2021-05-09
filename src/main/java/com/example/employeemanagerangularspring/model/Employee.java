package com.example.employeemanagerangularspring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long id;

  private String name;
  private String email;
  private String jobTitle;
  private String phone;
  private String imageUrl;

  @Column(nullable = false, updatable = false)
  private String employeeCode;

  public Employee(
      String name,
      String email,
      String jobTitle,
      String phone,
      String imageUrl,
      String employeeCode) {
    this.name = name;
    this.email = email;
    this.jobTitle = jobTitle;
    this.phone = phone;
    this.imageUrl = imageUrl;
    this.employeeCode = employeeCode;
  }
}
