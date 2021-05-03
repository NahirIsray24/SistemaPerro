
public class clsTablaEnlazada {
      //atributos 
    private static final double R= 0.618034;
    static final int TAMTABLA = 101; //static q no se modifica
    private int numElementos; //elementos q guarda la tabla incluyend altas y bajas
  
    private clsElemento [] tabla; //arreglo tabla q guarda objetos de la clase
   
     //constructor instanciar tabla
    public clsTablaEnlazada(){
      tabla = new clsElemento[TAMTABLA];
      int j;
        for(j = 0; j < TAMTABLA ; j++)
             tabla[j] = null;
        
        numElementos = 0;
    }
    //metodo de la multiplicacion 
    static int dispersion(long x){
        double t;//t almacenamos sólo la parte decimal
        int v;
        t= R*x - Math.floor(R*x);//se guarda solo la parte entera, la cual se obtiene con la función floor()
        v = (int)(TAMTABLA * t); // TAMTABLA es la cantidad de posiciones de nuestra tabla, lo convierte a entero con int
        //en v almacenamos el producto de M por la parte decimal obtenida y almacenada en t.
         return v;
    }
    //metodo insertar 
    public void insertar (clsPerro obPerro){//crear el objeto en main
        int posicion; 
        clsElemento nuevo; //crea un nuevo nodo de la clase elemento 
        posicion = dispersion(obPerro.getCodigo());//Calculo la posic usando la dispersion con el perro
        nuevo = new clsElemento(obPerro); //en nuevo guardo un nuevo 
        nuevo.sgte = tabla[posicion]; //el sig apunta a tabla en esa posicion 
        tabla[posicion] = nuevo;
        numElementos++;
    }
    boolean conforme (clsPerro obPerro){
        return true; //conforme de eliminar 
    }
//metodo eliminar se da como entrada la clave del elemento,con la función de dispersión se obtiene el número de lista  para hacer una búsqueda secuencial dentro de ella. Una vez encontrado el elemento,
//se muestran los campos y se pide conformidad.
//  enlazando el nodo anterior con el nodo siguiente,la búsqueda mantiene en la variable anterior la dirección del anterior al nodo actual.
    public void eliminar(int codigo){
        int posicion;
        posicion = dispersion(codigo); //en esa posicion guardo la dispersion del codigo ej: posi 20 de la tabla en la pos 101
        
        if (tabla[posicion] != null) {// no está vacía
            clsElemento anterior, actual; //declara el nodo anterior y actual de tipo clsElemento
            anterior = null;
            actual = tabla[posicion]; //actual apunta a la pos a eliminar 
            while ((actual.sgte != null) && actual.getPerro().getCodigo() != codigo){//realiza la busqueda
            anterior = actual;
            actual = actual.sgte;
        }
        if (actual.getPerro().getCodigo() != codigo)
        System.out.println("NO SE ENCUENTRA EL PERRO EN LA TABLA "+ codigo);
        else if (conforme (actual.getPerro())){//se retira el nodo
            if (anterior == null) // primer nodo
            tabla[posicion] = actual.sgte;
                else
                anterior.sgte = actual.sgte;
                    actual = null;
                    numElementos--;
        }
        }
        else 
            System.out.println("TABLA VACIA --> NO HAY ELEMENTO A ELIMINAR");
        
    }
 //metodo buscar devuelve la dirección del nodo que contiene la clave de búsqueda,si no encuentra la lista enlazada devuelve null.
    public clsElemento buscar(int codigo){
        clsElemento obElemento = null;
        int posicion;
        posicion = dispersion(codigo);//hace uso de la dipsersion p obtener la pos
        if (tabla[posicion] != null){//si no esta vacia 
          obElemento = tabla[posicion]; //copia 
            while ((obElemento.sgte != null) && obElemento.perro.getCodigo() != codigo)
            obElemento = obElemento.sgte;
            if (obElemento.perro.getCodigo() != codigo)
             obElemento= null;
        }
        
        return obElemento; //retorna el objeto encontrado 
     }
    
}
