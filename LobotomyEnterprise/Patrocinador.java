import java.util.Date;

public class Patrocinador extends Usuario {
    private int qntdInvestida;
    private int porcentDireitos;


    public Patrocinador(String nome, String senha, Date dataDeNascimento, String CPF, String emailPessoal, int qntdInvestida, int porcentDireitos) {
        super(nome, senha, dataDeNascimento, CPF, emailPessoal);
        this.qntdInvestida = qntdInvestida;
        this.porcentDireitos = porcentDireitos;
    }


    public int getQntdInvestida() {
        return this.qntdInvestida;
    }

    public void setQntdInvestida(int qntdInvestida) {
        this.qntdInvestida = qntdInvestida;
    }

    public int getPorcentDireitos() {
        return this.porcentDireitos;
    }

    public void setPorcentDireitos(int porcentDireitos) {
        this.porcentDireitos = porcentDireitos;
    }

}
