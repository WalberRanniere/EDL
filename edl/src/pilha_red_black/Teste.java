package pilha_red_black;


public class Teste {
    public static void main(String[] args) throws Exception {

        Pilha pilha = new Pilha(4);
        System.out.println("Vazia? " + pilha.isEmptyRed());
        System.out.println("Tamanho: " + (pilha.sizeRed() + pilha.sizeBlack()));
        pilha.imprimir();

        pilha.pushRed(12);
        pilha.pushRed(14);
        pilha.pushBlack(100);
        pilha.pushBlack(2);
        pilha.pushRed(34);
        pilha.pushRed(74);
        pilha.pushRed(45);
        pilha.pushRed(3);
        pilha.pushRed(15);
        pilha.imprimir();
        System.out.println("Você tirou esse elemento Red: " + pilha.popRed());
        System.out.println("O elemento do topo Vermelho é: " + pilha.topRed());

        System.out.println("Você tirou esse elemento da pilha Black: " + pilha.popBlack());



        pilha.imprimir();

    }
}
