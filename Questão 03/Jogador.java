import java.util.ArrayList;

/*
Implemente uma classe `Jogador` que contenha os atributos: `mao`, 
do tipo `Carta[]` (um vetor de cartas) e `indiceMao` do tipo `int`. 
A `mao` deve ter tamanho `3`. O `indiceMao` servirá para indicar qual 
carta da mão foi selecionada. Essa classe deve ter um construtor padrão 
(sem receber nenhum parâmetro) que inicializa a `mao` 
(inicializa o vetor) e inicializa o valor do `indiceMao` com `0`. 
O jogador também deve ter um método `recebeCarta(Carta c)` que insere 
uma carta no vetor `mao`, na posição `indiceMao`. Você deve incrementar 
`indiceMao` após receber a carta. 
*/
public class Jogador {
    private ArrayList<Carta> mao;
    private int indiceMao;

    Jogador() {
        this.mao = new ArrayList<Carta>(3);
        this.indiceMao = 0;
    }

    public ArrayList<Carta> getMao() {
        return mao;
    }

    public int getIndiceMao() {
        return indiceMao;
    }

    public void recebeCarta(Carta c) {
        this.mao.add(indiceMao, c);
        this.indiceMao++;
    }
}
