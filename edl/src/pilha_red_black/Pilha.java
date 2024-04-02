package pilha_red_black;

public class Pilha implements IPilha {
    private int r, b, tamanho;
    private Object[] p;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        r = -1;
        b = tamanho;
        p = new Object[tamanho];
    }

    public void pushRed(Object obj ){
        if (r + 1 == b) {
            tamanho *= 2;
            int b2 = b;
            int qtd_black = p.length - b;
            Object[] a = new Object[tamanho];
            for (int i = 0; i <= r; i++){
                a[i] = p[i];
            }
            for (int j = a.length-qtd_black; j <= a.length-1; j++){
                a[j] = p[b2];
                b2++;
            }
            b = b + b2;
            p = a;
        }
        p[++r] = obj;

    }

    public void pushBlack(Object obj  ){
        if (r + 1 == b) {
            int b2 = b;
            int qtd_black = p.length - b;
            tamanho *= 2;
            Object[] a = new Object[tamanho];
            for (int i = 0; i <= r; i++){
                a[i] = p[i];
            }
            for (int j = a.length-qtd_black; j <= a.length-1; j++){
                a[j] = p[b2];
                b2++;
            }
            System.err.println(b);
            System.err.println(b2);

            b = b + b2;
            p = a;
        }
        p[--b] = obj;

    }

    public Object popRed() throws PilhaRedVaziaException {
        if (isEmptyRed()) {
            throw new PilhaRedVaziaException("A pilha Vermelha está vazia");
        } else {
            var valor_removido = p[r];
            p[r] = null;
            r--;
            return valor_removido;
        }
    }

    public Object popBlack() throws PilhaBlackVaziaException {
        if (isEmptyBlack()) {
            throw new PilhaBlackVaziaException("A pilha Preta está vazia");
        } else {
            var valor_removido = p[b];
            p[b] = null;
            b++;
            return valor_removido;
        }
    }

    public Object topRed() throws PilhaRedVaziaException {
        if (isEmptyRed()) {
            throw new PilhaRedVaziaException("A pilha Red está vazia");
        } else {
            return p[r];
        }
    }

    public Object topBlack() throws PilhaBlackVaziaException {
        if (isEmptyBlack()) {
            throw new PilhaBlackVaziaException("A pilha Black está vazia");
        } else {
            return p[b];
        }
    }

    public void emptyRed() {
        r = -1;
    }

    public void emptyBlack() {
        b = p.length;
    }

    public boolean isEmptyRed() {
        return r == -1;
    }

    public boolean isEmptyBlack() {
        return b == -1;
    }

    public int sizeRed() {
        return r + 1;
    }

    public int sizeBlack() {
        return b - (tamanho-1);
    }

    

    public void imprimir() {
        System.out.print("Pilha = [ ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println("]");
    }
}
