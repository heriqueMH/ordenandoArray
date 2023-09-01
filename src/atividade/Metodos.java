package atividade;

public class Metodos {

    Gamer[] A; // armazena os elementos do vetor (tipo da lista)
    int capacity; // capacidade do vetor (física)
    int size; // elementos no vetor

    public Metodos(int capacity) {
        A = new Gamer[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        // verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        // retorna quantos elementos existem no vetor
        return size;
    }

    public Gamer get(int i) throws Exception {
        // retorna o conteúdo da posição i do vetor
        if (i >= size) {
            throw new Exception("Posição inexistente");
        }
        return A[i];
    }

    public void set(int i, Gamer n) throws Exception {
        // altera o conteúdo da posição i pelo valor de n
        if (i >= size) {
            throw new Exception("Posição inexistente");
        }
        A[i] = n;
    }

    public int buscaPos(Gamer g) {
        int i;
        if (isEmpty()) {
            return 0;
        }

        for (i = 0; i < size(); i++) {
            if (g.score > A[i].score) {
                return i;
            }
        }
        // Se não encontrou uma posição anterior, insere no final
        return i;
    }

    public void buscaName(int i){
        System.out.println("O primeiro colocado é: " + A[i].name + "\n");
    }


    public void add(int i, Gamer g) throws Exception {
        int pos = buscaPos(g); // Encontra a posição de inserção ordenada
        
        // Insere n na posição i
        if (i > size) {
            throw new Exception("Posição inválida para inserção...");
        }

        // if (size > capacity){
        //     size = capacity;
        //     A[pos] = g;
        // }

        for (int j = size - 1; j >= pos; j--) {
            A[j + 1] = A[j];
        }
        A[pos] = g;
        size++;   
    }  

    public void remove(int i) throws Exception {
        //exclui a posição i do vetor
        if (i > size) {
            throw new Exception("Posição inválida para exclusão...");
        }
        if (isEmpty()) {
            throw new Exception("Lista vazia... impossível excluir");
        }
        for (int j = i - 1; j <= size; j++) {
            A[j] = A[j + 1];
        }
        size--;
    }
    
    // public int search(Gamer n) {
    //     // busca n no vetor A
    //     for (int i = 0; i < size; i++) {
    //         if (A[i].equals(n)) {
    //             return i;
    //         }
    //     }
    //     return 404;
    // }

    public void mostraArray() {
        // exibe o conteúdo da lista
        for (int i = 0; i < size; i++) {
            A[i].mostraGamer();
            System.out.println("");

        }
        System.out.println("\nFIM DA LISTA\n");
    }
}
