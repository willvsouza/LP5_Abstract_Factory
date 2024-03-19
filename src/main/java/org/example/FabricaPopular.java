package org.example;

public class FabricaPopular implements FabricaAbstrata{

    @Override
    public Modelo createModelo() {
        return new ModeloPopular();
    }

    @Override
    public Preco createPreco() {
        return new PrecoPopular();
    }
}
