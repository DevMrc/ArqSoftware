package Exercicio2;

public class AlunoPos extends Aluno {
    private String Tema;

    public AlunoPos(){}

    public AlunoPos(String tema){
        this.Tema = tema;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        Tema = tema;
    }

  
}
