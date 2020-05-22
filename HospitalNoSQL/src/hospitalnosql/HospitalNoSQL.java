/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalnosql;

import clases.Consulta;
import clases.EPS;
import clases.Especializacion;
import clases.Medico;
import clases.Paciente;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
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
                LinkedList<Especializacion> esp = new LinkedList<>();
                esp.add(new Especializacion(1,"Cardiología"));  
                Medico m1 = new Medico(1, "Juan", "Camilo", "Ruiz", "Martinez", 3128781, 321654, 587965, esp);
                DBCollection collection2 = ob.getCollection(m1.getClass().getSimpleName());
             
                EPS ep1 = new EPS(1,"Coomeva",520);
                DBCollection collection5 = ob.getCollection(ep1.getClass().getSimpleName());
                
                
                Paciente p1 = new Paciente(1, "Maria", "Camila", "Ruiz", "Martinez", "Calle 33a #6-03", 21, 4, 1);
                Paciente p2 = new Paciente(2, "Laura", "Camila", "Ruiz", "Martinez", "Calle 33a #6-03", 21, 4, 2);
                DBCollection collection = ob.getCollection(p1.getClass().getSimpleName());
                DBCollection collection3 = ob.getCollection(p2.getClass().getSimpleName());
                
                
                Consulta c1 = new Consulta(1,1,1,1,"Problemas de espalda","Hernia Discal","Operación",250000);
                DBCollection collection4 = ob.getCollection(c1.getClass().getSimpleName());
                try {
                    collection.insert(p1);
                    collection2.insert(m1);
                    collection3.insert(p2);
                    collection4.insert(c1);
                    collection5.insert(ep1);

                } catch (MongoException ex) {
                }
            } else {
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
        MongoClientURI uri = new MongoClientURI("mongodb+srv://kastalco:adidas20@cluster0-3vbyt.gcp.mongodb.net/test?retryWrites=true&w=majority");
        //mongodb+srv://pruebaadmin:<password>@cluster0-tlwaa.mongodb.net/test?retryWrites=true&w=majority
        System.out.println("cadena " + uri.toString());
        client = new MongoClient(uri);

        return client.getDB("HOSPITAL");
        
        
    }
    
    private DB db;
    
    public LinkedList<? extends BasicDBObject> findAll(Class<? extends BasicDBObject> Paciente)
        {     
            LinkedList<BasicDBObject> r = new LinkedList<BasicDBObject>();
            DBCollection collection= db.getCollection(Paciente.getSimpleName());
            collection.setObjectClass(Paciente);
            DBCursor cursor = collection.find();
            while(cursor.hasNext())
            {
            DBObject objectAux = cursor.next();
            r.add((BasicDBObject) objectAux);    
            }
            
            return r;
        }
        
        
       
            
            
        }
}
