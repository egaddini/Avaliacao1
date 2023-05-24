import hospital.builders.HospitalBuilder;
import hospital.controllers.*;
import hospital.models.Hospital;
import hospital.services.InitService;

public class Main {
    public static void main(String[] args) {

        new InitService().init();
        CaracteristicasEstruturaisController carac = CaracteristicasEstruturaisController.getInstance();
        ConsultaController consultaController = ConsultaController.getInstance();
        EnderecoController enderecoController = EnderecoController.getInstance();
        FuncionarioController funcionarioController = FuncionarioController.getInstance();
        PacienteController pacienteController = PacienteController.getInstance();

        HospitalController hospitalController = HospitalController.getInstance();
        Hospital hospital = new HospitalBuilder()
                .endereco(enderecoController.getEnderecos().get(0))
                .funcionarios(funcionarioController.getFuncionarios())
                .caracteristicas(carac.getCaracteristicasEstruturaisList().get(0))
                .pacientes(pacienteController.getPacientes())
                .consultas(consultaController.getConsultas())
                .build();

        System.out.println("Hospital e seus dominios");
        System.out.println("");
        System.out.println("Endereço");
        System.out.println(hospital.getEndereco().toString());
        System.out.println("");
        System.out.println("Caracteristicas Fisicas");
        System.out.println(hospital.getCaracteristicas().toString());
        System.out.println("");
        System.out.println("Funcionarios");
        hospital.getFuncionarios().forEach(System.out::println);
        System.out.println("");
        System.out.println("Pacientes");
        hospital.getPacientes().forEach(System.out::println);
        System.out.println("");
        System.out.println("Consultas");
        hospital.getConsultas().forEach(System.out::println);



    }

}