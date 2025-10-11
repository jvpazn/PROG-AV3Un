import java.util.List;

public class Empresa{
    private List<Setor> Setores;


    public Empresa(List<Setor> Setores) {
        this.Setores = Setores;
    }


    public List<Setor> getSetores() {
        return this.Setores;
    }

    public void setSetores(List<Setor> Setores) {
        this.Setores = Setores;
    }

}
