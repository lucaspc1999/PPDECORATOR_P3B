package entites;

import interfac.Carro;

public abstract class CarroDecorator implements Carro {
    protected Carro carroDecorator;

    public CarroDecorator(Carro carroDecorator) {
        this.carroDecorator = carroDecorator;
    }

    @Override
    public String getDescricao() {
        return carroDecorator.getDescricao();
    }

    @Override
    public double getCusto() {
        return carroDecorator.getCusto();
    }
}