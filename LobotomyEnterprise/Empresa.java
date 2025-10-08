public class Empresa{
    private setor_desenvolvimento SetorDeDesenvolvimento;


    public Empresa(setor_desenvolvimento SetorDeDesenvolvimento){
        this.SetorDeDesenvolvimento = SetorDeDesenvolvimento;
    }


    public setor_desenvolvimento GetSetorDeDesenvolvimento(){return SetorDeDesenvolvimento;}
    public void SetSetorDeDesenvolvimento(setor_desenvolvimento SetorDeDesenvolvimento){this.SetorDeDesenvolvimento = SetorDeDesenvolvimento;}
}
