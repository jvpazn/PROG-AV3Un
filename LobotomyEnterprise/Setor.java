import java.util.List;

public class Setor {
    private String nome;
    private Proj projeto_Principal;
    private List<Proj> projetos_Secundarios;
    private List<Funcionarios> funcionarios;
    private List<Estagiarios> estagiarios;
    private String id_Setor;

    public Setor(String nome, Proj projeto_Principal, List<Proj> projetos_Secundarios,
                 List<Funcionarios> funcionarios, List<Estagiarios> estagiarios, String id_Setor){
                    this.nome = nome;
                    this.projeto_Principal = projeto_Principal;
                    this.projetos_Secundarios = projetos_Secundarios;
                    this.funcionarios = funcionarios;
                    this.estagiarios = estagiarios;
                    this.id_Setor = id_Setor;
                 }
         


   public String GetNome(){return nome;}
   public void SetNome(String nome){this.nome = nome;}

   public Proj GetProjeto_Principal(){return projeto_Principal;}
   public void SetProjeto_Principal(String projeto_Principal){this.projeto_Principal = projeto_Principal;}
   
   public List<Proj> GetProjetos_Secundario(){return projetos_Secundarios;}
   public void SetProjetos_Secundarios(List<Proj>){this.projetos_Secundarios = projetos_Secundarios;}
   
   public List<Funcionarios> GetFuncionarios(){return funcionarios;}
   public void SetFuncionarios(List<Funcionarios> funcionarios){this.funcionarios = funcionarios;}

   public List<Estagiarios> GetEstagiarios(){return estagiarios;}
   public void SetEstagiarios(List<Estagiarios> estagiarios){this.estagiarios = estagiarios;}

   public String GetId_Setor(){return id_Setor;}
   public void SetId_Setor(String id_Setor){this.id_Setor = id_Setor;}

}