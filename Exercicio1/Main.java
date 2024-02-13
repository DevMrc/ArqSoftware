package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Aeronave a1 = new Aeronave();

        a1.setOcupantes(20);
        a1.setCapacidadeCarga(5);

        JatoCaca c1 = new JatoCaca();

        c1.setArmamento("torreta");

        AeronaveAsasRot as1 = new AeronaveAsasRot();

        as1.setRotorCalda(true);

        System.out.println(a1.getOcupantes() + a1.getCapacidadeCarga());
        System.out.println(c1.getArmamento());
        System.out.println(as1);
    }
}
