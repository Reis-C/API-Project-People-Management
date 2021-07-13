package com.digitalinnovationone.personapi.personapi.entity;

import com.digitalinnovationone.personapi.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto incremento do número Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //cadastro será obrigatório
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
