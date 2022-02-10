/**
 * @author Jaime Esteban Garibello Ortega
 */
import java.util.Date;

public class Person {
    /**
     * atributos de la clase
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    /**
     * setters y getters
     * @param name
     */
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }
}
