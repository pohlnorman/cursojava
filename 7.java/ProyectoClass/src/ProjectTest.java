
public class ProjectTest {

	public static void main(String[] args) {
		
		Project p1 = new Project();
		//p1.setName("nexo sistemas");
		//p1.setDescription("servicios tecnologicos");
		System.out.println(p1.elevatorPitch());
		
		
		Project p2 = new Project("Nexo sistemas");
		//p2.setDescription("Gran Proyecto");
		System.out.println(p2.elevatorPitch());
		
		
		Project p3 = new Project("Nexo sistemas", "servicios tecnologicos");
		System.out.println(p3.elevatorPitch());
		
		
		

	}

}
