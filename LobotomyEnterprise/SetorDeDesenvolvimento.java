
public class SetorDeDesenvolvimento{
private Setor Backend;
private Setor Sound;
private Setor Graphics;
private Setor Logistics;
private Setor HR;

    public SetorDeDesenvolvimento(Setor Backend, Setor Sound, Setor Graphics,Setor Logistics, Setor HR){
        this.Backend = Backend;
        this.Sound = Sound;
        this.Graphics = Graphics;
        this.Logistics = Logistics;
        this.HR = HR;
        }

    public Setor getBackend() {
        return this.Backend;
    }

    public void setBackend(Setor Backend) {
        this.Backend = Backend;
    }

    public Setor getSound() {
        return this.Sound;
    }

    public void setSound(Setor Sound) {
        this.Sound = Sound;
    }

    public Setor getGraphics() {
        return this.Graphics;
    }

    public void setGraphics(Setor Graphics) {
        this.Graphics = Graphics;
    }

    public Setor getLogistics() {
        return this.Logistics;
    }

    public void setLogistics(Setor Logistics) {
        this.Logistics = Logistics;
    }

    public Setor getHR() {
        return this.HR;
    }

    public void setHR(Setor HR) {
        this.HR = HR;
    }


}
