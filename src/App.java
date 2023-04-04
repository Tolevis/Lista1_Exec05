import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Metros? ");
        float metros = entrada.nextFloat();

        float centimentros = metros * 100;

        System.out.printf("%.1f cm", centimentros);

        entrada.close();
    }  
}
