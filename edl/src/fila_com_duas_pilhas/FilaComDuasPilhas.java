package fila_com_duas_pilhas;


public class FilaComDuasPilhas {
    private int tamanho = 0;
    private Pilha input;
    private Pilha output;

    public FilaComDuasPilhas (){
        input = new Pilha(2);
        output = new Pilha(2);
    }

    public int size(){
        return tamanho;
    }

    public void enqueue(Object obj){
        input.push(obj);
        tamanho++;
    }

    public Object dequeue() throws FilaVaziaException, PilhaVaziaException{
        if(isEmpty()){
            throw new FilaVaziaException("A fila está vazia");
        } else {
           if(output.isEmpty()){
            transferirDoInputProOutput();
           } 
        }
        tamanho--;
        return output.pop();
    }

    public Object first() throws FilaVaziaException, PilhaVaziaException {
    if (isEmpty()) {
        throw new FilaVaziaException("A fila está vazia");
    } else {
        if (output.isEmpty()) {
            transferirDoInputProOutput();
        }
        return output.top();
    }
}

    public void imprimir() throws PilhaVaziaException {
        if(isEmpty()){
            System.out.println("[ ]");
            return;
        }
        transferirDoOutputProInput();
        input.imprimir();
    }


    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    public void transferirDoInputProOutput() throws PilhaVaziaException{
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }

    public void transferirDoOutputProInput() throws PilhaVaziaException{
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }


}
