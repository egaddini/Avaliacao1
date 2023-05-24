package hospital.controllers;

import hospital.models.CaracteristicasEstruturais;

import java.util.ArrayList;

public final class CaracteristicasEstruturaisController {
    private static CaracteristicasEstruturaisController instance;
    private ArrayList<CaracteristicasEstruturais> caracteristicasEstruturaisList;

    private CaracteristicasEstruturaisController() {
        System.out.println("Iniciando o controle de características estruturais");
        caracteristicasEstruturaisList = new ArrayList<>();
    }

    public static CaracteristicasEstruturaisController getInstance() {
        if (instance == null) {
            instance = new CaracteristicasEstruturaisController();
        }
        return instance;
    }

    public void cadastrarCaracteristicasEstruturais(CaracteristicasEstruturais caracteristicasEstruturais) {
        caracteristicasEstruturaisList.add(caracteristicasEstruturais);
        System.out.println("Características estruturais cadastradas com sucesso");
    }

    public void removerCaracteristicasEstruturais(CaracteristicasEstruturais caracteristicasEstruturais) {
        caracteristicasEstruturaisList.remove(caracteristicasEstruturais);
        System.out.println("Características estruturais removidas");
    }

    public ArrayList<CaracteristicasEstruturais> getCaracteristicasEstruturaisList() {
        return caracteristicasEstruturaisList;
    }
}
