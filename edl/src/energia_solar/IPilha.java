package energia_solar;

public interface IPilha {
    public int size();

    public void loop(Object obj);

    public boolean isEmpty();

    public Object top() throws PilhaVaziaException;
    
    public void push(Object obj);

    public Object pop() throws PilhaVaziaException;

    public void empty();
}
