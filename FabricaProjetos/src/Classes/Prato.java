package Classes;

public class Prato {
    private String numPrato;
    private String obs;
    private String salada;
    private String bebida;
    private String CPF;

    public Prato() {
        this.numPrato = numPrato;
        this.obs = obs;
        this.salada = salada;
        this.bebida = bebida;
        this.CPF = CPF;
    }

    public String getNumPrato() {
        return numPrato;
    }

    public void setNumPrato(String numPrato) {
        this.numPrato = numPrato;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getSalada() {
        return salada;
    }

    public String setSalada(String salada) {
        return (this.salada = salada);
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
    
}
