/**
 * @author Jaime Esteban Garibello Ortega
 */
public class guest {
    /**
     * atributos de la clase
     */
    String name;
    private String email;
    String address;
    protected String phoneNumber;
    private String id;
    /**
     * setters y getters
     * @return
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
