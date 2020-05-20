/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mongodb.BasicDBObject;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Especializacion extends BasicDBObject{
    protected final String IDESPECIALIZACION = "_id";
    protected final String TIPOESPECIALIZACION = "TipoEspecializacion";
    
    private boolean partial;

    public Especializacion() {
        partial = false;
    }
    
    public Especializacion(int idEspecializacion, String tipoEspecializacion) {
        this.put(IDESPECIALIZACION, idEspecializacion);
        this.put(TIPOESPECIALIZACION, tipoEspecializacion);
    }
    
    @Override
    public void markAsPartialObject() {
        Set<String> set = keySet();
      
        Set<String> setThis = new HashSet<String>();
        setThis.add(IDESPECIALIZACION);
        setThis.add(TIPOESPECIALIZACION);
        

        partial = !set.equals(setThis);
    }
    
    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public String getIDESPECIALIZACION() {
        return this.getString(IDESPECIALIZACION);
    }

    public void setIDESPECIALIZACION(String idEspecializacion) {
        this.put(IDESPECIALIZACION, idEspecializacion);
    }

    public String getTIPOESPECIALIZACION() {
        return this.getString(TIPOESPECIALIZACION);
    }

    public void setTIPOESPECIALIZACION(String TipoEspecializacion) {
        this.put(this.TIPOESPECIALIZACION, TipoEspecializacion);
    }

    @Override
    public String toString() {
        return "Especializacion{" + "IDESPECIALIZACION=" + IDESPECIALIZACION + ", TIPOESPECIALIZACION=" + TIPOESPECIALIZACION + '}';
    }
}
