class Address{
    String City;
    String District;
    String State;
    Address(String city,String district,String state){
        this.State=state;
        this.City=city;
        this.District=district;
    }

    public String getAddress() {
        return this.City+" "+this.District+" "+this.State;
    }
}
class Employee{
    String name;
    Address address;
    Employee(String name,Address address){
        this.name=name;
        this.address=address;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee name :"+this.name);
        System.out.println("Employee Address :"+address.getAddress());
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Address address=new Address("Guntur","Guntur","AndhraPradesh");
        Employee emp=new Employee("Gayathri",address);
        emp.getEmployeeDetails();
    }
}
