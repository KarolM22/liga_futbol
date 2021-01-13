/*
 * 11.	Cada equipo de la liga nacional de fútbol tiene un cuadro de 22 jugadores. 
Por cada equipo se capturan los siguientes datos: nombre del jugador, peso y edad. 
Los datos correspondientes a los 10 equipos de la liga se recolectan y se envían a 
la sede central para su análisis. Los datos son capturados en orden por cada equipo;
es decir, los primeros 22 son del equipo 1, los siguientes 22 del equipo 2 y así sucesivamente.
Diseñe un diagrama de flujo para calcular los siguientes valores estadísticos:

a)	Pesos y edades promedio de cada uno de los 10 equipos.
b)	Peso y edad promedio de todos los jugadores de la liga.
c)	Número de equipos con peso promedio mayor de 75 kg.
d)	Número de equipos con edad promedio menor de 18 años.

 */
package liga_futbol;

import java.util.Scanner;

/**
 *
 * karol martinez cuellar
 */
public class Liga_futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double peso,promedioP=0, edad, promedioE=0,promedioPT=0,promedioET=0, ic=0,ec=0;
        double [] promediopeso= new double [10];
        double [] promedioedad= new double [10];
        for(int c=0;c<10;c++){
            promedioP=0;
            promedioE=0;
            System.out.println(" EQUIPO NUMERO: "+(c+1));
            for(int j=0;j<22;j++){
                System.out.println("JUGADOR # "+(j+1));
                System.out.println(" NOMBRE DEL JUGADOR: ");
                String nombre=leer.next();
                System.out.println(" PESO: ");
                peso = leer.nextInt();
                promedioP=promedioP+peso;//es solo la  suma del promedio osea la operacion de sumar los resultados
                System.out.println(" EDAD: ");
                edad = leer.nextInt();
                promedioE=promedioE+edad;
            }
            promedioPT=promedioPT+promedioP;
            promedioET=promedioET+promedioE;
            promediopeso[c]=promedioP/22;//promedio edad y peso por equico
            promedioedad[c]=promedioE/22;
            if(promediopeso[c]>75){
               ic++;
        
        }if(promedioedad[c]<18){
            ec++;}
        }
        promedioPT=promedioPT/220;
        promedioET=promedioET/220;
        System.out.println("-------------------------------------------");
        for(int i=0;i<10;i++){
        System.out.println(" PROMEDIO DE PESO DEL EQUIPO#"+(i+1)+" : "+ promediopeso[i]);
        System.out.println("PROMEDIO DE EDAD DEL EQUIPO#"+(i+1)+" : "+promedioedad[i]);
        }
        System.out.println("PROMEDIO DEL PESO DE TODOS LOS JUGADORES DE LA LIGA: "+promedioPT);
        System.out.println("PROMEDIO DE LA EDAD DE TODOS LOS JUGADORES DE LA LIGA: "+promedioET);
        System.out.println("NUMERO DE EQUIPOS CON PESO PROMEDIO MAYOR A 75: "+ic);
        System.out.println(" NUMERO DE EQUIPOS CON EDAD PROMEDIO MENOR A 18: "+ec);
            
    }
    
}
