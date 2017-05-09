package avece2;

import excepciones.CuentafaltateException;
import java.util.ArrayList;
import java.util.Iterator;

public class Material<T> {

    public ArrayList<T> material = new ArrayList<>();

    public Material() {
        super();
    }

    public void add(T a) {
        material.add(a);
    }

    public void borrar(T a) throws CuentafaltateException {

        int i = 0;
        int k=0;
        for (int j = 0 ; material.size() > j ; j++) {
            if (material.get(i).equals(a)) {
                material.remove(i);
                k++;
            }
            i++;
        }
        if(k==0){
            throw new CuentafaltateException("libro no existe");
        }
    }

    public int disponibilidad(T a) throws CuentafaltateException {
        int dispo = 0;
        int i = 0;
        int k=0;
        for (Iterator<T> it = material.iterator(); it.hasNext();) {
            if (material.get(i).equals(a)) {
                  k++;
            }
        }
           if(k==0){
            throw new CuentafaltateException("libro no existe");
        }
        return dispo;
    }

}
