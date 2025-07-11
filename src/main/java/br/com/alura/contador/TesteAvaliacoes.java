package br.com.alura.contador;

import java.util.ArrayList;
import java.util.List;

public class TesteAvaliacoes {

  public static void executarTestes() {
    System.out.println("=== TESTE DE AVALIAÇÕES GENÉRICAS ===\n");

    // Teste com Produtos
    testarAvaliacoesProdutos();

    // Teste com Serviços
    testarAvaliacoesServicos();

    // Teste com Assinaturas
    testarAvaliacoesAssinaturas();
  }

  private static void testarAvaliacoesProdutos() {
    System.out.println("📦 AVALIAÇÕES DE PRODUTOS:");

    // Criar produtos
    Produto notebook = new Produto("Notebook Dell", 2500.00, "Eletrônicos");
    Produto mouse = new Produto("Mouse Logitech", 150.00, "Periféricos");

    // Criar avaliações de produtos
    List<Avaliacao<Produto>> avaliacoesProdutos = new ArrayList<>();
    avaliacoesProdutos.add(new Avaliacao<>(notebook, 4.5, "Excelente qualidade, muito rápido!"));
    avaliacoesProdutos.add(new Avaliacao<>(notebook, 4.0, "Bom custo-benefício"));
    avaliacoesProdutos.add(new Avaliacao<>(mouse, 5.0, "Perfeito para gaming"));
    avaliacoesProdutos.add(new Avaliacao<>(mouse, 3.5, "Bom, mas poderia ser mais barato"));

    // Exibir avaliações
    for (Avaliacao<Produto> avaliacao : avaliacoesProdutos) {
      System.out.println(avaliacao);
    }

    // Calcular média
    double media = Avaliacao.calcularMediaNotas(avaliacoesProdutos);
    System.out.println("Média das avaliações de produtos: " + String.format("%.2f", media));
    System.out.println(Avaliacao.obterEstatisticas(avaliacoesProdutos));
    System.out.println();
  }

  private static void testarAvaliacoesServicos() {
    System.out.println("🔧 AVALIAÇÕES DE SERVIÇOS:");

    // Criar serviços
    Servico instalacao = new Servico("Instalação de Ar Condicionado", 80.00, "Instalação completa");
    Servico manutencao = new Servico("Manutenção de PC", 60.00, "Limpeza e verificação");

    // Criar avaliações de serviços
    List<Avaliacao<Servico>> avaliacoesServicos = new ArrayList<>();
    avaliacoesServicos.add(new Avaliacao<>(instalacao, 4.8, "Técnico muito competente"));
    avaliacoesServicos.add(new Avaliacao<>(instalacao, 4.2, "Serviço rápido e eficiente"));
    avaliacoesServicos.add(new Avaliacao<>(manutencao, 3.8, "Fez o básico, mas esperava mais"));

    // Exibir avaliações
    for (Avaliacao<Servico> avaliacao : avaliacoesServicos) {
      System.out.println(avaliacao);
    }

    // Calcular média
    double media = Avaliacao.calcularMediaNotas(avaliacoesServicos);
    System.out.println("Média das avaliações de serviços: " + String.format("%.2f", media));
    System.out.println(Avaliacao.obterEstatisticas(avaliacoesServicos));
    System.out.println();
  }

  private static void testarAvaliacoesAssinaturas() {
    System.out.println("📱 AVALIAÇÕES DE ASSINATURAS:");

    // Criar assinaturas
    Assinatura netflix = new Assinatura("Netflix Premium", 45.90, "4K, 4 telas simultâneas");
    Assinatura spotify = new Assinatura("Spotify Premium", 21.90, "Música sem anúncios");

    // Criar avaliações de assinaturas
    List<Avaliacao<Assinatura>> avaliacoesAssinaturas = new ArrayList<>();
    avaliacoesAssinaturas.add(new Avaliacao<>(netflix, 4.7, "Ótimo catálogo de filmes"));
    avaliacoesAssinaturas.add(new Avaliacao<>(netflix, 4.3, "Vale a pena, mas está caro"));
    avaliacoesAssinaturas.add(new Avaliacao<>(spotify, 4.9, "Melhor app de música!"));
    avaliacoesAssinaturas.add(new Avaliacao<>(spotify, 4.1, "Bom, mas às vezes trava"));

    // Exibir avaliações
    for (Avaliacao<Assinatura> avaliacao : avaliacoesAssinaturas) {
      System.out.println(avaliacao);
    }

    // Calcular média
    double media = Avaliacao.calcularMediaNotas(avaliacoesAssinaturas);
    System.out.println("Média das avaliações de assinaturas: " + String.format("%.2f", media));
    System.out.println(Avaliacao.obterEstatisticas(avaliacoesAssinaturas));
    System.out.println();
  }
}
