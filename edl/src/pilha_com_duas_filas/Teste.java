package pilha_com_duas_filas;

public class Teste {
    public static void main(String[] args) throws FilaVaziaException, PilhaVaziaException{
        PilhaComDuasFilas pilha = new PilhaComDuasFilas();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);

        System.out.println("O Tamanho da Pilha é: " + pilha.size());
        pilha.imprimir();

        System.out.println("Vamos tirar esse elemento: " + pilha.pop());
        System.out.println("Vamos tirar esse elemento: " + pilha.pop());

        System.out.println("O Topo agora é: " + pilha.top());


        pilha.imprimir();
    }
}
