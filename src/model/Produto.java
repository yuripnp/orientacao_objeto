package model;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private String categoria;

    public BigDecimal calcularDesconto(BigDecimal percentualDesconto) {
        BigDecimal desconto = preco.multiply(percentualDesconto).divide(new BigDecimal(100));
        return preco.subtract(desconto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = BigDecimal.valueOf(preco);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
