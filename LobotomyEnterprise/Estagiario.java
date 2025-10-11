public class Estagiario extends contaEmpresarial {
    private String emailEmpresarial;
    private String nivelFormacao;
    private int horasSemanais;
    private int bolsa;
    private String dataFimEstagio;
    private String matricula;
    private Setor setor;
    private Funcionario Supervisor;


    public Estagiario(String nome, String senha, String dataDeNascimento, String CPF, String emailPessoal,
    String emailEmpresarial, String nivelFormacao, int horasSemanais, int bolsa, String dataFimEstagio, String matricula, Setor setor, Funcionario Supervisor) {
        super(nome, senha, dataDeNascimento, CPF, emailPessoal);
        this.emailEmpresarial = emailEmpresarial;
        this.nivelFormacao = nivelFormacao;
        this.horasSemanais = horasSemanais;
        this.bolsa = bolsa;
        this.dataFimEstagio = dataFimEstagio;
        this.matricula = matricula;
        this.setor = setor;
        this.Supervisor = Supervisor;
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

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public String getDataFimEstagio() {
        return this.dataFimEstagio;
    }

    public void setDataFimEstagio(String dataFimEstagio) {
        this.dataFimEstagio = dataFimEstagio;
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

    public Funcionario getSupervisor() {
        return this.Supervisor;
    }

    public void setSupervisor(Funcionario Supervisor) {
        this.Supervisor = Supervisor;
    }

    @Override 
    public void dadosPublicos(){
        System.out.println("Nome : " + getNome());
        System.out.println("Setor em que trabalha : " + getSetor().getNome());
        System.out.println("Supervisor : " + getSupervisor().getNome());
        System.out.println("Nivel de Formação : " + getNivelFormacao());

    }

}
