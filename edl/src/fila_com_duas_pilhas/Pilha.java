package fila_com_duas_pilhas;

public class Pilha implements IPilha{
    private int t, tamanho;
    private Object[] p;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        t = -1;
        p = new Object[tamanho];
    }

    public void push(Object obj ){
        if (t + 1 == p.length) {
            tamanho *= 2;
            Object[] a = new Object[tamanho];
            for (int i = 0; i <= t; i++){
                a[i] = p[i];
            }
            p = a;
        }
        p[++t] = obj;
        /* if (t ==  p.length - 1){
            tamanho += 1000;
            Object[] a = new Object[tamanho];
            for (int i = 0; i <= t; i++){
                a[i] = p[i];
            }
            p = a;
        }
        p[++t] = obj; */
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
        System.out.print("Fila com 2 Pilhas = [ ");
        for (int i = 0; i < size(); i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println("]");
    }

}

