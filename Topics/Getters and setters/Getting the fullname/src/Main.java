class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        this.firstName = java.util.Objects.requireNonNullElse(firstName, "");
    }

    public void setLastName(String lastName) {
        // write your code here
        this.lastName = java.util.Objects.requireNonNullElse(lastName, "");
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")){
            return "Unknown";
        }
        return ((!firstName.equals("")) ? firstName : "")
                +  ((!lastName.equals("")) ? " " + lastName : "");
    }
}

//public class Main {
//    public static void main(String[] args){
//        User tim = new User();
//        tim.setFirstName("Tim");
//        tim.setLastName("Towler");
//        System.out.println(tim.getFullName());
//
//        User katie = new User();
//        katie.setFirstName("Katie");
//        katie.setLastName(null);
//        System.out.println(katie.getFullName());
//    }
//}