package Aula2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Você está de volta em seu hotel na Tailândia depois de um dia de mergulhos. O seu quarto tem duas lâmpadas, chamadas
    de A e B. No hotel há dois interruptores, que chamaremos de C1 e C2. Ao apertar C1, a lâmpada A acende se estiver
    apagada, e apaga se estiver acesa. Se apertar C2, cada uma das lâmpadas A e a B troca de estado: se estiver apagada,
    fica acesa e se estiver acesa apaga.

    Você chegou no hotel e encontrou as lâmpadas em um determinado estado, como foram deixadas por seu amigo. Vamos chamar
    o estado inicial da lâmpada A de IA e o estado inicial da lâmpada B de IB. Você gostaria de deixar as lâmpadas em uma
    certa configuração final, que chamaremos de FA e FB, respectivamente, apertando os interruptores a menor quantidade de
    vezes possível. Por exemplo, se as duas lâmpadas começam apagadas, e você quer que apenas a lâmpada A termine acesa,
    basta apertar o interruptor C1.

    Faça um programa que leia os estados iniciais IA e IB e os estados finais desejados FA e FB das duas lâmpadas.
    Os valores de IA, IB, FA e FB são lidos na mesma linha nessa ordem. Seus valores possíveis são 0, se a lâmpada estiver
    apagada e 1 caso contrário. Ao final, seu programa deverá imprimir o número mínimo de interruptores que devem ser
    apertados.

    Exemplos de entrada e saída:
    Entrada	| Saída
    0 0 1 1	| 1
    0 0 0 1	| 2
    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        int ia = leitor.nextInt();
        int ib = leitor.nextInt();
        int fa = leitor.nextInt();
        int fb = leitor.nextInt();
        Ex04 ex = new Ex04();
        ex.compute(ia,ib,fa,fb);
    }

    int compute(int ia, int ib, int fa, int fb) {
        int output = -1;
        int[] estadoAtualLampadas = {ia , ib};
        output = 0;
        while(estadoAtualLampadas[0] != fa || estadoAtualLampadas[1]!=fb){
            if (fa == fb){
                if (estadoAtualLampadas[0] == estadoAtualLampadas[1]){
                    estadoAtualLampadas = segundoInterruptor(estadoAtualLampadas);
                }
                else{
                    estadoAtualLampadas = primeiroInterruptor(estadoAtualLampadas);
                }
            }
            else{
                if (estadoAtualLampadas[0] == estadoAtualLampadas[1]){
                    estadoAtualLampadas = primeiroInterruptor(estadoAtualLampadas);
                }
                else {
                    estadoAtualLampadas = segundoInterruptor(estadoAtualLampadas);
                }
            }
            output += 1;
        }
        return output;
    }
    private static int trocaEstadoLampada(int numero){
        if (numero == 1){
             numero = 0;
        }
        else if (numero == 0){
            numero = 1;
        }
        return numero;
    }
    private static int[] primeiroInterruptor(int[] estadoAtualLampadas){
        estadoAtualLampadas[0] = trocaEstadoLampada(estadoAtualLampadas[0]);
        return estadoAtualLampadas;
    }

    private static int[] segundoInterruptor(int[] estadoAtualLampadas){
        estadoAtualLampadas[0] = trocaEstadoLampada(estadoAtualLampadas[0]);
        estadoAtualLampadas[1] = trocaEstadoLampada(estadoAtualLampadas[1]);
        return estadoAtualLampadas;
    }
}
