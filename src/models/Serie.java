package models;

import java.util.List;

public class Serie {
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;
    private String numSerie;

    public Serie(List<Turma> turmas, List<Disciplina> disciplinas, String numSerie) {
        this.turmas = turmas;
        this.disciplinas = disciplinas;
        this.numSerie = numSerie;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    
    
}
