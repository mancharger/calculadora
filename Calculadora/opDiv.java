import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;

public class opDiv {
    
    public void divisao(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do numerador e denominador sucessivamente para efetuar a Divisão!");

        ArrayList valoresdiv = new ArrayList<>(); //declaração do array

        do{
            String valores;
            valores = scan.nextLine();
            valores = valores.replaceAll(",", ".");
            System.out.print("-----\n");

            if(valores.matches("[+-]?\\d*(\\.\\d+)?")){ //testando se o usuario digitou apenas numeros
                valoresdiv.add(valores);
            } else {
                System.out.println("Digite apenas numeros!");
            }
            
        } while (valoresdiv.size() < 2);

        Iterator j = valoresdiv.iterator();

        double valorconvertidoemdouble;
        double valorparadividir[] = {0,0};
        int indice = 0;
        while(j.hasNext()){
            valorconvertidoemdouble = Double.valueOf((String) j.next());
            valorparadividir[indice] = valorconvertidoemdouble;
            indice++;
        }

        Double valordivisao = (valorparadividir[0] / valorparadividir[1]);

        if(valordivisao.isNaN()){
            System.out.println("Essa é uma divisão indefinida na Matemática!");
        } else {
            System.out.println("= " + valordivisao);
        }
        

    }


}
