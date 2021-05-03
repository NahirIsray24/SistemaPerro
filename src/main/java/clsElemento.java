
public class clsElemento {
    clsPerro perro;
    clsElemento sgte;//siguiente apunta a un nodo del mismo tipo
    
    //constructor 
public clsElemento(clsPerro obPerro){
    perro = obPerro;
    sgte = null;
}
public clsElemento(){
    
}
//metodo get
public clsPerro getPerro(){
    return perro;
}
}
