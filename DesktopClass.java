package week3_Day1Assignment1;

/*Assignment1:
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.

*/
public class DesktopClass extends Computer {
	
	public void desktopSize() {
		
		System.out.println("The Desktop class");

	}

	public static void main(String[] args)
	{
		
		DesktopClass obj=new DesktopClass();
		obj.desktopSize();
		obj.computerModel();
		
	}
}
