package br.com.alura.contador;

import java.util.List;

public class Avaliacao<T> {
  private T item;
  private double nota;
  private String comentario;

  public Avaliacao() {}

  public Avaliacao(T item, double nota, String comentario) {
    this.item = item;
    this.nota = validarNota(nota);
    this.comentario = comentario;
  }

  private double validarNota(double nota) {
    if (nota < 0.0) return 0.0;
    if (nota > 5.0) return 5.0;
    return nota;
  }

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = validarNota(nota);
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public static <T> double calcularMediaNotas(List<Avaliacao<T>> avaliacoes) {
    if (avaliacoes == null || avaliacoes.isEmpty()) {
      return 0.0;
    }

    double somaNotas = 0.0;
    int count = 0;

    for (Avaliacao<T> avaliacao : avaliacoes) {
      if (avaliacao != null) {
        somaNotas += avaliacao.getNota();
        count++;
      }
    }
    return count > 0 ? somaNotas / count : 0.0;
  }

  public static <T> String obterEstatisticas(List<Avaliacao<T>> avaliacoes) {
    if (avaliacoes == null || avaliacoes.isEmpty()) {
      return "Nenhuma avaliação disponível";
    }

    double media = calcularMediaNotas(avaliacoes);
    int total = avaliacoes.size();
    double notaMaxima = avaliacoes.stream().mapToDouble(Avaliacao::getNota).max().orElse(0.0);

    double notaMinima = avaliacoes.stream().mapToDouble(Avaliacao::getNota).min().orElse(0.0);

    return String.format(
        "Estatísticas das avaliações:\n"
            + "- Total de avaliações: %d\n"
            + "- Média das notas: %.2f\n"
            + "- Nota máxima: %.1f\n"
            + "- Nota mínima: %.1f",
        total, media, notaMaxima, notaMinima);
  }

  @Override
  public String toString() {
    return "Avaliacao{"
        + "item="
        + item
        + ", nota="
        + nota
        + ", comentario='"
        + comentario
        + '\''
        + '}';
  }
}
