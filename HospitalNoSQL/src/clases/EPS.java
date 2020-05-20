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
public class EPS extends BasicDBObject{

    protected final String NOMBREEPS = "nombreEPS";
    protected final String NUMCONSECUTIVO = "NumeroConsecutivo";
    
    private boolean partial;

    public EPS( String nombreEPS, int numConsecutivo) {

        this.put(NOMBREEPS, nombreEPS);
        this.put(NUMCONSECUTIVO, numConsecutivo);
    }
    
    @Override
    public void markAsPartialObject() {
        Set<String> set = keySet();
        set.remove("_id");

        Set<String> setThis = new HashSet<String>();
     
        setThis.add(NOMBREEPS);
        setThis.add(NUMCONSECUTIVO);
        

        partial = !set.equals(setThis);
    }
    
    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }


    public String getNOMBREEPS() {
        return this.getString(NOMBREEPS);
    }

    public void setNOMBREEPS(String nombreEPS) {
        this.put(NOMBREEPS, nombreEPS);
    }

    public String getNUMCONSECUTIVO() {
        return this.getString(NUMCONSECUTIVO);
    }

    public void setNUMCONSECUTIVO(String numConsecutivo) {
        this.put(this.NUMCONSECUTIVO, numConsecutivo);
    }

    @Override
    public String toString() {
        return "EPS{" + "IDEPS=" + ", NOMBREEPS=" + NOMBREEPS + ", NUMCONSECUTIVO=" + NUMCONSECUTIVO + '}';
    }
}
