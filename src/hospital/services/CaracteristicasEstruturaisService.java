package hospital.services;

import hospital.builders.CaracteristicasEstruturaisBuilder;
import hospital.models.CaracteristicasEstruturais;

public class CaracteristicasEstruturaisService {

    public CaracteristicasEstruturais getCaracteristicas() {
        return new CaracteristicasEstruturaisBuilder()
                .numeroAndares(5)
                .numeroQuartos(50)
                .numeroSalas(10)
                .numeroLeitos(100)
                .capacidadeEstacionamento(50)
                .build();
    }

}
