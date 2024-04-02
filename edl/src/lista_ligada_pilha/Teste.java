package lista_ligada_pilha;

public class Teste {
    public static void main(String[] args) throws PilhaVaziaException{
        ListaLigadaPilha pilha = new ListaLigadaPilha();

        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);

        pilha.imprimir();

        System.out.println("Vamos tirar esse elemento da pilha:" + pilha.pop());
        System.out.println("O topo da Pilha agora é:" + pilha.top());

        pilha.imprimir();
    }
}
