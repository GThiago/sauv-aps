package models;

public class Disciplina {
    private Professor professor;
    private String nome;

    public Disciplina(Professor professor, String nome) {
        this.professor = professor;
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
