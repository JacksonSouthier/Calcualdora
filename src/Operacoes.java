import java.util.Scanner;

public class Operacoes{
/*
esta classe esta responsavel por todas as operacoes matematicas, usando variaveis
que o usuario digitar e guarda em uma variavel o resultado para ser salvo em um
arquivo local no fim da operacao
*/
    Historico historico = new Historico(this);

    Scanner entrada = new Scanner(System.in);
    
    double n1;
    double n2;
    double resultado;
    /*
    contrutores getter e setter para usar os valores das variaveis de forma
    mais facil em outras classes ou em metodos, no momento,
    usando o getResultado em Hisotirco.
    */
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

public double somar(){
/*
essa logica se repete em todas as opeacoes, pedindo entrada do n1 e n2.
*/
    System.out.println("Digite o primeiro número");
    n1 = entrada.nextDouble();
    System.out.println("Digite o segundo número");
    n2 = entrada.nextDouble();

    System.out.println(resultado = n1 + n2);
/*
aqui chama o metodo diretamente da classe historico que ira abrir/criar um aquivo
para salvar o resultado
*/
    historico.salvarHistorico();

    return resultado;
}
public double subtrair(){

    System.out.println("Digite o primeiro número");
    n1 = entrada.nextDouble();
    System.out.println("Digite o segundo número");
    n2 = entrada.nextDouble();

    System.out.println(resultado = n1 - n2);

    historico.salvarHistorico();

    return resultado;
}
public double multiplicar(){

    System.out.println("Digite o primeiro número");
    n1 = entrada.nextDouble();
    System.out.println("Digite o segundo número");
    n2 = entrada.nextDouble();

    System.out.println(resultado = n1 * n2);
    
    historico.salvarHistorico();

    return resultado;
}
public double divisao(){

    System.out.println("Digite o primeiro número");
    n1 = entrada.nextDouble();
    System.out.println("Digite o segundo número");
    n2 = entrada.nextDouble();
/*
aqui coloquei uma condicao para evitar divisao por 0.
*/
    if (n2 == 0){
        System.out.println("Não é possivel dividir por 0");
        return 0;
    } else {
        resultado = n1 / n2;
        System.out.println(resultado);
        
    historico.salvarHistorico();

        return resultado;
    }
}

}