package io.github.cursodsantos.clientes.dominio;

import java.util.UUID;

public class Cliente {
    private UUID codigo = UUID.randomUUID();
    private String Nome;
    private String CPF;
    private String Sexo;
    private byte[] foto;

    public Cliente() {
    }

    public UUID getCodigo() {
        return this.codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public byte[] getFoto() {
        return this.foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
