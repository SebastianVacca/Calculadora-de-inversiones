/*
 * CALCULADORA DE INVERSIONES
 * Crea un programa que permita calcular el rendimiento anual de una inversión
 * Solicita mediante Scanner el capital inicial y la tasa de interés anual(en %)
 * muestra el resultado por ventana emergente que muestre:
 * intereses ganados en un año
 * monto final al término de un año
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // iniciando el Scanner para capturar los datos 
        Scanner sc = new Scanner(System.in);

        //capturando la inversión del usuario
        System.out.print("Bienvenido, acá podrá calcular sus inversiones\n" +
        "Por favor digíte su capital inicial: ");
        double inversion = sc.nextDouble();

        //capturando el porcentaje de interes
        System.out.print("Por favor digite la tasa de interés anual: ");
        double tasaAnual = sc.nextDouble();

        //convirtiendo la tasa a porcentaje
       double porcentaje = tasaAnual * 0.01;

       double rendimiento = inversion * porcentaje;
       double montoFinal = inversion + rendimiento;

       JOptionPane.showMessageDialog(null, "Con su capital inicial usted genera: $" + rendimiento + 
       "\nEl monto final al terminar el año será: $" + montoFinal);
    }
}
