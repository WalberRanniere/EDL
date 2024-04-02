package pilha_com_duas_filas;


public class Fila implements IFila {
    private int i,f, tamanho;
    private Object[] q;

    public Fila (int tamanho){
        this.tamanho = tamanho;
        i = 0;
        f = i;
        q = new Object[tamanho];
    }

    public int size(){
        return (tamanho - i + f) % tamanho;
    }

    public void enqueue(Object obj){
        if(size() == tamanho - 1){
            tamanho *= 2;
            Object[] a = new Object[tamanho];
            int inicio = i;
            for(int j = 0; j < size(); j++){
                a[j] = q[inicio];
                inicio = (inicio+1) % tamanho;
            }
            f = size();
            i = 0;
            q = a;
        }
        q[f] = obj;
        f = (f+1) % tamanho;
    }


    public Object dequeue(){
        if(isEmpty()){
            throw new FilaVaziaException("A fila está vazia");
        } else {
            Object o = q[i];
            i = (i+1) % tamanho;
            return o;
        }
    }

    public Object first() {
        if (isEmpty()){
            throw new FilaVaziaException("A Fila está vazia");
        } else {
            return this.q[i];
        }
    }

    public void imprimir() {
        System.out.print("Fila = [ ");
        for (int j = 0; j < tamanho-1 ; j++) {
            System.out.print(q[j] + " ");
        }
        System.out.println("]");
    }


    public boolean isEmpty(){
        return (f == i);
    }

    public void inverterFila(){
        if(isEmpty()){
            throw new FilaVaziaException("A fila está vazia");
        }
        Object[] a = new Object[tamanho];
        int j = 0;
        for (int i = tamanho - 1; i >= 0; i--) {
            a[j] = q[i];
            j++;
        }
        q = a;
        imprimir();
    }


}
