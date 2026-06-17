# 📌 EDList16 — Estrutura de Dados I

## 📖 Descrição

Este repositório contém a implementação da **EDList16**, desenvolvida para a disciplina de **Estrutura de Dados I**.

O projeto explora a implementação e manipulação de estruturas de dados lineares em Java, com foco em:

- Pilhas (Stack)
- Filas (Queue)
- Estruturas estáticas e dinâmicas
- Resolução de problemas clássicos de TADs (Tipos Abstratos de Dados)

Além das implementações base, o projeto inclui exercícios teóricos e práticos que abordam simulações, otimização de memória e manipulação de estruturas sob restrições.

---

## 🛠 Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## 📂 Estrutura do Projeto

### 🔹 Queue<T>
Interface base da estrutura de fila (FIFO):

- push(T element)
- pop()
- peek()
- isEmpty()

---

### 🔹 Stack<T>
Interface base da estrutura de pilha (LIFO):

- push(T element)
- pop()
- top()
- isEmpty()

---

### 🔹 LinkedQueue<T>
Implementação dinâmica de fila utilizando lista encadeada.

✔ FIFO  
✔ Crescimento dinâmico  

---

### 🔹 LinkedStack<T>
Implementação dinâmica de pilha utilizando lista encadeada.

✔ LIFO  
✔ Operações em O(1) no topo  

---

### 🔹 ArrayStack<T>
Implementação estática de pilha utilizando vetor.

✔ Capacidade fixa  
✔ Redimensionamento manual  

---

### 🔹 QueueNode / StackNode
Nós utilizados nas estruturas encadeadas.

---

## 🧠 Exercícios da Lista (EDList16)

---

### 🟦 Questão 1 — Stack com Duas Filas

Implementação de uma pilha (LIFO) utilizando apenas duas filas (FIFO).

Operações:
- push(T element)
- pop()
- top()
- isEmpty()

Objetivo: simular pilha usando filas.

---

### 🟦 Questão 2 — Redimensionamento de Pilha Estática

Implementação do método ensureCapacity().

Funcionalidades:
- Dobra o tamanho do vetor ao atingir limite
- Copia elementos mantendo ordem
- Atualiza referência interna

Objetivo: simular crescimento dinâmico em estrutura estática.

---

### 🟦 Questão 3 — DualStack (Dois Stacks em Um Vetor)

Duas pilhas compartilhando o mesmo vetor:

- Stack A cresce da esquerda para direita
- Stack B cresce da direita para esquerda

Operações:
- pushA(int x)
- pushB(int x)

Objetivo: otimização de memória.

---

### 🟦 Questão 4 — LinkedStack Otimizada

Implementação de pilha dinâmica eficiente.

- Inserção em O(1)
- Uso de ponteiro top
- Sem varredura de lista

Objetivo: manter performance constante.

---

### 🟦 Questão 5 — Remoção por Chave em Pilha

Método:
removeElement(T target)

Funcionalidades:
- Remove elemento específico
- Usa apenas push, pop e isEmpty
- Mantém ordem dos demais elementos

Objetivo: manipular pilha respeitando restrições do TAD.

---

### 🟦 Questão 6 — Verificação de Palíndromo

Estruturas utilizadas:

- Fila (LinkedQueue) → leitura
- Pilha (LinkedStack) → inversão

Funcionalidade:
- Compara elementos
- Verifica se sequência é palíndroma

Exemplos:
- ARARA → verdadeiro
- RADAR → verdadeiro
- JAVA → falso

---

## ⚙️ Funcionalidades Gerais

- Estruturas estáticas e dinâmicas
- Uso de generics <T>
- Simulação de LIFO com FIFO
- Controle manual de memória em arrays
- Manipulação de nós encadeados
- Resolução de problemas clássicos de estruturas de dados

---

## ▶️ Exemplo de Execução

Push: 10  
Push: 20  
Push: 30  

Stack:  
30 -> 20 -> 10  

Pop:  
30  

Queue:  
10 -> 20  

---

## 👨‍💻 Autor

Marcos Antonio de Oliveira Filho   
Análise e Desenvolvimento de Sistemas   
Estrutura de Dados I
