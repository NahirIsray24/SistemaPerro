import java.util.Scanner;
import java.io.*;

public class clsMainPerro {
    public static void main (String[] args){
      clsTablaEnlazada obTDE = new  clsTablaEnlazada(); //creo el objeto
      clsPerro obPerro = new clsPerro();
      clsElemento obElemento= new clsElemento();
      Scanner leer= new Scanner(System.in);
        int opcion=0,salir=0;
        int codigo;
        do {
            System.out.println("MENU");
            System.out.println("1-INSERTAR");
            System.out.println("2-BUSCAR");
            System.out.println("3-ELIMINAR");
            System.out.println("-----INGRESE LA OPCION-----");
            opcion= leer.nextInt();
         switch(opcion){
              case 1:
                  obPerro.asignar();//cree el objeto con su asignacion
                  obTDE.insertar(obPerro); //ese objeto lo inserte en la tabla
                  obPerro.mostrar();
                  break; 
              
              case 2:
                  System.out.println("INGRESE EL CODIGO A BUSCAR");
                  codigo= leer.nextInt();
                  obElemento = obTDE.buscar(codigo); //ob va a obtener la copia del retorno
                  if(obElemento != null)
                  obElemento.perro.mostrar();  
                  else 
                      System.out.println("NO SE ENCONTRO EL CODGIO A BUSCAR"+codigo);
                  break;
                  
              case 3:
                  System.out.println("INGRESE EL CODIGO A ELIMINAR");
                 codigo= leer.nextInt();;
                  obTDE.eliminar(codigo);
                  break;
          }   
           System.out.println("PARA CONTINUAR PRESIONE 0");
                   salir = leer.nextInt();  
        }
        while (salir == 0);
    
        
    }
      
}

