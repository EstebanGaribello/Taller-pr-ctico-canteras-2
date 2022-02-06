/**
 * @author Jaime Esteban Garibello Ortega
 */
import java.util.ArrayList;

public class fruit {
    /**
     * atributos de la clase
     */
    String Name;
    float averageWeight;
    private ArrayList<String> Color;
    /**
     * setters y getters
     * @param Color
     */
    public void setColor(ArrayList<String> Color){
        this.Color = Color;
    }
    public ArrayList<String> getColor(){
        return Color;
    }
}
