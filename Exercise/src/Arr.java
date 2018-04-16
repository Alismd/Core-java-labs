public class Arr {
public static void main(String[] args)
{
	 City[] c = new City[5];  
	
	Country[] co = new Country[5];
	
	Address[] a= new Address[5];

	

	Employee[] e = new Employee[5];


    int i=0;
	for (i=0;i<e.length;i++)
	
		e[i]= new Employee();
		e[0].setName("Ali");
		e[1].setName("Preethi");
		e[2].setName("Sharika");
		e[3].setName("Arthi");
	    e[4].setName("Bindhu");

		
	for (i=0;i<a.length;i++)
	
		a[i]= new Address();
		a[0].setLine("4/20 ");
		a[1].setLine("4/21");
		a[2].setLine("4/22 ");
		a[3].setLine("4/23");
		a[4].setLine("4/24 ");
	
	for (i=0;i<co.length;i++)
	
		co[i]= new Country();
		co[0].setCountry("India");
		co[1].setCountry("America");
		co[2].setCountry("Africa");
		co[3].setCountry("Australia");
		co[4].setCountry("Bangladesh");
	
	for (i=0;i<c.length;i++)
	
		c[i]= new City();
		c[0].setCity("Salem");
		c[1].setCity("kadapa");
		c[2].setCity("Tirupati");
		c[3].setCity("kadapa");
		c[4].setCity("Tirupati");
	for (i=0;i<e.length;i++)
	
	{
	
		e[i].setAddress(a[i]);
		a[i].setCountry(co[i]);
		co[i].setCity(c[i]);
	
	System.out.println("Name of the employee is:\t"+ e[i].getName());
	System.out.println("Address of the employee is:\t"+e[i].getAddress().getLine());
	System.out.println("Country of the employee is:\t"+e[i].getAddress().getCountry().getCountry());
	System.out.println("City of the employee is:\t"+e[i].getAddress().getCountry().getCity().getCity());
	System.out.println("---------------------------------------------------------");
	
}

}

}
