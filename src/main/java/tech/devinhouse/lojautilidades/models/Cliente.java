package tech.devinhouse.lojautilidades.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Boolean ativo = true;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50, unique = true)
    private String cpfCnpj;

}
