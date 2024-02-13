package Exercicio1;

public class JatoCaca extends Aeronave {
    private String armamento;

    public JatoCaca(){}

    public JatoCaca(String armamento){
        this.armamento = armamento;
    }


    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }
}
