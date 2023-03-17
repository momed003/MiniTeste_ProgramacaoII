/**
 * Crie uma classe Retângulo com os seguintes atributos: base e altura.
 * Crie um construtor para a classe que receba esses dois atributos e inicialize-os adequadamente.
 * Em seguida, crie um método chamado calcularArea que retorna a área do retângulo (base * altura).
 * Crie um objeto Retângulo e exiba sua área na tela.
 */
import  java.util.Scanner;
public class Retangulo_ex01 {
    private double altura;
    private double base;
    private double area;
//abaixo encontre o getter e setters que servem para acessibilidade das variaveis visto que elas sao privatas

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Retangulo_ex01(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public Retangulo_ex01(){

    }

    public double CalcularArea(){//este metodo e responsavel por todos processo aritmetico do programa
        Scanner e=new Scanner(System.in);

        System.out.println("Digite o valor da base");//buscando o valor por teclado
        base=e.nextInt();//pegando o valor inseriodo e guardando numa variavel

        System.out.println("Digite o valor da altura");//buscando o valor por teclado
        altura=e.nextInt();//pegando o valor inseriodo e guardando numa variavel

         area=base*altura;//manipulando o resultado desejado
        System.out.println("area: "+ area);//imprimindo para o usuario
        return  area;
    }


    public static void main(String[] args) {
        Retangulo_ex01 ret=new Retangulo_ex01(); //criando um objecto que usara o metodo calcular area
        ret.CalcularArea();
    }
}
