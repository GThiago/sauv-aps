package models;

public class Coordenador extends Funcionario{

    public Coordenador(String nomeCompleto, String sexo, String cpf, 
            String identidade, String email, String telefone, String endereco, 
            String cidade, String pais, String estado) {
        super(nomeCompleto, sexo, cpf, identidade, email, telefone, endereco, 
                cidade, pais, estado);
    }
    
    public void gerarRelatorioTurma(){}
}