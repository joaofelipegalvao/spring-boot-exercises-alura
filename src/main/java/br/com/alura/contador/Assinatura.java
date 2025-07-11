package br.com.alura.contador;

public class Assinatura {

  private String plano;
  private double valorMensal;
  private String beneficios;

  public Assinatura() {}

  public Assinatura(String plano, double valorMensal, String beneficios) {
    this.plano = plano;
    this.valorMensal = valorMensal;
    this.beneficios = beneficios;
  }

  public String getPlano() {
    return plano;
  }

  public void setPlano(String plano) {
    this.plano = plano;
  }

  public double getValorMensal() {
    return valorMensal;
  }

  public void setValorMensal(double valorMensal) {
    this.valorMensal = valorMensal;
  }

  public String getBeneficios() {
    return beneficios;
  }

  public void setBeneficios(String beneficios) {
    this.beneficios = beneficios;
  }

  @Override
  public String toString() {
    return "Assinatura{"
        + "plano='"
        + plano
        + '\''
        + ", valorMensal="
        + valorMensal
        + ", beneficios='"
        + beneficios
        + '\''
        + '}';
  }
}
