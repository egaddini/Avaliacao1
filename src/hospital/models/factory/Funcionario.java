package hospital.models.factory;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private String departamento;
    private String categoria;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario, String departamento, String categoria) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.departamento = departamento;
        this.categoria = categoria;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static Funcionario criarFuncionario(String categoria) {
        Funcionario funcionario;

        if (categoria.equalsIgnoreCase("Medico")) {
            funcionario = new Medico();
        } else if (categoria.equalsIgnoreCase("Enfermeiro")) {
            funcionario = new Enfermeiro();
        } else if (categoria.equalsIgnoreCase("Administrativo")) {
            funcionario = new FuncionarioAdministrativo();
        } else {
            throw new IllegalArgumentException("Categoria de funcionário inválida.");
        }

        funcionario.setCategoria(categoria);
        return funcionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}



