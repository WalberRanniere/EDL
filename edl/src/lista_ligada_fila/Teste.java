package lista_ligada_fila;

public class Teste {
    public static void main(String[] args) throws FilaVaziaException{
        ListaLigadaFila fila = new ListaLigadaFila();

        System.out.println("A Fila está vazia? " + fila.isEmpty());

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);

        System.out.println("A Fila está vazia? " + fila.isEmpty());
        System.out.println("Tamanho da Fila: " + fila.size());

        fila.imprimir();

        System.out.println("O primeiro da Fila " + fila.first());
        System.out.println("Vamos Tirar esse elemento: " + fila.dequeue());

        System.out.println("O primeiro da Fila " + fila.first());
        System.out.println("Vamos Tirar esse elemento: " + fila.dequeue());
        System.out.println("Vamos Tirar esse elemento: " + fila.dequeue());
        
        fila.imprimir();
    }
}
