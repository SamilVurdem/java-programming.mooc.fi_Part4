public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String FirstName, String LastName) {
        this.firstName = FirstName;
        this.lastName = LastName;
    }
   /* public void print() {
        System.out.println("My name is " + lastName + ", " + firstName + " " + lastName);
    }
*/

    public String toString() {

        return("My name is " + lastName + ", " + firstName + " " + lastName);
    }

}
