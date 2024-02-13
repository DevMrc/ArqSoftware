package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Marco");
        a1.setRa(220301);

        System.out.println(a1.getNome() + " " + a1.getRa());

        AlunoEAD ae1 = new AlunoEAD();

        ae1.setNome("Antonio");
        ae1.setRa(200103);
        ae1.setPolo("Grj");

        System.out.println("EAD: " + ae1.getNome() + " " + ae1.getRa() + " " + ae1.getPolo());

        AlunoGraduacao ag1 = new AlunoGraduacao();

        ag1.setNome("Sousa");
        ag1.setRa(2231);
        ag1.setUnidade("SpPs");

        System.out.println("Graduacao: " + ag1.getNome() + " " + ag1.getRa() + " " + ag1.getUnidade());

        AlunoPos ap1 = new AlunoPos();

        ap1.setNome("Soares");
        ap1.setRa(2223);
        ap1.setTema("Arquitetura de software");

        System.out.println("Pos: " + ap1.getNome() + " " + ap1.getRa() + " " + ap1.getTema());


    }
}
