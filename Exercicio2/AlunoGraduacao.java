package Exercicio2;

public class AlunoGraduacao extends Aluno {
    private String unidade;

    public AlunoGraduacao(){

    }

    public AlunoGraduacao(String unidade){
        this.unidade = unidade;
    }


    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

   
}
