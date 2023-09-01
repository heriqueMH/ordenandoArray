package atividade;

public class Atividade {

    public static void main(String[] args) throws Exception {
        Metodos lista = new Metodos(10);

        Gamer g1 = new Gamer("  MH       ", 10000);
        Gamer g2 = new Gamer("Gabriel    ", 5000);
        Gamer g3 = new Gamer("Ricardo    ", 8000);
        Gamer g4 = new Gamer("Junin      ", 500);
        Gamer g5 = new Gamer("Carlos     ", 20000);
        // Gamer g6 = new Gamer("Andre      ", 2000);
        

        int pos = lista.buscaPos(g1);
        pos = lista.buscaPos(g2);
        pos = lista.buscaPos(g3);
        pos = lista.buscaPos(g4);
        pos = lista.buscaPos(g5);
        // pos = lista.buscaPos(g6);

        lista.add(pos, g1);
        lista.add(pos, g2);
        lista.add(pos, g3);
        lista.add(pos, g4);
        lista.add(pos, g5);
        // lista.add(pos, g6);
        
        lista.mostraArray();

        lista.buscaName(0);

        lista.remove(3);

        System.out.println("Lista após remoção da terceira posição:");
        lista.mostraArray();


        

    }
}
