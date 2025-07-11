# Spring Boot Exercises - Alura

Projeto prático desenvolvido durante o curso de Spring Boot da Alura, demonstrando conceitos fundamentais como serialização JSON, generics e aplicações de linha de comando.

## 🚀 Funcionalidades

### 1. Contador de Números
- Aplicação de linha de comando que conta de 1 até um número digitado pelo usuário
- Implementa `CommandLineRunner` para execução automática

### 2. Serialização JSON com Jackson
- **Serialização**: Converte objetos Java para arquivos JSON
- **Desserialização**: Lê arquivos JSON e converte de volta para objetos Java
- Classe `Tarefa` com atributos: descrição, concluída, pessoa responsável

### 3. Sistema de Avaliações Genéricas
- Classe genérica `Avaliacao<T>` que funciona com qualquer tipo de item
- Suporte para avaliação de:
  - 📦 **Produtos** (nome, preço, categoria)
  - 🔧 **Serviços** (nome, valor/hora, descrição)
  - 📱 **Assinaturas** (plano, valor mensal, benefícios)
- Cálculo automático de médias e estatísticas

## 📊 Exemplo de Execução

```
=== CONTADOR SPRING BOOT ===
Digite um número para contar até ele: 5
Contagem: 1 2 3 4 5

=== SERIALIZAÇÃO DE TAREFA ===
Tarefa criada: Tarefa{descricao='Estudar Spring Boot', concluida=false, pessoaResponsavel='João'}
Tarefa serializada com sucesso no arquivo: tarefa.json

=== DESSERIALIZAÇÃO DE TAREFA ===
Desserialização concluída com sucesso!
Objeto Tarefa criado a partir do JSON: Tarefa{...}

=== AVALIAÇÕES GENÉRICAS ===
📦 AVALIAÇÕES DE PRODUTOS:
Avaliacao{item=Produto{nome='Notebook Dell'...}, nota=4.5, comentario='Excelente qualidade!'}
Média das avaliações: 4.25
```

## 🏗️ Estrutura do Projeto

```
src/main/java/br/com/alura/contador/
├── ContadorApplication.java    # Aplicação principal
├── Tarefa.java                # Classe para serialização
├── Avaliacao.java             # Classe genérica de avaliação
├── Produto.java               # Classe de produto
├── Servico.java               # Classe de serviço
├── Assinatura.java            # Classe de assinatura
└── TesteAvaliacoes.java       # Testes das avaliações
```

## 📚 Conceitos Aprendidos

- **Spring Boot**: Configuração e execução de aplicações
- **CommandLineRunner**: Execução de código na inicialização
- **Jackson**: Serialização e desserialização JSON
- **Generics**: Criação de classes reutilizáveis
- **Maven**: Gerenciamento de dependências
- **Boas práticas**: Construtores, getters/setters, toString()

---
*Desenvolvido durante o curso de Spring Boot da Alura* 🎓
