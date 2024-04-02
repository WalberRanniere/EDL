package energia_solar;
import java.util.ArrayList;
import java.util.Arrays;

import pilha.Pilha;
import pilha.PilhaVaziaException;

public class EnergiaSolar {
    public static void main(String[] args) throws PilhaVaziaException {

        int[] p = {3,6,2,7,5};
        ArrayList<Integer> ind = new ArrayList<>();
        boolean first_time = true; // verificar se é o primeiro push na pilha, tendo que criar uma nova pilha
        int qtd_push = 0; // Comparar com o length do array pra terminar o while
        int qtd_pilhas = 1; // Printar a Pilha com esse inteiro representando a linha de força

        while(qtd_push < p.length){
            Pilha pilha = new Pilha(4);
            boolean criar_pilha = true;
            for(int i = 0; i < p.length - 1; i++){
                if(criar_pilha){
                    if(first_time){
                        if(p[i] < p[i+1]){
                            pilha.push(p[i+1]);
                            qtd_push++;
                            first_time = false;
                            criar_pilha = false;
                            ind.add(i);
                            pilha.imprimir();
                        }else{
                            pilha.push(p[i]);
                            qtd_push++;
                            pilha.push(p[i+1]);
                            qtd_push++;
                            first_time = false;
                            criar_pilha = false;
                            ind.add(i);
                            ind.add(i+1);  
                        }                
                    }
                    
                } else{
                    System.err.println("Cheguei aqui!");
                    if(p[i+1] < p[i]){
                        pilha.push(i+1);
                        qtd_push++;
                        ind.add(i+1);
                        pilha.imprimir();
                    }
                }
                
            }
            System.out.print("A Linha de força " + qtd_pilhas + " é ");
            pilha.imprimir();
            qtd_pilhas++;

            for (int indice : ind) {
                if (indice >= 0 && indice < p.length) { 
                    p[indice] = 0;
                }
            }
            
            p = removerZeros(p);

        }
        

        
    }

    public static int[] removerZeros(int[] array){
        int count = 0;
        for (int valor : array) {
            if (valor != 0) {
                count++;
            }
        }

        
        int[] novoArray = new int[count];
        int index = 0;
        for (int valor : array) {
            if (valor != 0) {
                novoArray[index++] = valor;
            }
        }

        return novoArray;
    }
}
