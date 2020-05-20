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
public class Paciente extends BasicDBObject{
    
    protected final String IDPACIENTE = "_id";
    protected final String NOMBREP1 = "nombreP1";
    protected final String NOMBREP2 = "nombreP2";
    protected final String APELLIDOP1 = "ApellidoP1";
    protected final String APELLIDOP2 = "ApellidoP2";
    protected final String DIRECCIONP = "DireccionP";
    protected final String EDADP = "EdadP";
    protected final String ESTRATOP = "EstratoP";
    protected final String IDEPS = "idEPS";
    
    private boolean partial;

    public Paciente() {
        partial = false;
    }
    
    public Paciente(int idPaciente, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, int edad, int estrato, int idEPS){
        this.put(IDPACIENTE, idPaciente);
        this.put(NOMBREP1, nombre1);
        this.put(NOMBREP2, nombre2);
        this.put(APELLIDOP1, apellido1);
        this.put(APELLIDOP2, apellido2);
        this.put(DIRECCIONP, direccion);
        this.put(EDADP, edad);
        this.put(ESTRATOP, estrato);
        this.put(IDEPS, idEPS);
    }
    
    @Override
    public void markAsPartialObject() {
        Set<String> set = keySet();
       

        Set<String> setThis = new HashSet<String>();
        setThis.add(IDPACIENTE);
        setThis.add(NOMBREP1);
        setThis.add(NOMBREP2);
        setThis.add(APELLIDOP1);
        setThis.add(APELLIDOP2);
        setThis.add(DIRECCIONP);
        setThis.add(EDADP);
        setThis.add(ESTRATOP);
        setThis.add(IDEPS);
        

        partial = !set.equals(setThis);
    }
    
    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public String getIDPACIENTE() {
        return this.getString(IDPACIENTE);
    }

    public String getNOMBREP1() {
        return this.getString(NOMBREP1);
    }

    public String getNOMBREP2() {
        return this.getString(NOMBREP2);
    }

    public String getAPELLIDOP1() {
        return this.getString(APELLIDOP1);
    }

    public String getAPELLIDOP2() {
        return this.getString(APELLIDOP2);
    }

    public String getDIRECCIONP() {
        return this.getString(DIRECCIONP);
    }

    public String getEDADP() {
        return this.getString(EDADP);
    }

    public String getESTRATOP() {
        return this.getString(ESTRATOP);
    }

    public String getIDEPS() {
        return this.getString(IDEPS);
    }

    public void setIDPACIENTE(String idPaciente) {
        this.put(IDPACIENTE, idPaciente);
    }

    public void setNOMBREP1(String nombreP1) {
        this.put(nombreP1, nombreP1);
    }

    public void setNOMBREP2(String nombreP2) {
        this.put(NOMBREP2, nombreP2);
    }

    public void setAPELLIDOP1(String apellidoP1) {
        this.put(APELLIDOP1, apellidoP1);
    }

    public void setAPELLIDOP2(String apellidoP2) {
        this.put(APELLIDOP2, apellidoP2);
    }

    public void setDIRECCIONP(String direccionP) {
        this.put(this.DIRECCIONP, direccionP);
    }

    public void setEDADP(String edadP) {
        this.put(EDADP, edadP);
    }

    public void setESTRATOP(String estratoP) {
        this.put(ESTRATOP, estratoP);
    }

    public void setIDEPS(int idEPS) {
        this.put(IDEPS, idEPS);
    }   

    @Override
    public String toString() {
        return "Paciente{" + "IDPACIENTE=" + IDPACIENTE + ", NOMBREP1=" + NOMBREP1 + ", NOMBREP2=" + NOMBREP2 + ", APELLIDOP1=" + APELLIDOP1 + ", APELLIDOP2=" + APELLIDOP2 + ", DIRECCIONP=" + DIRECCIONP + ", EDADP=" + EDADP + ", ESTRATOP=" + ESTRATOP + ", IDEPS=" + IDEPS + '}';
    }
    
    
}

