package models;

public class Professor {
    private String nomeCompleto;
    private String sexo;
    private String cpf;
    private String identidade;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String pais;
    private String estado;

    private String formacao;
    private Disciplina disciplina;
    
    
    public Professor(String nomeCompleto, String sexo, String cpf,
            String identidade, String email, String telefone, String endereco,
            String cidade, String pais, String estado) {
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.identidade = identidade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.pais = pais;
        this.estado = estado;
    }

    
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplinas(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
