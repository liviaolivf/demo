package com.dev.finance.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_seq", initialValue = 1, allocationSize = 1)
@Table(name = "transactions")
public class Transaction {
    public enum Type {
        entrada,
        saida
    }

    public enum Option {
        agua,
        alimentacao,
        aluguel,
        animal_de_estimacao,
        compras,
        energia,
        internet,
        lazer,
        outros,
        salario
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    private long id;
    private String description;
    private float value;
    private Type type;
    private Option option;
    private String created_at;

    public Transaction() {}

    public Transaction(long id, String description, float value, Type type, Option option, String created_at) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.type = type;
        this.option = option;
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
