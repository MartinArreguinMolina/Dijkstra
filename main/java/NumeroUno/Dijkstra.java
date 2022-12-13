package NumeroUno;

import java.io.*;
import java.util.*;

public class Dijkstra {

    public static void main(String... args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int n;
        int m;
        String[] num;
        entrada = bufer.readLine();

        num = entrada.split(" ");

        n = Integer.parseInt(num[0]);
        m = Integer.parseInt(num[1]);

        ArrayList<ArrayList<Destino>> lista = new ArrayList<>();
        ArrayList<Destino> aux = new ArrayList<>();
        ArrayList<Destino>[] listaAdyacencia = new ArrayList[n];

        for (int i = 0; i < m; i++) {

            int u, v, c;
            entrada = bufer.readLine();
            num = entrada.split(" ");

            u = Integer.parseInt(num[0]);
            v = Integer.parseInt(num[1]);
            c = Integer.parseInt(num[2]);

            if (listaAdyacencia[u] == null) {
                listaAdyacencia[u] = new ArrayList<>();
                listaAdyacencia[u].add(new Destino(v, c));
            } else {
                listaAdyacencia[u].add(new Destino(v, c));
            }

            if (listaAdyacencia[v] == null) {
                listaAdyacencia[v] = new ArrayList<>();
                listaAdyacencia[v].add(new Destino(u, c));
            } else {
                listaAdyacencia[v].add(new Destino(u, c));
            }

        }

        for (int i = 0; i < listaAdyacencia.length; i++) {
            System.out.println(listaAdyacencia[i]);
        }
        System.out.println("");

        int ini;
        ini = Integer.parseInt(entrada = bufer.readLine());
        ArrayList<Destino> cola = new ArrayList<>();

        cola.add(new Destino(ini, 0));
        ArrayList<Integer> visto = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            visto.add(-1);
        }

        do {
            Collections.sort(cola, (Destino uno, Destino dos) -> new Integer(uno.getPeso()).compareTo(dos.getPeso()));
            Destino actual = cola.get(0);
            cola.remove(0);
            if (visto.get(actual.vertice) == -1) {
                visto.set(actual.vertice, actual.peso);
                aux = listaAdyacencia[actual.vertice];
                for (Destino vecino : aux) {
                    cola.add(new Destino(vecino.getVertice(), vecino.getPeso() + actual.peso));
                }
            }
        } while (!cola.isEmpty());

        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + visto.get(i));
        }
    }
}
