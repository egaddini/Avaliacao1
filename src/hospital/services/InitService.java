package hospital.services;

import hospital.controllers.*;
import hospital.models.CaracteristicasEstruturais;

import java.util.Arrays;

public class InitService {

    public void init() {
        CaracteristicasEstruturaisController carac = CaracteristicasEstruturaisController.getInstance();
        ConsultaController consultaController = ConsultaController.getInstance();
        EnderecoController enderecoController = EnderecoController.getInstance();
        FuncionarioController funcionarioController = FuncionarioController.getInstance();
        PacienteController pacienteController = PacienteController.getInstance();

        carac.cadastrarCaracteristicasEstruturais(new CaracteristicasEstruturaisService().getCaracteristicas());
        Arrays.stream(new FuncionarioService().gerarFuncionariosAleatorios()).forEach(i -> funcionarioController.cadastrarFuncionario(i));
        new PacienteService().getListaPacientes().stream().forEach(i ->  pacienteController.cadastrarPaciente(i));
        enderecoController.cadastrarEndereco(new EnderecoService().getEndereco());
        new ConsultaService().gerarNovasConsultas(pacienteController.getPacientes(), funcionarioController.getFuncionarios()).stream().forEach(i -> consultaController.marcarConsulta(i));
    }

}
