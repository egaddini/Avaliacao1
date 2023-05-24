package hospital.controllers;

import hospital.models.Consulta;

import java.util.ArrayList;

public final class ConsultaController {
    private static ConsultaController instance;
    private ArrayList<Consulta> consultas;

    private ConsultaController() {
        System.out.println("Iniciando o controle de consultas");
        consultas = new ArrayList<>();
    }

    public static ConsultaController getInstance() {
        if (instance == null) {
            instance = new ConsultaController();
        }
        return instance;
    }

    public void marcarConsulta(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta marcada com sucesso");
    }

    public void cancelarConsulta(Consulta consulta) {
        consultas.remove(consulta);
        System.out.println("Consulta cancelada");
    }

    public void realizarConsulta(Consulta consulta, String diagnostico, String prescricao) {
        consulta.setDiagnostico(diagnostico);
        consulta.setPrescricao(prescricao);
        consulta.setRealizada(true);
        System.out.println("Consulta realizada");
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
}

