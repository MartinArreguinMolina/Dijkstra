package NumeroUno;

public class Main {

    public static void main(String... args) {

        Grafo grafo;
        grafo = metodo();

        System.out.println(grafo.toString());
    }

    public static Grafo metodo() {
        Nodo Cero = new Nodo("Cero");
        Nodo Uno = new Nodo("Uno");
        Nodo Dos = new Nodo("Dos");
        Nodo Tres = new Nodo("Tres");
        Nodo Cuatro = new Nodo("Cuatro");
        Nodo Cinco = new Nodo("Cinco");
        Nodo Seis = new Nodo("Seis");
        Nodo Siete = new Nodo("Siete");
        Nodo Ocho = new Nodo("Ocho");
        Nodo Nueve = new Nodo("Nueve");

        Cero.AddAristas(new Arista(Cero, Siete, 89));
        Cero.AddAristas(new Arista(Cero, Uno, 39));

        Uno.AddAristas(new Arista(Uno, Cero, 39));
        Uno.AddAristas(new Arista(Uno, Dos, 46));
        Uno.AddAristas(new Arista(Uno, Siete, 189));

        Dos.AddAristas(new Arista(Dos, Uno, 46));
        Dos.AddAristas(new Arista(Dos, Tres, 88));
        Dos.AddAristas(new Arista(Dos, Ocho, 63));
        Dos.AddAristas(new Arista(Dos, Nueve, 78));

        Tres.AddAristas(new Arista(Tres, Dos, 88));
        Tres.AddAristas(new Arista(Tres, Cuatro, 85));

        Cuatro.AddAristas(new Arista(Cuatro, Tres, 85));
        Cuatro.AddAristas(new Arista(Cuatro, Nueve, 50));
        Cuatro.AddAristas(new Arista(Cuatro, Cinco, 45));

        Cinco.AddAristas(new Arista(Cinco, Cuatro, 45));
        Cinco.AddAristas(new Arista(Cinco, Ocho, 150));
        Cinco.AddAristas(new Arista(Cinco, Seis, 70));

        Seis.AddAristas(new Arista(Seis, Cinco, 70));
        Seis.AddAristas(new Arista(Seis, Ocho, 51));
        Seis.AddAristas(new Arista(Seis, Siete, 36));

        Siete.AddAristas(new Arista(Siete, Cero, 89));
        Siete.AddAristas(new Arista(Siete, Uno, 199));
        Siete.AddAristas(new Arista(Siete, Seis, 36));

        Ocho.AddAristas(new Arista(Ocho, Dos, 63));
        Ocho.AddAristas(new Arista(Ocho, Nueve, 50));
        Ocho.AddAristas(new Arista(Ocho, Cinco, 150));
        Ocho.AddAristas(new Arista(Ocho, Seis, 51));

        Nueve.AddAristas(new Arista(Nueve, Dos, 78));
        Nueve.AddAristas(new Arista(Nueve, Ocho, 50));
        Nueve.AddAristas(new Arista(Nueve, Cuatro, 50));

        Grafo grafo = new Grafo();
        grafo.addNodos(Cero);
        grafo.addNodos(Uno);
        grafo.addNodos(Dos);
        grafo.addNodos(Tres);
        grafo.addNodos(Cuatro);
        grafo.addNodos(Cinco);
        grafo.addNodos(Seis);
        grafo.addNodos(Siete);
        grafo.addNodos(Ocho);
        grafo.addNodos(Nueve);
        

        return grafo;
    }
}
