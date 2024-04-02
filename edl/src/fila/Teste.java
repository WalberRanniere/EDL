package fila;

public class Teste {
    public static void main(String[] args) throws FilaVaziaException{
        Fila fila = new Fila(6);
        System.out.println("Tamanho da Fila: " + fila.size());

        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);
        fila.enqueue(8);

        fila.imprimir();

        System.out.println("Está vazia? " + fila.isEmpty());

        System.out.println("Tirei esse elemento: " + fila.dequeue());
        System.out.println("Tamanho da Fila: " + fila.size());

        fila.enqueue(9);


        fila.imprimir();

        System.out.println("O primeiro elemento é: " + fila.first());
    } 
}
