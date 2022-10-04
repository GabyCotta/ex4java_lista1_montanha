import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner numero= new Scanner(System.in);
       
        
        System.out.print("Informe as notas:");
        float primeiroBimestre = numero.nextFloat();
        Float  segundoBimestre = numero.nextFloat();
        Float  terceirooBimestre = numero.nextFloat();
        Float  quartoBimestre = numero.nextFloat();


        final Float resultado =  (primeiroBimestre+segundoBimestre+terceirooBimestre+quartoBimestre)/4;

        System.out.print("Sua nota é:" +resultado);
         
    }
}