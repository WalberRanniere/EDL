package lista_ligada_fila;

public class ListaLigadaFila {
    private Node i;
    private Node f;
    private int tamanho = 0;

    public ListaLigadaFila(){
        i = null;
        f = null;
    }

    public int size(){
        return tamanho;
    }

    public void enqueue(Object obj){
        Node newNode = new Node(obj);
        if(isEmpty()){
            i = newNode;
        } else {
            f.setProximo(newNode);
        }
        f = newNode;
        tamanho++;
    }

    public Object dequeue() throws FilaVaziaException{
        if(isEmpty()){
            throw new FilaVaziaException("A Fila está totalmente vazia!");
        }
        Object elemento = i.getElemento();
        i = i.getProximo();
        if(i == null){
            f = null;
        }
        tamanho--;
        return elemento;
    }

    public Object first() throws FilaVaziaException{
        if(isEmpty()){
            throw new FilaVaziaException("A Fila está totalmente vazia!");
        }
        return i.getElemento();
    }

    public boolean isEmpty() {
        return i == null;
    }

    public void imprimir(){
        System.out.print("Fila = [ ");
        Node node = i;
        while (node != null) {
            System.out.print(node.getElemento() + " ");
            node = node.getProximo();
        }
        System.out.println("]");
    }


}
