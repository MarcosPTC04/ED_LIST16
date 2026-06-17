# 📌 Descrição

Este repositório apresenta a implementação da EDList16, desenvolvida para a disciplina de Estrutura de Dados I. O projeto tem como foco a resolução de exercícios teóricos e práticos envolvendo estruturas de dados lineares, explorando principalmente Pilha (Stack) e Fila (Queue) em diferentes abordagens.

As atividades abordam desde implementações estáticas e dinâmicas até desafios clássicos de manipulação de memória, inversão de estruturas e validação de padrões, sempre respeitando as restrições dos TADs (Tipos Abstratos de Dados).

# 🛠 Tecnologias Utilizadas
Java
IntelliJ IDEA
Git
GitHub
📂 Estrutura do Projeto
🔹 Estruturas Base
Queue<T>

Interface que define operações fundamentais de uma fila:

push()
pop()
peek()
isEmpty()
Stack<T>

Interface base para estrutura de pilha:

push(T element)
pop()
top()
isEmpty()
LinkedQueue<T>

Implementação dinâmica de fila usando lista encadeada (FIFO).

LinkedStack<T>

Implementação dinâmica de pilha usando lista encadeada (LIFO).

ArrayStack<T>

Implementação estática de pilha utilizando vetor com controle de capacidade.

QueueNode<T> / StackNode<T>

Nós utilizados nas estruturas encadeadas.

# 🧠 Exercícios Implementados
🔹 Questão 1 — Stack com Duas Filas

Implementação de uma Pilha (LIFO) utilizando exclusivamente duas filas (FIFO) como estrutura auxiliar.

✔ Operações:

push(T element)
pop()
top()
isEmpty()

📌 Objetivo: simular comportamento LIFO usando apenas FIFO.

🔹 Questão 2 — Redimensionamento de Pilha Estática

Implementação do método ensureCapacity() para uma pilha baseada em vetor.

✔ Funcionalidade:

Dobra a capacidade do vetor quando atinge o limite
Copia elementos mantendo ordem
Atualiza referência do array

📌 Objetivo: simular crescimento dinâmico sem usar lista encadeada.

🔹 Questão 3 — DualStack (Duas Pilhas em Um Vetor)

Estrutura com duas pilhas compartilhando o mesmo array:

Pilha A cresce da esquerda para direita
Pilha B cresce da direita para esquerda

✔ Funcionalidade:

pushA(int x)
pushB(int x)
Controle de overflow quando os ponteiros se encontram

📌 Objetivo: otimização de memória em vetor fixo.

🔹 Questão 4 — LinkedStack (Push Otimizado)

Implementação de pilha dinâmica garantindo:

✔ Operação push(T element) em O(1)
✔ Inserção sempre no topo
✔ Sem varredura de lista

📌 Objetivo: manter eficiência máxima em estrutura encadeada.

🔹 Questão 5 — Remoção por Chave em Pilha

Criação do método:

removeElement(T target)

✔ Remove elemento específico da pilha
✔ Usa apenas operações básicas (push, pop, isEmpty)
✔ Mantém ordem original dos demais elementos

📌 Objetivo: contornar restrição de acesso direto aos nós.

🔹 Questão 6 — Verificação de Palíndromo

Algoritmo que verifica se uma sequência é palíndroma utilizando:

Fila (LinkedQueue) → entrada sequencial
Pilha (LinkedStack) → inversão lógica

✔ Compara elementos das duas estruturas
✔ Determina se sequência é igual invertida

📌 Exemplo:

ARARA → verdadeiro
RADAR → verdadeiro
JAVA → falso
⚙️ Funcionalidades Gerais
Implementação de estruturas estáticas e dinâmicas
Uso de generics <T>
Simulação de LIFO usando FIFO
Controle manual de memória em arrays
Manipulação de nós encadeados
Resolução de problemas clássicos de TAD
Comparação entre abordagens diferentes
# ▶️ Exemplo de Execução (Geral)
Push: 10
Push: 20
Push: 30

Stack:
30 -> 20 -> 10

Pop:
30

Fila:
10 -> 20

# 👨‍💻 Autor

Marcos Antonio de Oliveira Filho  
Curso: Análise e Desenvolvimento de Sistemas  
Disciplina: Estrutura de Dados I
