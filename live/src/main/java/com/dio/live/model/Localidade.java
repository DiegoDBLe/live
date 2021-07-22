package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Localidade {

    @Id
    private Long id;

    @ManyToOne
    // Ou Seja localidade pode ter varios niveis de acesso, essa anotação faz o relacionamento no banco de dados da tabela nivel de acesso e localidade
    private NivelAcesso nivelAcesso;

    private String descricao;
}
