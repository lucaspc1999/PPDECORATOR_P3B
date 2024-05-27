package entites;

import interfac.Carro;

public class CarroBasico implements Carro {
    @Override
    public String getDescricao() {
        return "Carro Básico";
    }

    @Override
    public double getCusto() {
        return 100000.0;

    }
}