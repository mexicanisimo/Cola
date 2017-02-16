import javax.swing.*;

/**
 * Created by El sabroso on 12/01/2017.
 */
public class Principal {
    public static void main(String args[]) {
        Cola c = new Cola(5);
        int opc = 0;
        int dato;
        String op;
        String s;
//hola perras de 3 chichis
        do {
            op = JOptionPane.showInputDialog(null,"Menu \n 1 Ingresar elemento \n 2 Estrae \n 3 Vizualiza elementos \n 4 Buscar \n 5 Visualizar tamaño");

            dato = Integer.parseInt(op);
            switch (dato) {
                case 1:
                    s = JOptionPane.showInputDialog(null,"INGRESE ELEMENTO");
                    opc = Integer.parseInt(s);
                        c.insertar(opc);

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Extrae");
                    c.extraer();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Visualiza  ò  recorre la cola");
                    System.out.print("\n ");
                    c.recorrer();
                    break;
                case 4:
                    s = JOptionPane.showInputDialog(null,"Busca elemento");
                    opc=Integer.parseInt(s);
                    //System.out.println(c.Buscar(opc));
                    JOptionPane.showMessageDialog(null,c.Buscar(opc));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Visualiza el size");
                    System.out.println(c.size());
            }

        } while (dato != 6);

    }
}

