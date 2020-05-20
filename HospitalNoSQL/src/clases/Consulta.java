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
public class Consulta extends BasicDBObject{
    protected final String IDCONSULTA = "idConsulta";
    protected final String IDPACIENTE = "idPaciente";
    protected final String IDMEDICO = "idMedico";
    protected final String NUMEROCONSULTA = "numeroConsulta";
    protected final String OBSERVACIONES = "Observaciones";
    protected final String DIAGNOSTICOS = "Diagnosticos";
    protected final String DESCRIPCIONTRATAMIENTO = "DescripcionTratamiento";
    protected final String COPAGO = "coPago";
    
    private boolean partial;

    public Consulta() {
        partial = false;
    }
    
    public Consulta(int idConsulta, int idPaciente, int idMedico, int numConsulta, String observaciones, String diagnosticos, String descripcionTratamiento, double coPago) {
        this.put(IDCONSULTA, idConsulta);
        this.put(IDPACIENTE, idPaciente);
        this.put(IDMEDICO, idMedico);
        this.put(NUMEROCONSULTA, numConsulta);
        this.put(OBSERVACIONES, observaciones);
        this.put(DIAGNOSTICOS, diagnosticos);
        this.put(DESCRIPCIONTRATAMIENTO, descripcionTratamiento);
        this.put(COPAGO, coPago);
    }
    
    @Override
    public void markAsPartialObject() {
        Set<String> set = keySet();
        set.remove("_id");

        Set<String> setThis = new HashSet<String>();
        setThis.add(IDCONSULTA);
        setThis.add(IDPACIENTE);
        setThis.add(IDMEDICO);
        setThis.add(NUMEROCONSULTA);
        setThis.add(OBSERVACIONES);
        setThis.add(DIAGNOSTICOS);
        setThis.add(DESCRIPCIONTRATAMIENTO);
        setThis.add(COPAGO);
        

        partial = !set.equals(setThis);
    }
    
    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public String getIDCONSULTA() {
        return this.getString(IDCONSULTA);
    }

    public void setIDCONSULTA(String idConsulta) {
        this.put(IDCONSULTA, idConsulta);
    }

    public String getIDPACIENTE() {
        return this.getString(IDPACIENTE);
    }

    public void setIDPACIENTE(String idPaciente) {
        this.put(IDPACIENTE, idPaciente);
    }

    public String getIDMEDICO() {
        return this.getString(IDMEDICO);
    }

    public void setIDMEDICO(String idMedico) {
        this.put(IDMEDICO, idMedico);
    }

    public String getNUMEROCONSULTA() {
        return this.getString(NUMEROCONSULTA);
    }

    public void setNUMEROCONSULTA(String numeroConsulta) {
        this.put(NUMEROCONSULTA, numeroConsulta);
    }

    public String getOBSERVACIONES() {
        return this.getString(OBSERVACIONES);
    }

    public void setOBSERVACIONES(String observaciones) {
        this.put(OBSERVACIONES, observaciones);
    }

    public String getDIAGNOSTICOS() {
        return this.getString(DIAGNOSTICOS);
    }

    public void setDIAGNOSTICOS(String diagnosticos) {
        this.put(DIAGNOSTICOS, diagnosticos);
    }

    public String getDESCRIPCIONTRATAMIENTO() {
        return this.getString(DESCRIPCIONTRATAMIENTO);
    }

    public void setDESCRIPCIONTRATAMIENTO(String descripcionTratamiento) {
        this.put(DESCRIPCIONTRATAMIENTO, descripcionTratamiento);
    }

    public String getCOPAGO() {
        return this.getString(COPAGO);
    }

    public void setCOPAGO(String coPago) {
        this.put(COPAGO, coPago);
    }

    @Override
    public String toString() {
        return "Consulta{" + "IDCONSULTA=" + IDCONSULTA + ", IDPACIENTE=" + IDPACIENTE + ", IDMEDICO=" + IDMEDICO + ", NUMEROCONSULTA=" + NUMEROCONSULTA + ", OBSERVACIONES=" + OBSERVACIONES + ", DIAGNOSTICOS=" + DIAGNOSTICOS + ", DESCRIPCIONTRATAMIENTO=" + DESCRIPCIONTRATAMIENTO + ", COPAGO=" + COPAGO + '}';
    }  
    
}
