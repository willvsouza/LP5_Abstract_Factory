package tests;

import org.example.Carro;
import org.example.FabricaAbstrata;
import org.example.FabricaLuxo;
import org.example.FabricaPopular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CarroTest {

    @Test
    void deveRetornarModeloCarroPopular()
    {
        FabricaAbstrata fabrica = new FabricaPopular();
        Carro carro = new Carro (fabrica);
        Assertions.assertEquals("Modelo carro popular: Renault Kwid", carro.emitirModelo());
    }

    @Test
    void deveRetornarModeloCarroLuxo()
    {
        FabricaAbstrata fabrica = new FabricaLuxo();
        Carro carro = new Carro (fabrica);
        Assertions.assertEquals("Modelo carro de luxo: Porshe Cayenne E-Hybrid", carro.emitirModelo());
    }

    @Test
    void deveRetornarPrecoPopular()
    {
        FabricaAbstrata fabrica = new FabricaPopular();
        Carro carro = new Carro (fabrica);
        Assertions.assertEquals("Preço carro popular: R$70.000", carro.emitirPreco());
    }

    @Test
    void deveRetornarPrecoLuxo()
    {
        FabricaAbstrata fabrica = new FabricaLuxo();
        Carro carro = new Carro (fabrica);
        Assertions.assertEquals("Preço carro de luxo: R$500.000", carro.emitirPreco());
    }
}
