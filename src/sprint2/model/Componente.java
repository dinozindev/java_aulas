package sprint2.model;

public class Componente {
    private String motor;
    private String transmissao;
    private String chassi;
    private String carroceria;
    private String direcao;
    private String suspensao;
    private String freio;
    private String escapamento;
    private String pneu;
    private String interior;
    private String sistemaEletrico;

    public Componente(String motor, String transmissao, String chassi, String carroceria, String direcao, String suspensao, String freio, String escapamento, String pneu, String interior, String sistemaEletrico) {
        this.motor = motor;
        this.transmissao = transmissao;
        this.chassi = chassi;
        this.carroceria = carroceria;
        this.direcao = direcao;
        this.suspensao = suspensao;
        this.freio = freio;
        this.escapamento = escapamento;
        this.pneu = pneu;
        this.interior = interior;
        this.sistemaEletrico = sistemaEletrico;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public String getEscapamento() {
        return escapamento;
    }

    public void setEscapamento(String escapamento) {
        this.escapamento = escapamento;
    }

    public String getPneu() {
        return pneu;
    }

    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getSistemaEletrico() {
        return sistemaEletrico;
    }

    public void setSistemaEletrico(String sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }




}
