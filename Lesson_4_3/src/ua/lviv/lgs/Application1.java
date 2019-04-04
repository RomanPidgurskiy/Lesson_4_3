
package ua.lviv.lgs;

public class Application1 {

	public static void main(String[] args) {
		
		Animals examp_animal = new Animals("Leopard",20,7);
		System.out.println("Name_animal = "+examp_animal.getName()+"; Speed = "
		  +examp_animal.getSpeed()+"; age = "+examp_animal.getAge()+";");
		
		
		examp_animal.setName("Bull"); examp_animal.setSpeed(2); examp_animal.setAge(14);
		
		System.out.println("Name_animal = "+examp_animal.getName()+"; Speed = "
		  +examp_animal.getSpeed()+"; age = "+examp_animal.getAge()+";");
		
	}
}