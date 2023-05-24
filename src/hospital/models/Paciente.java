package hospital.models;

public class Paciente {
    private int matricula;
    private String nome;
    private int idade;
    private String genero;
    private String historicoMedico;

    public Paciente() {
    }

    public Paciente(String nome, int idade, String genero, int matricula, String historicoMedico) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.matricula = matricula;
        this.historicoMedico = historicoMedico;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", historicoMedico='" + historicoMedico + '\'' +
                '}';
    }
}


