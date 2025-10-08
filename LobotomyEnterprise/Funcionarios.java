import java.util.Date;

public class Funcionarios extends Usuario {
    private String emailEmpresarial;
    private String nivelFormacao;
    private int horasSemanais;
    private int salario ;
    private String matricula;
    private Setor setor;


    public Funcionarios(String nome, String senha, Date dataDeNascimento, String CPF, String emailPessoal,
    String emailEmpresarial, String nivelFormacao, int horasSemanais, int salario, String matricula, Setor setor) {
        super(nome, senha, dataDeNascimento, CPF, emailPessoal);
        this.emailEmpresarial = emailEmpresarial;
        this.nivelFormacao = nivelFormacao;
        this.horasSemanais = horasSemanais;
        this.salario = salario;
        this.matricula = matricula;
        this.setor = setor;
    }


    public String getEmailEmpresarial() {
        return this.emailEmpresarial;
    }

    public void setEmailEmpresarial(String emailEmpresarial) {
        this.emailEmpresarial = emailEmpresarial;
    }

    public String getNivelFormacao() {
        return this.nivelFormacao;
    }

    public void setNivelFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    public int getHorasSemanais() {
        return this.horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}
