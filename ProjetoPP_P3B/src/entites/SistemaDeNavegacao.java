package entites;

import interfac.Carro;

public class SistemaDeNavegacao extends CarroDecorator {
    public SistemaDeNavegacao(Carro carroDecorado) {
        super(carroDecorado);
    }

    @Override
    public String getDescricao() {
        return carroDecorator.getDescricao() + ", Sistema de Navegação";
    }

    @Override
    public double getCusto() {
        return carroDecorator.getCusto() + 7500.0;
    }
}
