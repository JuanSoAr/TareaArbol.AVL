public class nodoArbolAVL {
    int dato,fe;//DECLARAMOS EL DATO Y EL FACTOR DE EQUILIBRIO
    nodoArbolAVL hijoIzquierdo,hijoDerecho;
    public nodoArbolAVL(int d){
        this.dato=d;
        this.fe=0;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
}
