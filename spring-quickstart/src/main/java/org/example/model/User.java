package org.example.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", columnDefinition = "int")
    private Integer id;

    @Column(name = "username", columnDefinition = "char")
    private String username;

    @Column(name = "password", columnDefinition = "char")
    private String password;
}
