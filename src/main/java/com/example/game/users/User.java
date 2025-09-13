package com.example.game.users;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false, length = 50, columnDefinition = "varchar(50)")
  private String username;

  @Column(unique = true, nullable = false, length = 100, columnDefinition = "varchar(100)")
  private String email;

  @Column(nullable = false, length = 60, columnDefinition = "char(60)")
  private String password;

  public User() {}

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
}
