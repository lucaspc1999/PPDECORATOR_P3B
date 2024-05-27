package entites;

import interfac.Carro;

public class SistemaDeSomPremium extends CarroDecorator {
    public SistemaDeSomPremium(Carro carroDecorado) {
        super(carroDecorado);
    }

    @Override
    public String getDescricao() {
        return carroDecorator.getDescricao() + ", Sistema de Som Premium";
    }

    @Override
    public double getCusto() {
        return carroDecorator.getCusto() + 5000.0;
    }
}