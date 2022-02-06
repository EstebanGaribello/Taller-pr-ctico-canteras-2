/**
 * @author Jaime Esteban Garibello Ortega
 */
public class patient {
       /**
        * atributos de la clase
        */
        int id;
        public String name;
        protected String email;
        private String address;
        private String phoneNumber;
        public Double height;
        public Double Wheight;
        /**
         * setters y getters
         * @param address
         */
        public void setaddress(String address) {
            this.address = address;
        }
     
        public String getaddress(){
            return address;
        }
     
        public void setphoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
     
        public String getphoneNumber() {
            return phoneNumber;
        }
}
