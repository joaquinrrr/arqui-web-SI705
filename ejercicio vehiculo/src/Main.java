import java.util.Scanner;

public class Main {
    public static int indiceCocheMBarato(vehiculo coches[]){ //metodo que retorna entero
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }


    public static void main(String [] args){ //metodo
        Scanner entrada = new Scanner(System.in); //lee todos los datos
        String marca, modelo;
        float precio;
        int numeroVehi, indiceCocheMB;

        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehi = entrada.nextInt();

        //creacion de objetos para los coches
        vehiculo coches[] = new vehiculo[numeroVehi];

        for(int i=0; i<coches.length;i++){
            entrada.nextLine(); //guardar strings
            System.out.println("\n Digite las caracteristicas del Coche "+(i+1)+":");
            System.out.print("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio = entrada.nextFloat();

            coches[i] = new vehiculo(marca,modelo,precio);
        }

        indiceCocheMB = indiceCocheMBarato(coches);

        System.out.println("\n El coche más barato es: ");
        System.out.println(coches[indiceCocheMB].mostrardatos());
    }
}