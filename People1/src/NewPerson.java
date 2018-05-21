
public class NewPerson extends Person {

	public static void main(String[] args) {
		
		NewPerson p1 = new NewPerson();
		p1.Name = "Oliver Queen";
		p1.Age = 30;
		p1.JobTitle = "Superhero";

		NewPerson p2 = new NewPerson();
		p2.Name = "Jeremy Kyle";
		p2.Age = 40;
		p2.JobTitle = "TV Host";

		NewPerson p3 = new NewPerson();
		p3.Name = "Kobe Bryant";
		p3.Age = 38;
		p3.JobTitle = "Basketball Player";

		System.out.println(p1.Name + " is " + p1.Age + " years of age" + " works as a " + p1.JobTitle);
		System.out.println(p2.Name + " is " + p2.Age + " years of age" + " works as a " + p2.JobTitle);
		System.out.println(p3.Name + " is " + p3.Age + " years of age" + " works as a " + p3.JobTitle);

	}

}
