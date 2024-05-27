package entites;

import interfac.Carro;

public class BancosDeCouro extends CarroDecorator {
    public BancosDeCouro(Carro carroDecorator) {
        super(carroDecorator);
    }

    @Override
    public String getDescricao() {
        return carroDecorator.getDescricao() + ", Bancos de Couro";
    }

    @Override
    public double getCusto() {
        return carroDecorator.getCusto() + 12500.0;
    }
}
