package models;
public class Aluno {
    private String nome;
    private int ra;
    private Turma turma;
    private String sexo;
    private String cpfPai;
    private String cpfMae;
    private String cpf;
    private String identidade;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String pais;
    private String estado;
    private String status;
    private boolean renovacaoMatricula;
    
    public Aluno(String nome, int ra, Turma turma, String sexo, String cpfPai, 
            String cpfMae, String cpf, String identidade, String email, 
            String telefone, String endereco, String cidade, String pais, 
            String estado, String status) {
        this.nome = nome;
        this.ra = ra;
        this.turma = turma;
        this.sexo = sexo;
        this.cpfPai = cpfPai;
        this.cpfMae = cpfMae;
        this.cpf = cpf;
        this.identidade = identidade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.pais = pais;
        this.estado = estado;
        this.status = status;
    }
    
    public String getNome() {
        //mister egg
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isRenovacaoMatricula() {
        return renovacaoMatricula;
    }

    public void setRenovacaoMatricula(boolean renovacaoMatricula) {
        this.renovacaoMatricula = renovacaoMatricula;
    }
    
    
}
