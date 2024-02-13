package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("Marco", 1.123);
        Gerente ger1 = new Gerente();

        System.out.println(fun1.getNome() + " " + fun1.getSalario());

        ger1.alterarSalario(fun1, 5.678);

        System.out.println(fun1.getNome() + " " + fun1.getSalario());
    }
}
