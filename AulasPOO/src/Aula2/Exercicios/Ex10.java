package Aula2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Um robô possui um sensor de infravermelho para navegação e mapeamento que emite 181 feixes com um intervalo de um
    grau entre cada um deles (-90° na extrema-esquerda (feixe 0), 0° no centro (feixe 90) e 90° na extrema direita
    (feixe 180)). O sensor está perfeitamente alinhado ao robô, sendo que o feixe 90 aponta para a frente. Cada feixe
    possui alcance máximo de oito metros e uma medida inferior a isso indica que há um obstáculo mais próximo no ambiente.
    Considerando-se que o robô possui um GPS sem erro, é possível obter sua posição exata (x1, y1) em um plano cartesiano.
    Utilize coordenadas polares para calcular a posição de um ponto de colisão no ambiente a partir das coordenadas "x1" e
    "y1" da posição do robô, do ângulo "a" de orientação do robô no plano (em graus), de um número "f" indicando feixe
    escolhido e da distância "d" medida pelo feixe d >=0). Por questão de simplificação, utilize valores inteiros para as
    coordenadas do robô e do obstáculo (saída esperada), bem como para o ângulo do robô e a distância medida pelo feixe.
    O valor da saída esperada deverá ser arredondado para inteiro, não truncado. Dica: os métodos Math.sin(a) e Math.con(a)
    utilizam valores em radianos e não graus.

    Os números devem lidos na mesma linha, sendo os formatos de entrada e saída descritos a seguir:

    Modelo de entrada: x1 y1 a f d | Modelo de saída: (x2, y2)

     Exemplos de entrada e saída:

    | Entrada                | Saída    |
    | -------                | ------   |
    | 0 0 45 45 5            | (0,5)    |
    | 10 10 45 45 10         | (10,20)  |
    | -4 4 45 135 4          | (0,4)    |
    | 0 0 0 135 4            | (3,-3)   |

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex10 ex = new Ex10();
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int a = leitor.nextInt();
        int f = leitor.nextInt();
        int d = leitor.nextInt();
        ex.compute(x,y,a,f,d);
    }

    String compute(int x, int y, int a, int f, int d) {
        String output = null;
        if (a>=0 && f>=0 && d>=0){
            int anguloDoFeixe = (f - 90) * (-1);
            double anguloRelativoEmRadiano = Math.toRadians(anguloDoFeixe + a);
            double x2 = Math.round((Math.cos(anguloRelativoEmRadiano) * d) + x);
            double y2 = Math.round((Math.sin(anguloRelativoEmRadiano) * d) + y);
            output = String.format("(%.0f,%.0f)",x2,y2);
        }
        else{
            output = "Erro";
        }
        return output;
    }
}
