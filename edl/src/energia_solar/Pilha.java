package energia_solar;

public class Pilha implements IPilha {
    private int t, tamanho, linha_de_forca;
    private Object[] p;
    
    public Pilha(int tamanho, int linha_de_forca){
        this.tamanho = tamanho;
        this.linha_de_forca = linha_de_forca;
        t = -1;
    }

    public void loop(Object obj){
        for (int i = 0; i <= p.length;i++){
            
        }
    }

    public void push(Object obj) {
        
    }

    public Object pop() throws PilhaVaziaException {
        if (isEmpty()) {
            throw new PilhaVaziaException("A pilha está vazia");
        } else {
            return p[t--];
        }
    }

    public Object top() throws PilhaVaziaException {
        if (isEmpty()) {
            throw new PilhaVaziaException("A pilha está vazia");
        } else {
            return p[t];
        }
    }

    public void empty() {
        t = -1;
    }

    public boolean isEmpty() {
        return t == -1;
    }

    public int size() {
        return t + 1;
    }

    public void imprimir() {
        System.out.print("Pilha = [ ");
        for (int i = 0; i < size(); i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println("]");
    }

}

