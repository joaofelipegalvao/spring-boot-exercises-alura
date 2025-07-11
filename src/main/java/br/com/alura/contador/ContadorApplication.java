package br.com.alura.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ContadorApplication.class, args);
  }

  private void desserializarTarefa() {
    try {
      // Criar o ObjectMapper do Jackson
      ObjectMapper objectMapper = new ObjectMapper();

      // Referenciar o arquivo tarefa.json
      File arquivo = new File("tarefa.json");

      // Verificar se o arquivo existe
      if (!arquivo.exists()) {
        System.out.println("Arquivo tarefa.json não encontrado!");
        System.out.println("Execute primeiro a serialização para criar o arquivo.");
        return;
      }

      System.out.println("Lendo arquivo: " + arquivo.getAbsolutePath());

      // Desserializar o arquivo JSON para um objeto Tarefa
      Tarefa tarefaLida = objectMapper.readValue(arquivo, Tarefa.class);

      System.out.println("Desserialização concluída com sucesso!");
      System.out.println("Objeto Tarefa criado a partir do JSON:");
      System.out.println(tarefaLida);

      // Exibir os dados individualmente para melhor visualização
      System.out.println("\n--- Detalhes da Tarefa ---");
      System.out.println("Descrição: " + tarefaLida.getDescricao());
      System.out.println("Concluída: " + (tarefaLida.isConcluida() ? "Sim" : "Não"));
      System.out.println("Pessoa Responsável: " + tarefaLida.getPessoaResponsavel());

    } catch (IOException e) {
      System.err.println("Erro ao desserializar a tarefa: " + e.getMessage());
      e.printStackTrace();
    } catch (Exception e) {
      System.err.println("Erro inesperado: " + e.getMessage());
      e.printStackTrace();
    }
  }

  @Override
  public void run(String... args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== CONTADOR SPRING BOOT ===");

    // Exercício 1: Contador
    System.out.print("Digite um número para contar até ele: ");

    try {
      int numero = scanner.nextInt();

      if (numero <= 0) {
        System.out.println("Por favor, digite um número positivo maior que zero!");
        return;
      }

      System.out.print("Contagem: ");
      for (int i = 1; i <= numero; i++) {
        System.out.print(i);
        if (i < numero) {
          System.out.print(" ");
        }
      }
      System.out.println();

    } catch (Exception e) {
      System.out.println("Erro: Por favor, digite um número válido!");
    }

    // Exercício 4: Serialização
    System.out.println("\n=== SERIALIZAÇÃO DE TAREFA ===");
    serializarTarefa();

    // Exercício 5: Desserialização
    System.out.println("\n=== DESSERIALIZAÇÃO DE TAREFA ===");
    desserializarTarefa();

    // Exercício 6: Avaliações Genéricas
    System.out.println("\n=== EXERCÍCIO 6: AVALIAÇÕES GENÉRICAS ===");
    TesteAvaliacoes.executarTestes();

    scanner.close();
  }

  private void serializarTarefa() {
    try {
      // Criar uma instância da classe Tarefa
      Tarefa tarefa = new Tarefa("Estudar Spring Boot e Jackson", false, "João Silva");

      System.out.println("Tarefa criada: " + tarefa);

      // Criar o ObjectMapper do Jackson
      ObjectMapper objectMapper = new ObjectMapper();

      // Criar o arquivo tarefa.json
      File arquivo = new File("tarefa.json");

      // Serializar o objeto para o arquivo JSON
      objectMapper.writeValue(arquivo, tarefa);

      System.out.println("Tarefa serializada com sucesso no arquivo: " + arquivo.getAbsolutePath());

      // Verificar se o arquivo foi criado
      if (arquivo.exists()) {
        System.out.println("Arquivo criado com tamanho: " + arquivo.length() + " bytes");
      }

    } catch (IOException e) {
      System.err.println("Erro ao serializar a tarefa: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
