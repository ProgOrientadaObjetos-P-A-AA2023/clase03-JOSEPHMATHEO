package manejoclases03;

import java.util.Scanner;

public class Ejecutable05 {
    public static void main(String[]args){
        
        Scanner lm = new Scanner(System.in);
        Hospital miHospital = new Hospital();  
        
        //Dar los valores a los atributos 
        
        
        // los valores ingresar por teclado
        
        System.out.print("Ingrese el nombre del Hospital: ");
        String nombre = lm.nextLine();
        
        System.out.print("Ingrese el numero de camas del Hospital: ");
        int numeroCamas = lm.nextInt();
        
        System.out.print("Ingrese el presupuesto del Hospital: ");
        double presupuesto = lm.nextDouble();
        
        // presentar los valores del objeto
        
        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(numeroCamas);
        miHospital.establecerPresupuesto(presupuesto);
        
        System.out.printf("%s - %d - %.2f\n", miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());
        
    }
}
