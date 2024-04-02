package pilha_com_duas_filas;

public class PilhaComDuasFilas{
    private Fila input;
    private Fila output;
    private int tamanho;

    public PilhaComDuasFilas() {
        tamanho = 0;
        input = new Fila(2);
        output = new Fila(2);
    }

    public void push(Object obj ){
        input.enqueue(obj);
        tamanho++;
    } 


    public Object pop() throws FilaVaziaException {
        if (isEmpty()) {
            throw new FilaVaziaException("A pilha está vazia");
        } else {
            input.inverterFila();
            transferirDoInputProOutput();
            tamanho--;
            return output.dequeue();
        }
    }

    public Object top() throws FilaVaziaException {
        if (isEmpty()) {
            throw new FilaVaziaException("A pilha está vazia");
        } else {
            transferirDoInputProOutput();
            return output.first();
        }
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public int size() {
        return tamanho;
    }

    public void imprimir() throws PilhaVaziaException {
        if(isEmpty()){
            System.out.println("[ ]");
            return;
        }
        transferirDoOutputProInput();
        input.imprimir();
    }

    public void transferirDoInputProOutput(){
        while (!input.isEmpty()) {
            output.enqueue(input.dequeue());
        }
    }

    public void transferirDoOutputProInput() throws PilhaVaziaException{
        while(!output.isEmpty()){
            input.enqueue(output.dequeue());
        }
    }

}