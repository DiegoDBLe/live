package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter // Getters
@Setter // Setters
@AllArgsConstructor  // Construtores
@NoArgsConstructor  // Construtor vazio
@EqualsAndHashCode // HasCode
@Builder // Melhor maneira de criar objeto sem instanciar
@Entity



// Todas as anotações acima poderia ser substituida por @Data ou @Value
public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

}
