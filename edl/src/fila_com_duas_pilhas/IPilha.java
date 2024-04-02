package fila_com_duas_pilhas;

public interface IPilha {

    public int size();

    public boolean isEmpty();

    public Object top() throws PilhaVaziaException;
    
    public void push(Object obj);

    public Object pop() throws PilhaVaziaException;

    public void empty();

}