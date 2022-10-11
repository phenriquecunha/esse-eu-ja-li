package learning.eejl.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_tb")
@Data
public class User {
  @Id
  @GeneratedValue
  Integer id;

  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  String email;

  @Column(nullable = false)
  String pass;

  @Column(nullable = false)
  int points=0;

}
