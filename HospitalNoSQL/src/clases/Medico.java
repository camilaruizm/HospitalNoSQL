/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mongodb.BasicDBObject;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Medico extends BasicDBObject{
    protected final String IDMEDICO = "_id";
    protected final String NOMBREM1 = "nombreM1";
    protected final String NOMBREM2 = "nombreM2";
    protected final String APELLIDOM1 = "apellidoM1";
    protected final String APELLIDOM2 = "apellidoM2";
    protected final String TELEFONOM1 = "telefonoM1";
    protected final String TELEFONOM2 = "telefonoM2";
    protected final String NUMATRICULA = "numeroMatricula";
    protected final String ESPECIALIZACION = "Especializacion";
    
    private boolean partial;

    public Medico() {
        partial = false;
    }
    
    public Medico(int idMedico, String nombre1, String nombre2, String apellido1, String apellido2, int telefono1, int telefono2, int numMatricula,LinkedList<Integer> Especializacion){
        this.put(IDMEDICO, idMedico);
        this.put(NOMBREM1, nombre1);
        this.put(NOMBREM2, nombre2);
        this.put(APELLIDOM1, apellido1);
        this.put(APELLIDOM2, apellido2);
        this.put(TELEFONOM1, telefono1);
        this.put(TELEFONOM2, telefono2);
        this.put(NUMATRICULA, numMatricula);
        this.put(ESPECIALIZACION, Especializacion);
    }
    
    @Override
    public void markAsPartialObject() {
        Set<String> set = keySet();
       
        Set<String> setThis = new HashSet<String>();
        setThis.add(IDMEDICO);
        setThis.add(NOMBREM1);
        setThis.add(NOMBREM2);
        setThis.add(APELLIDOM1);
        setThis.add(APELLIDOM2);
        setThis.add(TELEFONOM1);
        setThis.add(TELEFONOM2);
        setThis.add(NUMATRICULA);
        setThis.add(ESPECIALIZACION);

        partial = !set.equals(setThis);
    }

    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public String getIDMEDICO() {
        return this.getString(IDMEDICO);
    }
    
    /**
     * Set the value of idMedico
     *
     * @param idMedico new value of apellido
     */
    public void setIDMEDICO(String idMedico) {
        this.put(IDMEDICO, idMedico);
    }

    
    public String getNombreM1() {
        return this.getString(NOMBREM1);
    }

    /**
     * Set the value of nombre1
     *
     * @param nombre1 new value of apellido
     */
    public void setNombreM1(String nombre1) {
        this.put(NOMBREM1, nombre1);
    }
    
    public String getNombreM2() {
        return this.getString(NOMBREM2);
    }

    /**
     * Set the value of nombre2
     *
     * @param nombre2 new value of apellido
     */
    public void setNombreM2(String nombre2) {
        this.put(NOMBREM2, nombre2);
    }
    
    public String getApellidoM1() {
        return this.getString(APELLIDOM1);
    }

    /**
     * Set the value of apellido1
     *
     * @param apellido1 new value of apellido
     */
    public void setApellidoM1(String apellido1) {
        this.put(APELLIDOM1, apellido1);
    }
    
    
    public String getApellidoM2() {
        return this.getString(APELLIDOM2);
    }

    /**
     * Set the value of apellido2
     *
     * @param apellido2 new value of apellido
     */
    public void setApellidoM2(String apellido2) {
        this.put(APELLIDOM2, apellido2);
    }

    public String getTELEFONOM1() {
        return this.getString(TELEFONOM1);
    }
    
    /**
     * Set the value of telefono1
     *
     * @param telefono1 new value of telefono1
     */
    public void setTELEFONOM1(String telefono1) {
        this.put(TELEFONOM1, telefono1);
    }

    public String getTELEFONOM2() {
        return this.getString(TELEFONOM2);
    }
    
    /**
     * Set the value of telefono2
     *
     * @param telefono2 new value of telefono2
     */
    public void setTELEFONOM2(String telefono2) {
        this.put(TELEFONOM2, telefono2);
    }

    public String getNUMATRICULA() {
        return this.getString(NUMATRICULA);
    }
    
    /**
     * Set the value of numMatricula
     *
     * @param numMatricula new value of numMatricula
     */
    public void setNUMATRICULA(String numMatricula) {
        this.put(NUMATRICULA, numMatricula);
    } 

    public String getESPECIALIZACION() {
        return this.ESPECIALIZACION;
    }
    public void setESPECIALIZACION(LinkedList Especializacion) {
        this.put(ESPECIALIZACION, Especializacion);
    } 
    

    @Override
    public String toString() {
        return "Medico{" + "IDMEDICO=" + IDMEDICO + ", NOMBREM1=" + NOMBREM1 + ", NOMBREM2=" + NOMBREM2 + ", APELLIDOM1=" + APELLIDOM1 + ", APELLIDOM2=" + APELLIDOM2 + ", TELEFONOM1=" + TELEFONOM1 + ", TELEFONOM2=" + TELEFONOM2 + ", NUMATRICULA=" + NUMATRICULA + ", ESPECIALIZACION=" + ESPECIALIZACION +'}';
    }
    
    
}
