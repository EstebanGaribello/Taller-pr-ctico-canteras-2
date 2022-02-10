/**
 * @author Jaime Esteban Garibello Ortega
 */
import java.util.ArrayList;

public class fruit {
    /**
     * atributos de la clase
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * setters y getters
     * @param colors
     */
    public void setColor(ArrayList<String> colors){
        this.colors = colors;
    }
    public ArrayList<String> getColor(){
        return this.colors;
    }
}
