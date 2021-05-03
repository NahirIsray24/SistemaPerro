import java.util.Scanner;
import java.io.*; 
public class clsPerro {
    //atributos
  private int codigo;
  private String nombre;
  private int edad;
 // private LocalDate fecha;
  Scanner leer= new Scanner(System.in);
    //constructor
  public clsPerro(int codigo,String nombre,int edad){
      this.codigo=codigo;
      this.nombre=nombre;
      this.edad= edad;
  }
   public clsPerro(){    
  } 
//metodos get y set
  public int getCodigo(){
        return codigo;
    }
  public void setCodigo(int codigo){
      this.codigo = codigo;
  }
  public String getNombre(){
      return nombre;
  }
  public void  setNombre(String nombre){
      this.nombre=nombre;
  }
  public int getEdad(){
      return edad;
  }
  public void setEdad(int edad){
      this.edad=edad;
  }
  //metodo para cargar y mostrar valores de los perros
     public void asignar(){
         try{
            System.out.println("INGRESE EL CODIGO");
            codigo= leer.nextInt();
            System.out.println("INGRESE EL NOMBRE DEL PERRO");
            nombre= leer.next();
            System.out.println("INGRESE LA EDAD DEL PERRO");
            edad=leer.nextInt();
         }
        catch(Exception e){
        //e es la variable del tipo exc q va a guardar el error
              System.out.println("DATO ERRONEO "+e.getMessage());
         }
     
     }
    
      public void mostrar(){
        System.out.println("NOMBRE"+nombre);
        System.out.println("EDAD :"+edad);
     }
    
}
