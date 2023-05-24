package hospital.models;

public class CaracteristicasEstruturais {
    private int numeroAndares;
    private int numeroQuartos;
    private int numeroSalas;
    private int numeroLeitos;
    private int capacidadeEstacionamento;

    public CaracteristicasEstruturais() {
    }

    public CaracteristicasEstruturais(int numeroAndares, int numeroQuartos, int numeroSalas, int numeroLeitos, int capacidadeEstacionamento) {
        this.numeroAndares = numeroAndares;
        this.numeroQuartos = numeroQuartos;
        this.numeroSalas = numeroSalas;
        this.numeroLeitos = numeroLeitos;
        this.capacidadeEstacionamento = capacidadeEstacionamento;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroSalas() {
        return numeroSalas;
    }

    public void setNumeroSalas(int numeroSalas) {
        this.numeroSalas = numeroSalas;
    }

    public int getNumeroLeitos() {
        return numeroLeitos;
    }

    public void setNumeroLeitos(int numeroLeitos) {
        this.numeroLeitos = numeroLeitos;
    }

    public int getCapacidadeEstacionamento() {
        return capacidadeEstacionamento;
    }

    public void setCapacidadeEstacionamento(int capacidadeEstacionamento) {
        this.capacidadeEstacionamento = capacidadeEstacionamento;
    }

    @Override
    public String toString() {
        return "CaracteristicasEstruturais{" +
                "numeroAndares=" + numeroAndares +
                ", numeroQuartos=" + numeroQuartos +
                ", numeroSalas=" + numeroSalas +
                ", numeroLeitos=" + numeroLeitos +
                ", capacidadeEstacionamento=" + capacidadeEstacionamento +
                '}';
    }

}

