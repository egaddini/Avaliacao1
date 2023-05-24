package hospital.services;

import hospital.builders.FuncionarioBuilder;
import hospital.models.factory.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FuncionarioService {
    private static final String[] NOMES = { "João", "Maria", "Pedro", "Ana", "Carlos", "Lúcia", "Fernando", "Sandra",
            "Ricardo", "Patrícia" };
    private static final int[] IDADES = { 25, 30, 35, 40, 45, 50 };
    private static final double[] SALARIOS = { 2000.0, 2500.0, 3000.0, 3500.0, 4000.0 };
    private static final String[] DEPARTAMENTOS = { "Financeiro", "Recursos Humanos", "Vendas", "Marketing", "TI" };
    private static final String[] CATEGORIAS = { "Médico", "Enfermeiro", "Administrativo" };

    public Funcionario[] gerarFuncionariosAleatorios() {
        FuncionarioBuilder builder = new FuncionarioBuilder();
        Random random = new Random();
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            String nome = NOMES[random.nextInt(NOMES.length)];
            int idade = IDADES[random.nextInt(IDADES.length)];
            double salario = SALARIOS[random.nextInt(SALARIOS.length)];
            String departamento = DEPARTAMENTOS[random.nextInt(DEPARTAMENTOS.length)];
            String categoria = CATEGORIAS[random.nextInt(CATEGORIAS.length)];

            Funcionario funcionario;

            if (categoria.equals("Médico")) {
                funcionario = builder.nome(nome)
                        .idade(idade)
                        .salario(salario)
                        .departamento(departamento)
                        .categoria(categoria)
                        .buildMedico();
            } else if (categoria.equals("Enfermeiro")) {
                funcionario = builder.nome(nome)
                        .idade(idade)
                        .salario(salario)
                        .departamento(departamento)
                        .categoria(categoria)
                        .buildEnfermeiro();
            } else {
                funcionario = builder.nome(nome)
                        .idade(idade)
                        .salario(salario)
                        .departamento(departamento)
                        .categoria(categoria)
                        .buildFuncionarioAdministrativo();
            }

            funcionarios.add(funcionario);
        }

        return funcionarios.toArray(new Funcionario[0]);
    }
}

