package lista_ligada;

public class Node {
    private Object elemento;
    private Node proximo;

    public Node(Object elemento, Node proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Node(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(Object elemento){
        this.elemento = elemento;
    }

    public Node getProximo(){
        return proximo;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }
}
