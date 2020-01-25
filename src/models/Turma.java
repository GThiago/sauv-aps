package models;

import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    private String idTurma;
    private Serie serie;
    private int anoLetivo;

    public Turma(List<Aluno> alunos, Serie serie) {
        this.alunos = alunos;
        this.serie = serie;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }
    
    public void updateAlunos(String aluno){
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    
}
