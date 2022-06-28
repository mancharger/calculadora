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
            valoresSoma.add(valores);

        } while (!valores.equals("sair")); //recebendo os valores em String e colocando na arraylist

        valoresSoma.remove(valoresSoma.size() - 1); //removendo o 'sair' do array
        Iterator j = valoresSoma.iterator();

        Double valor;
        
        while(j.hasNext()){
            valor = Double.valueOf((String) j.next()); //convertendo os valores de string para double
            //implementar a soma 
        }
        

    }

}
