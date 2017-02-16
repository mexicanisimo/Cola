import com.sun.glass.ui.Size;

import javax.swing.*;

/**
 * Created by El sabroso on 12/01/2017.
 */
public class Cola {// comportamiento encapsulado
    private int frente; //frente es el final
    private int fondo;//inicio
    private int size;
    private  int c[]=new int [5];
    private  int s[]=new int[10];
    // Inserta --> Extrae  definen a la cola
    // encapsulada  --> recorrer --> buscar -->size
    public Cola(int  cantidad){

        this.frente=0;
        this.fondo=0;
        this.size=cantidad;

        }

    public void insertar(int valor){
        if(fondo <size){
           // System.out.println("eL SIZE "+size + "EL FONDO" + fondo);
            System.out.print("->" + valor);
            c[fondo]=valor;
            fondo++;
        }else{
            JOptionPane.showMessageDialog(null,"Cola llena papu ");
        }
    }

    public int extraer(){
        int tem=-1;
        int elimina=0;
      //  System.out.println("frente"+ frente);
        System.out.println("Final de cola "+ fondo);
        if(frente==fondo){
            JOptionPane.showMessageDialog(null,"La cola esta vacia puedes insertar desde un principio");
            fondo=0;
            frente=0;
        }else{
            System.out.println("El frente  es : " + c[frente]);
            c[frente]=elimina;
            tem=c[frente];
            frente++;
        }
        return tem;
    }

    public void recorrer(){

        for( int i=frente;i<fondo;i++){
            System.out.print(c[i] + "->");
        }
    }
    public boolean Buscar(int valor){
        boolean b=false;

        int i=0;
        while(i<size&& c[i]!=valor)
            i++;
        if(i<size){
            b=true;
        }
        return b;
    }
    public  boolean Llena(){
        if(this.frente==this.fondo){
            return true;
        }
        else {
            return false;
        }
    }
    public int size(){
        return size;
    }
}



