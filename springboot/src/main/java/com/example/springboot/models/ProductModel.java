package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity //para fazer mapeamento entre a classe java e a entidade do banco
@Table(name = "TB_PRODUCTS") //tabela produtos
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable { //serializacao: É o processo de converter um objeto em uma sequência de bytes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // identificador de 128 bits (2^128 combinacoes somente numericas) ex: 123e4567-e89b-12d3-a456-426614174000.
    private String name;
    private BigDecimal value;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
