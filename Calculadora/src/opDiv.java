import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;

public class opDiv {
    
    public void divisao(){

        Scanner scan = new Scanner(System.in); //declarando o scanner

        System.out.println("Digite o valor do numerador e denominador sucessivamente para efetuar a Divisão!");

        ArrayList valoresdiv = new ArrayList<>(); //declaração do array

        do{
            String valores;
            valores = scan.nextLine();
            valores = valores.replaceAll(",", "."); //recebendo os valores para dividir em String para verificar a validade dos mesmos
            System.out.print("-----\n");

            if(valores.matches("[+-]?\\d*(\\.\\d+)?")){ //testando se o usuario digitou apenas numeros
                valoresdiv.add(valores);
            } else {
                System.out.println("Digite apenas numeros!"); //caso o usuario digite letras ou alfanuméricos
            }
            
        } while (valoresdiv.size() < 2); //o programa recebe apenas 2 valores para efetuar a divisao

        Iterator j = valoresdiv.iterator();

        double valorconvertidoemdouble;
        double valorparadividir[] = {0,0};
        int indice = 0;
        while(j.hasNext()){
            valorconvertidoemdouble = Double.valueOf((String) j.next()); //convertendo os valores de string para double
            valorparadividir[indice] = valorconvertidoemdouble; //adicionando cada valor convertido na posicao (indice) do array
            indice++; 
        }

        Double valordivisao = (valorparadividir[0] / valorparadividir[1]); //efetuando a divisao

        if(valordivisao.isNaN()){ //verificando se a divisão é definida
            System.out.println("Essa é uma divisão indefinida na Matemática!"); //caso seja indefinida
        } else {
            System.out.println("= " + valordivisao); //sendo definida, retorna o resultaado da divisão
        }
        
    }


}