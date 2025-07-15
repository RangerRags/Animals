import java.util.Scanner;

public class Animals extends AnimalNoises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		Dog dog = new Dog("", 0);
		
		Bird bird = new Bird("", 0);
		
		System.out.println("What is your dog's name?");
		dog.setName(scanner.next());
		
		System.out.println("What is your dog's age?");
		dog.setAge(scanner.nextInt());
		
		System.out.println("What is your Bird's name?");
		bird.setName(scanner.next());
		
		System.out.println("What is your Bird's age?");
		bird.setAge(scanner.nextInt());
		
	System.out.println(dog.getName()+" is "+ dog.getAge()+" years old and he goes " + dogNoise(dog));
	
	System.out.println(bird.getName()+" is "+ bird.getAge()+" years old and he goes "+ birdNoise(bird));
		
	}

}
