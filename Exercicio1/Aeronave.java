package Exercicio1;

public class Aeronave {
    private int ocupantes;
    private float capacidadeCarga;

    public Aeronave(){}

    public Aeronave(int ocupantes, float capacidadeCarga){
        this.ocupantes = ocupantes;
        this.capacidadeCarga = capacidadeCarga; 
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
