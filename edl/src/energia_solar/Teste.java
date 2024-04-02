package energia_solar;

public class Teste {
    public static void main(String[] args) throws PilhaVaziaException{
        Pilha pilha = new Pilha(10, 1);
        System.out.println("Vazia? " + pilha.isEmpty());
        System.out.println("Tamanho: " + pilha.size());
        pilha.imprimir();
        
    }
}
