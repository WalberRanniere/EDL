package fila_com_duas_pilhas;

public class Teste {
    public static void main(String[] args) throws FilaVaziaException, PilhaVaziaException{
        FilaComDuasPilhas fila = new FilaComDuasPilhas();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);

        fila.imprimir();

        System.out.println("O tamanho da nossa fila é: " + fila.size());

        System.out.println("Vamos tirar esse elemento: " + fila.dequeue());
        System.out.println("Vamos tirar esse elemento: " + fila.dequeue());
        System.out.println("Nosso primeiro elemento agora é: " + fila.first());

        fila.imprimir();

    }
}
