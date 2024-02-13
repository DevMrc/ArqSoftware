package Exercicio3;

public class Gerente extends Funcionario{
    private String nome;

    public Gerente(){}

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // funcao para alteração de salario, permitido somente para o gerente alterar
    public void alterarSalario(Funcionario funcionario, double novoSalario) {
        funcionario.setSalario(novoSalario);
    }


}
