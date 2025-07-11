package br.com.alura.contador;

public class Servico {

  private String nome;
  private double valorHora;
  private String descricao;

  public Servico() {}

  public Servico(String nome, double valorHora, String descricao) {
    this.nome = nome;
    this.valorHora = valorHora;
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Servico{"
        + "nome='"
        + nome
        + '\''
        + ", valorHora="
        + valorHora
        + ", descricao='"
        + descricao
        + '\''
        + '}';
  }
}
