package numtrimestre;

import java.util.Scanner;

public class NumTrimestre {

    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int mes = 0;
        
        System.out.println("Ingrese un numero de mes");
        mes = ent.nextInt();
        
        if (mes>0 && mes<13){
            if(mes<4){
                System.out.println("Está dentro del primer trimestre");
            }else if(mes<7){
                System.out.println("Está dentro del segundo trimestre");
            }else if(mes<10){
                System.out.println("Está dentro del tercer trimestre");
            }else{
                System.out.println("Está dentro del cuarto trimestre");
            }
        }else{
            System.out.println("El numero no corresponde a un mes del año");
        }
    }
    
}
