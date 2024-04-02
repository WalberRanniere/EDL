package lista_ligada;

public class ListaLigada {
    private Node i, f;
    private int tamanho = 0;

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public int size() {
        return this.tamanho;
    }
    public Object last() {
        return this.f.getElemento();
    }

    public void add(Object elemento){
        Node no = new Node(elemento);
        if(this.tamanho == 0){
            this.i = no;
        } else{
            this.f.setProximo(no);
        }
        this.f = no;
        this.tamanho++;
    }

    public void removeNoInicio() throws ListaLigadaException{
        if(isEmpty()){
            throw new ListaLigadaException("A Fila está Vazia");
        }
        this.i = i.getProximo();
        this.tamanho--;
    }

    public Object removeNoFim() throws ListaLigadaException{
        if(isEmpty()){
            throw new ListaLigadaException("A Fila está Vazia");
        }
        Node fim = this.f;
        if (tamanho == 1){
            this.i = null;
            this.f = null;
            this.tamanho--;
            return fim.getElemento();
        }
        Node no = this.i;
        for(int i = 1; i < this.tamanho-1; i++){
            no = no.getProximo();
        }
        no.setProximo(null);
        this.f = no;
        this.tamanho--;
        return fim.getElemento();
    }

    public Object buscar(int indice) throws ListaLigadaException{
        if(indice < 0 || indice >= tamanho){
            throw new ListaLigadaException("O índice não está contemplando a Lista");
        }
        Node no = this.i;
        for(int i = 0; i < tamanho; i++){
            if(i == indice){
             break ;  
            }
            no = no.getProximo();
        }
        return no.getElemento();   
    }
}
