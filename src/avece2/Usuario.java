
package avece2;

import excepciones.CuentafaltateException;
import java.util.ArrayList;

public class Usuario<T> {
public ArrayList<T> usuario = new ArrayList<>();

    public Usuario() {
        super();
    }

    public void add(T a) {
        usuario.add(a);
    }

    public void borrar(T a) throws CuentafaltateException {

        int i = 0;
        int k=0;
        for (int j = 0 ; usuario.size() > j ; j++) {
            if (usuario.get(i).equals(a)) {
                usuario.remove(i);
                k++;
            }
            i++;
        }
        if(k==0){
            throw new CuentafaltateException("libro no existe");
        }
    }

  public void pedir(T a) throws CuentafaltateException {

        int i = 0;
        int k=0;
        for (int j = 0 ; usuario.size() > j ; j++) {
            if (usuario.get(i).equals(a)) {
                k++;
                
            }
            i++;
        }
        if(k==0){
            throw new CuentafaltateException("libro no existe");
        }
    }
}
