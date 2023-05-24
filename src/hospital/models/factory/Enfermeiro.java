package hospital.models.factory;

public class Enfermeiro extends Funcionario {

    public Enfermeiro() {
    }

    public Enfermeiro(String nome, int idade, double salario, String departamento, String categoria) {
        super(nome, idade, salario, departamento, categoria);
    }
}

