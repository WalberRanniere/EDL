package pilha_red_black;

public interface IPilha {
    public int sizeRed();

    public int sizeBlack();

    public boolean isEmptyRed();

    public boolean isEmptyBlack();

    public Object topRed() throws PilhaRedVaziaException;

    public Object topBlack() throws PilhaBlackVaziaException;
    
    public void pushRed(Object obj);

    public void pushBlack(Object obj);

    public Object popRed() throws PilhaRedVaziaException;

    public Object popBlack() throws PilhaBlackVaziaException;

    public void emptyRed();

    public void emptyBlack();
}
