package Aula2.Exercicios;

/*
    Clara está organizando as fotos da sua última viagem num álbum de fotos. Como ela tem muitas fotos, para economizar
    páginas do álbum ela quer colar duas fotos por página do álbum.

    Como as fotos são retangulares, as fotos podem ser coladas giradas (mas sempre com lados paralelos aos da página do
    álbum, para preservar o equilíbrio estético do álbum), mas elas devem sempre ficar inteiramente contidas no interior
    da página, e não devem se sobrepor.

    Em geral, das muitas formas de posicionar as fotos do álbum só algumas (ou nenhuma) satisfazem estas restrições,
    então pode ser difícil decidir se é possível colar as duas fotos em uma mesma página do álbum e, por isso, Clara
    pediu a sua ajuda para escrever um programa que, dadas as dimensões da página e das fotos, decide se é possível
    colar as fotos na página.

    Por exemplo, cada página pode ser 5×7, e duas fotos são 3×4. Nesse caso, é possível colar as duas fotos:
    https://olimpiada.ic.unicamp.br/static/img/task_images/2012f2p2_album.png

    Faça um programa que receba como entrada na primeira linha dois inteiros X e Y, indicando a largura e a altura
    da página do álbum. Cada uma das duas linhas seguintes contém dois inteiros L e H, indicando a largura e a altura
    das fotos.

    Seu programa deve imprimir uma única linha, contendo um único caractere: "S", se é possível colar as duas fotos na
    página do álbum, e "N", caso contrário.

    Exemplos de entrada e saída:

    | Entrada            | Saída  |
    | -------            | ------ |
    | 7 5                | S      |
    | 3 4                |        |
    | 3 4                |        |
    | -------            | ------ |
    | 10 10              | N      |
    | 6 6                |        |
    | 6 6                |        |


    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex07 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(int x, int y, int l1, int h1, int l2, int h2) {
        String output = null;
        boolean possivelMontar = montaAlbum(x,y,l1,h1,l2,h2);
            if (possivelMontar) output = "S";
            else output = "N";
        return output;
    }

    private static boolean montaAlbum (int x, int y, int l1, int h1, int l2, int h2){
        int[] primeiraFotoHorizontal = {l1,h1};
        int[] primeiraFotoVertical = {h1,l1};
        int[] segundaFotoHorizontal = {l2,h2};
        int[] segundaFotoVertical = {h2,l2};
        int[] espacoAlbum = {x,y};
        int[][] configuracoesPrimeiraFoto = {primeiraFotoHorizontal,primeiraFotoVertical};
        int[][] configuracoesSegundaFoto = {segundaFotoHorizontal,segundaFotoVertical};
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 2;j++){
                espacoAlbum = addFoto(espacoAlbum , configuracoesPrimeiraFoto[i]);
                espacoAlbum = addFoto(espacoAlbum , configuracoesSegundaFoto[j]);
                if (espacoAlbum[0] == -1){
                    espacoAlbum[0] = x;
                    espacoAlbum[1] = y;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] addFoto(int[] espacoAlbum, int[] foto){
        if (espacoAlbum[0] - foto[0] >= 0 && espacoAlbum[1] - foto[1] >=  0) {
            espacoAlbum[0] -= foto[0];
        }
        else{
            espacoAlbum[0] = -1;
            espacoAlbum[1] = -1;
        }
        return espacoAlbum;
    }
}
