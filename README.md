# ValidateNumber

Aplicação simples em Java para validar números inteiros informados pelo usuário via terminal (CLI), identificando se o valor é positivo, negativo ou zero, além de tratar entradas inválidas de forma segura.

---

# 📌 Funcionalidades

* Leitura de números inteiros pelo terminal;
* Identificação de:

  * números positivos;
  * números negativos;
  * zero;
* Tratamento de exceções para entradas inválidas;
* Uso de `try-with-resources` para gerenciamento automático de recursos;
* Estrutura simples e didática para iniciantes em Java.

---

# 🛠 Tecnologias Utilizadas

| Tecnologia         | Finalidade                    |
| ------------------ | ----------------------------- |
| Java               | Linguagem principal           |
| Scanner            | Entrada de dados via terminal |
| Exception Handling | Tratamento de erros           |
| CLI                | Interface de linha de comando |

---

# 📂 Estrutura do Projeto

```bash
ValidateNumber/
 └── src/
      └── ValidateNumber.java
```

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

* Java JDK 17+ instalado;
* Terminal ou IDE Java:

  * Eclipse;
  * IntelliJ IDEA;
  * VS Code.

---

## Compilar o Projeto

No terminal:

```bash
javac ValidateNumber.java
```

---

## Executar o Projeto

```bash
java ValidateNumber
```

---

# 💻 Exemplo de Uso

## Entrada

```text
--- NUMBER VALIDATOR ---
Enter a number: 15
```

## Saída

```text
15 is positive
```

---

## Entrada

```text
--- NUMBER VALIDATOR ---
Enter a number: -8
```

## Saída

```text
-8 is negative
```

---

## Entrada

```text
--- NUMBER VALIDATOR ---
Enter a number: 0
```

## Saída

```text
0 is zero (neither positive nor negative)
```

---

## Entrada Inválida

```text
--- NUMBER VALIDATOR ---
Enter a number: abc
```

## Saída

```text
Invalid input: Please enter a valid integer.
```

---

# 🧠 Arquitetura e Decisões Técnicas

Este projeto utiliza uma arquitetura simples baseada em métodos estáticos, ideal para aplicações pequenas e educacionais.

## Principais Decisões

### Uso do `Scanner`

Responsável pela leitura de dados do terminal.

```java
Scanner scanner = new Scanner(System.in);
```

---

### Uso de `try-with-resources`

O `Scanner` é fechado automaticamente ao final da execução, evitando vazamento de recursos.

```java
try (Scanner scanner = new Scanner(System.in))
```

---

### Tratamento de Exceções

O projeto trata erros de entrada usando:

```java
InputMismatchException
```

Isso impede que o programa seja encerrado abruptamente caso o usuário digite valores inválidos.

---

### Separação de Responsabilidades

O método:

```java
validateNumber()
```

centraliza toda a lógica de validação, melhorando:

* organização;
* reutilização;
* legibilidade.

---

# ✅ Boas Práticas Aplicadas

## ✔ Tratamento de Erros

Uso de `try/catch` para entradas inválidas.

---

## ✔ Gerenciamento de Recursos

Uso de `try-with-resources`.

---

## ✔ Código Legível

* nomes claros;
* estrutura simples;
* indentação padronizada.

---

## ✔ Responsabilidade Única

O método possui uma responsabilidade específica:

* validar e classificar números.

---

## ✔ Facilidade de Manutenção

Estrutura simples e expansível para futuras melhorias.

---

# 🔮 Melhorias Futuras

Possíveis evoluções para o projeto:

* Permitir múltiplas validações em loop;
* Aceitar números decimais;
* Criar menu interativo;
* Adicionar testes unitários com JUnit;
* Separar lógica em camadas;
* Criar interface gráfica;
* Internacionalização (PT-BR / EN);
* Converter para API REST com Spring Boot.

---

# 📚 Conceitos Aprendidos

Este projeto ajuda a praticar:

* variáveis;
* condicionais (`if/else`);
* métodos;
* entrada de dados;
* tratamento de exceções;
* orientação básica a objetos;
* boas práticas em Java.

---

# 👨‍💻 Autor

Rafael Correa de Lima

@correa.pwb

---
