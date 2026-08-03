# Aula - 03/08

## Arquitetura MVC

O padrão arquitetural **Model-View-Controller (MVC)** divide uma aplicação em três componentes:

- **Model (Modelo):** responsável pelos dados e regras de negócio.
- **View (Visão):** responsável pela interface com o usuário.
- **Controller (Controlador):** recebe as ações do usuário, processa as regras e coordena a comunicação entre Model e View.

---

## Eficiência x Eficácia

### Eficiência
- Atinge o objetivo utilizando o mínimo de recursos possíveis (tempo, dinheiro, processamento, energia etc.).

### Eficácia
- Atinge o objetivo, independentemente da quantidade de recursos utilizados.

---

# Algoritmos de Ordenação

## Insertion Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Ordenação:** Adaptável, muito eficiente para listas parcialmente ordenadas.

---

## Selection Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Melhor caso: **O(n²)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Ordenação:** Não adaptável.

---

## Bubble Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n)** (versão otimizada)
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Ordenação:** Adaptável, eficiente para listas quase ordenadas.

---

## Comb Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Caso médio: **O(n log n)** (aproximadamente)
  - Pior caso: **O(n²)**
- **Ordenação:** Pouco adaptável.

---

## Bogo Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Média: **O(n × n!)**
- **Ordenação:** Não adaptável.

---

## Merge Sort
- **Memória:** Interna (utiliza memória auxiliar).
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n log n)**
- **Ordenação:** Pouco adaptável.

---

## Heap Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n log n)**
- **Ordenação:** Não adaptável.

---

## Shell Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Entre **O(n log² n)** e **O(n²)** (depende da sequência de incrementos).
- **Ordenação:** Parcialmente adaptável.

---

## Radix Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - **O(d × (n + k))**
- **Ordenação:** Não adaptável.

> Onde:
> - **d** = número de dígitos;
> - **k** = base utilizada.

---

## Gnome Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Ordenação:** Adaptável.

---

## Counting Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - **O(n + k)**
- **Ordenação:** Não adaptável.

---

## Bucket Sort
- **Memória:** Interna.
- **Estabilidade:** Geralmente estável (quando utiliza algoritmo estável nos baldes).
- **Complexidade:**
  - Média: **O(n + k)**
  - Pior caso: **O(n²)**
- **Ordenação:** Depende da distribuição dos dados.

---

## Cocktail Sort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Ordenação:** Adaptável.

---

## Timsort
- **Memória:** Interna.
- **Estabilidade:** Estável.
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n log n)**
- **Ordenação:** Altamente adaptável, aproveitando sequências já ordenadas.

---

## TwistSort
- **Memória:** Interna.
- **Estabilidade:** Depende da implementação.
- **Complexidade:** Depende da implementação.
- **Ordenação:** Depende da implementação.

---

## Quick Sort
- **Memória:** Interna.
- **Estabilidade:** Não estável.
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n²)**
- **Ordenação:** Pouco adaptável. Pode apresentar pior desempenho em listas já ordenadas quando o pivô é mal escolhido.

## Aula - 27/07

### Organização da disciplina
- Organização da matéria.
- Explicação da forma de avaliação.

### Conceitos de APIs
#### REST
- Utiliza principalmente o formato **JSON** para troca de dados.
- Mais leve, simples e amplamente utilizado em aplicações web.

#### SOAP
- Utiliza o formato **XML**.
- Possui maior padronização e recursos de segurança, porém é mais complexo.

### Escalabilidade

#### Escalabilidade Vertical
- Consiste em aumentar os recursos da mesma máquina (CPU, memória, armazenamento).

#### Escalabilidade Horizontal
- Consiste em adicionar novas máquinas ou servidores para distribuir a carga.

### Introdução a algoritmos de ordenação
- Apresentação dos algoritmos:
  - Bubble Sort
  - Insertion Sort
  - Selection Sort
- Introdução ao conceito de **complexidade de algoritmos** (esforço computacional).

---
