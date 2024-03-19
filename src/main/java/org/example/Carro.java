package org.example;

public class Carro {

    private Modelo modelo;
    private Preco preco;

    public Carro (FabricaAbstrata fabrica) {
        this.modelo = fabrica.createModelo();
        this.preco = fabrica.createPreco();
    }

    public String emitirModelo() {
        return this.modelo.emitir();
    }

    public String emitirPreco() {
        return this.preco.emitir();
    }
}