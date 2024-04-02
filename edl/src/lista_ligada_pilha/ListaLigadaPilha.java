package lista_ligada_pilha;

public class ListaLigadaPilha {
    private Node t;
    private int tamanho = 0;

    public ListaLigadaPilha(){
        this.t = null;
    }

    public void push(Object elemento){
        Node newNode = new Node(elemento);
        newNode.setProximo(t);
        t = newNode;
        tamanho++;

        // Não preciso duplicar a pilha, pois é uma Lista Ligada hehe
    }

    public Object pop() throws PilhaVaziaException{
        if(isEmpty()){
            throw new PilhaVaziaException("Pilha Vazia!");
        }
        Object elemento = t.getProximo();
        t = t.getProximo();
        tamanho--;
        return elemento;
    }

    public Object top() throws PilhaVaziaException{
        if(isEmpty()){
            throw new PilhaVaziaException("Pilha Vazia!");
        }
        return t.getElemento();
    }

    public boolean isEmpty(){
        return t == null; 
    }

    public void imprimir() {
        Node node = t;
        System.out.print("Pilha = [ ");
        while (node != null) {
            System.out.print(node.getElemento() + " ");
            node = node.getProximo();
        }
        System.out.println("]");
    }

    public int size(){
        return tamanho;
    } 
}
