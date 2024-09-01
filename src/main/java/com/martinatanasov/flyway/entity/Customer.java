package com.martinatanasov.flyway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @Column(updatable = false, nullable = false)
    private Integer id;

    @Column(length = 20)
    private String name;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(length = 50)
    private String email;
}
