package hospital.builders;

import hospital.models.CaracteristicasEstruturais;

public class CaracteristicasEstruturaisBuilder {
    private CaracteristicasEstruturais caracteristicas;

    public CaracteristicasEstruturaisBuilder() {
        caracteristicas = new CaracteristicasEstruturais();
    }

    public CaracteristicasEstruturaisBuilder numeroAndares(int numeroAndares) {
        caracteristicas.setNumeroAndares(numeroAndares);
        return this;
    }

    public CaracteristicasEstruturaisBuilder numeroQuartos(int numeroQuartos) {
        caracteristicas.setNumeroQuartos(numeroQuartos);
        return this;
    }

    public CaracteristicasEstruturaisBuilder numeroSalas(int numeroSalas) {
        caracteristicas.setNumeroSalas(numeroSalas);
        return this;
    }

    public CaracteristicasEstruturaisBuilder numeroLeitos(int numeroLeitos) {
        caracteristicas.setNumeroLeitos(numeroLeitos);
        return this;
    }

    public CaracteristicasEstruturaisBuilder capacidadeEstacionamento(int capacidadeEstacionamento) {
        caracteristicas.setCapacidadeEstacionamento(capacidadeEstacionamento);
        return this;
    }

    public CaracteristicasEstruturais build() {
        return caracteristicas;
    }

}

