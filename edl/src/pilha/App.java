package pilha;
public class App {
    public static void main(String[] args) throws PilhaVaziaException {
        
        Pilha pilha = new Pilha(5);
        System.out.println("Vazia? " + pilha.isEmpty());
        System.out.println("Tamanho: " + pilha.size());
        
        pilha.push(3);
        pilha.push(6);
        pilha.push(2);
        pilha.push(7);
        pilha.push(5);
        Object x = pilha.top();
        System.err.println(x);

        /* int c = 0;
        while(c == 0) {
            for (int i = 0; i < pilha.size(); i++){
                

            }
        } */

        pilha.imprimir();
        
    }
}
