/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalnosql;

import clases.EPS;
import clases.Especializacion;
import clases.Medico;
import clases.Paciente;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class HospitalNoSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
   
            DB ob = createConnection();
         
            if (ob != null) {
                Especializacion sp1 = new Especializacion (1, "cardiologia");
                Especializacion sp2 = new Especializacion (2, "Neurología");
                LinkedList <Integer> Especializacion = new LinkedList <Integer> ();
 
                
                EPS ep = new EPS ("coomeva",1);
                Medico m1 = new Medico(1,"Juan","Camilo","Ruiz","Martinez",3128781,321654,587965,Especializacion);
                Paciente p1=new Paciente(1, "Maria", "Camila", "Ruiz", "Martinez", "Calle 33a #6-03", 21,4,1);
                DBCollection collection = ob.getCollection(p1.getClass().getSimpleName()); 
                DBCollection collection1 = ob.getCollection(m1.getClass().getSimpleName()); 
                try {
                    collection.insert(p1);
                    collection1.insert(m1);
                } catch (MongoException ex) {
                }
            }else{
                System.out.println("conexión no establecida!!!");
            }
            
           // System.out.println("CCC " + ob.getName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(HospitalNoSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DB createConnection() throws UnknownHostException {
        MongoClient client = null;

        //String mongoCloudURI = data.getMongoURI();
        //   String mongoCloudURI = data.getMongoURILocal();
        MongoClientURI uri = new MongoClientURI("mongodb+srv://camilaruiz028:camilaruiz028@cluster0-gjcmu.azure.mongodb.net/test?retryWrites=true&w=majority");
        //mongodb+srv://pruebaadmin:<password>@cluster0-tlwaa.mongodb.net/test?retryWrites=true&w=majority
        System.out.println("cadena " + uri.toString());
        client = new MongoClient(uri);

        return client.getDB("HOSPITAL");
    }
}
