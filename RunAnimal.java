import java.util.Scanner;

public class RunAnimal{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an animal: Press B for bird ,D for dog ,C for cat:");
        String input1 = sc.nextLine();
        
        if (input1.equalsIgnoreCase("B")){
        
        	Bird b = new Bird();
        	b.eat();
        	b.sleep();
        	b.makeSound();
        }
        
        else if (input1.equalsIgnoreCase("D")){
        	Dog d = new Dog();
        	d.eat();
        	d.sleep();
        	d.makeSound();
        }
        else if (input1.equalsIgnoreCase("C")){
        	Cat c = new Cat();
        	c.eat();
        	c.sleep();
        	c.makeSound();
        }
        else{
        	System.out.println ("Invalid input!");
        }

   sc.close();
}
}