
public class Main {
public static void main(String[] args) {
	City c = new City();  
	Country co = new Country();
	Address a= new Address();
	Employee e = new Employee();
	
	///////////////////////////////////////

	
	
	///////////////////////////////////////
	//e.setAddress(co);
	c.setCity("pune");
    co.setCountry("India");
    a.setLine("4/575 Talawade");
    e.setName("Ali");
    
    e.setAddress(a);
    a.setCountry(co);
    co.setCity(c);
    System.out.println("Name of the employee is:"+e.getName());
    System.out.println("address of the employee is:"+e.getAddress().getLine());
    System.out.println("country of the employee is:"+a.getCountry().getCountry());
    System.out.println("Address of the employee is:"+co.getCity().getCity());
}


}
