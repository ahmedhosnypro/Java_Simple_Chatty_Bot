class Employee {

    String name;
    int salary;
    String address;

    Employee(){
        name = "unknown";
        address = "unknown";
        salary = 0;
    }

    Employee(String name, int salary){
        address = "unknown";
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, int salary, String address){
        this.address = address;
        this.name = name;
        this.salary = salary;
    }

}