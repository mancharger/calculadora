import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class opSoma {
    
    public static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public void soma(){
        
        ArrayList valoresSoma = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String valores;
        
        System.out.println("Digite os valores que deseja somar e 'sair' para finalizar: ");
        
        do{  
            valores = scan.nextLine();
            valores = valores.toLowerCase();
            valores = valores.replaceAll(",", "."); //transformando virgulas em pontos, caso seja necessario
            
            if(valores.matches("[+-]?\\d*(\\.\\d+)?")){ //testando se o usuario digitou apenas numeros
                valoresSoma.add(valores);
            } else {
               if(valores.equals("sair")){
                
               } else {
                System.out.println("Digite apenas numeros!");
               }

            }
            

        } while (!valores.equals("sair")); //recebendo os valores em String e colocando na arraylist
        
        Iterator j = valoresSoma.iterator();

        Double valor;
        Double soma = 0.0;

        while(j.hasNext()){
            valor = Double.valueOf((String) j.next()); //convertendo os valores de string para double
            soma += valor; //somando os valores 
        }
        
        System.out.println("= " + soma);

        String teste = "1a";
        boolean isNumeric = teste.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric){
            System.out.println("e numero");
        } else {System.out.println("não e numero");}

    }

}
