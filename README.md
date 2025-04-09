# aTVmERGE
Repositório criado para a atividade 2.

Descrição do Projeto:
Este projeto implementa algumas estruturas de dados clássicas em Java, como pilha e fila, além de operações como a fusão dessas estruturas. O objetivo é demonstrar o uso de listas encadeadas para construir essas estruturas, bem como realizar a mesclagem de duas filas e de dois vetores ordenados.

Estruturas Implementadas:
Pilha (Stack)
A classe Pilha implementa a estrutura de dados pilha utilizando listas encadeadas. A pilha segue o princípio LIFO (Last In, First Out), ou seja, o último elemento inserido é o primeiro a ser removido.

Principais métodos:
inserir(String valor): Insere um novo elemento no topo da pilha.

remover(): Remove e retorna o elemento do topo da pilha.

imprimir(): Imprime todos os elementos da pilha, do topo ao fundo.

Fila (Queue)
A classe Fila implementa a estrutura de dados fila utilizando listas encadeadas. A fila segue o princípio FIFO (First In, First Out), ou seja, o primeiro elemento inserido é o primeiro a ser removido.

Principais métodos:
insere(String dado): Insere um novo elemento no final da fila.

remove(): Remove e retorna o elemento do início da fila.

imprime(): Imprime todos os elementos da fila, do início ao fim.

Mesclagem de Filas
A classe Merge oferece um método estático merge() que recebe duas filas ordenadas e retorna uma nova fila contendo os elementos de ambas, mantendo a ordem.

Mesclagem de Vetores
A classe MergeVetor implementa a mesclagem de dois vetores ordenados. O método mergeQueues(int[] A, int[] B) recebe dois vetores inteiros ordenados e retorna um novo vetor contendo os elementos de ambos, ordenados.

Funcionamento:
O algoritmo compara os elementos de dois vetores e os insere no vetor resultante de forma ordenada.

O código garante que, caso um vetor termine antes do outro, os elementos restantes do vetor não consumido sejam adicionados ao vetor resultante.

Como Funciona o Código
O código principal, dentro da classe Main, cria instâncias das estruturas de dados e executa operações sobre elas. A seguir, um resumo do fluxo de execução:

Pilha:

A pilha é inicializada e três elementos são inseridos.

Em seguida, é feita a remoção de um elemento, e a pilha é impressa após cada operação.

Fila:

A fila é inicializada e três elementos são inseridos.

Após isso, um elemento é removido e a fila é impressa.

Mesclagem de Filas:

Duas filas ordenadas são criadas e preenchidas com elementos.

A função merge() é chamada para combinar essas duas filas em uma terceira fila.

Mesclagem de Vetores:

Dois vetores ordenados são criados.

A função mergeQueues() da classe MergeVetor é chamada para combinar esses dois vetores em um novo vetor, mantendo a ordem.
