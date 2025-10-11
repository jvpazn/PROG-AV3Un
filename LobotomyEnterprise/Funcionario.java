public class Funcionario extends contaEmpresarial {
    private String emailEmpresarial;
    private String nivelFormacao;
    private int horasSemanais;
    private int salario ;
    private String matricula;
    private Setor setor;
    private Cargo cargo;


    public Funcionario(String nome, String senha, String dataDeNascimento, String CPF, String emailPessoal,
    String emailEmpresarial, String nivelFormacao, int horasSemanais, int salario, String matricula, Setor setor, Cargo cargo) {
        super(nome, senha, dataDeNascimento, CPF, emailPessoal);
        this.emailEmpresarial = emailEmpresarial;
        this.nivelFormacao = nivelFormacao;
        this.horasSemanais = horasSemanais;
        this.salario = salario;
        this.matricula = matricula;
        this.setor = setor;
        this.cargo = cargo;
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

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    @Override 
    public void dadosPublicos(){
        System.out.println("Nome : " + getNome());
        System.out.println("Setor em que trabalha : " + getSetor().getNome());
        System.out.println("Nivel de Formação : " + getNivelFormacao());
        System.out.println("Cargo : " + getCargo().getTitulo());

    }

}
