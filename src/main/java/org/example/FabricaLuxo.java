package org.example;

public class FabricaLuxo implements FabricaAbstrata {

    @Override
    public Modelo createModelo() {
        return new ModeloLuxo();
    }

    @Override
    public Preco createPreco() {
        return new PrecoLuxo();
    }
}
