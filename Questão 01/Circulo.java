/**
* Uma classe que mantém as informações sobre um círculo.
*/
public class Circulo
{
    // Os campos.
    private double raio = 1.0;
    private String cor = "vermelho";
    
    // Construtores
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }

    /* (a)
    Adicione à classe um _construtor_ que permita criar um `Circulo` com 
    dois marâmetros: um `double` para o `raio` e um `String` para `cor`. 
    Use a assinatura abaixo como base:
    */
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    // Métodos de acesso
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /* (c)
            Um aluno escreveu o seguinte código para a classe `Circulo`:
            */
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
    // O que a palavra `@Override` indica? Por que ela foi colocada neste método da classe?
    // Resposta:
    //    O @Override assegura que voce esta sobrescrevendo um metodo.
    //    Entao, caso seja alterado o nome do metodo somente na classe "pai", dara um erro, impedindo que um metodo novo seja criado.
}