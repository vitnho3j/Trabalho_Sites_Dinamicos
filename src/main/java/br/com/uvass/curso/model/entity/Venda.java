package br.com.uvass.curso.model.entity;

import org.springframework.data.relational.core.sql.In;

import java.util.Date;

public class Venda {
    private Integer id;
    private String data;
    private Float valor;
    private Integer comprador;
    private Integer vendedor;
    private Integer curso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getComprador() {
        return comprador;
    }

    public void setComprador(Integer comprador) {
        this.comprador = comprador;
    }

    public Integer getVendedor() {
        return vendedor;
    }

    public void setVendedor(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }
}
