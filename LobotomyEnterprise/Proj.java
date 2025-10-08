import java.util.List;
import java.util.Date;


public class Proj {
    private String nome;
    private String conteudo;
    private Date DataFinal;
    private List<Patrocinador> patrocinadores;


    public Proj(String nome, String conteudo, 
                Date DataFinal, List<Patrocinador> patrocinadores){

                    this.nome = nome;
                    this.conteudo = conteudo;
                    this.DataFinal = DataFinal;
                    this.patrocinadores = patrocinadores;
                }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataFinal() {
        return this.DataFinal;
    }

    public void setDataFinal(Date DataFinal) {
        this.DataFinal = DataFinal;
    }

    public List<Patrocinador> getPatrocinadores() {
        return this.patrocinadores;
    }

    public void setPatrocinadores(List<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }
    
}
