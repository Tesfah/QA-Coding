import java.util.Scanner;
public class Game {

	String playerName;
	Scanner myScanner = myScanner = new Scanner(System.in);
	Scanner inputScanner = new Scanner(System.in);
	int playerHP;
	int choice;
	String playerWeapon;

	public static void main(String[] args) {
			
			Game Fighters; 
			Fighters = new Game(); 
			Fighters.playerSetUp();
			Fighters.towerOfDoom(); 
			
		}

	public void playerSetUp() {

		playerHP = 10;

		playerWeapon = "Hammer";

		System.out.println("Your HP" + playerHP);
		System.out.println("Your Weapon" + playerWeapon);

		System.out.println("Please Enter Your Name");
		playerName = myScanner.nextLine();
		System.out.println("Hello" + playerName + "Let's Begin Your Journey");
	}

	public void towerOfDoom() {
		System.out.println("");
		System.out.println("You are outside The Tower Of Doom");
		System.out.println("An armed guard is in front of the door");
		System.out.println("What do you do?");
		System.out.println("");
		System.out.println("1. Ask guard to let you in");
		System.out.println("2. Charge and attack the guard");
		System.out.println("3. Try and sneak past the guard");

		choice = myScanner.nextInt();

		if (choice == 1) {
			System.out.println("Guard: So your name is" + playerName + "Move before I have you beheaded!!");
			inputScanner.nextLine();
			towerOfDoom();
		}

		if (choice == 2) {
			playerHP = playerHP - 1;
			System.out.println("Guard draws his sword and fights back. You recieced 1 damage.");
			System.out.println(playerName + "your HP is now" + playerHP);
			inputScanner.nextLine();
			towerOfDoom();

		}

		if (choice == 3) {
			insideTower();
		} else {
			towerOfDoom();

		}

	}



	public void insideTower() {

		System.out.println("");
		System.out.println("You are inside the tower and have reach a crossroad.");
		System.out.println("If you go south you will end up back at the front of the tower.");
		System.out.println("");
		System.out.println("1. Go North");
		System.out.println("2. Go West");
		System.out.println("3. Go East");
		System.out.println("4. Go South");
		System.out.println("");

		choice = myScanner.nextInt();

		if (choice == 1) {
			North();

		}

		if (choice == 2) {
			West();
		}

		if (choice == 3) {
			East();
		}

		if (choice == 4) {
			insideTower();
		}
	}

	public void North() {
		System.out.println("");
		System.out.println("When walking North you realise that there is some aromour on the floor");
		System.out.println("Your HP is recovered");
		playerHP = playerHP + 1;
		System.out.println("Your player HP is now" + playerHP);
		System.out.println("");
		System.out.println("");
		System.out.println("1. Go back to the crossroad");

		choice = myScanner.nextInt();
		if (choice == 1)
			;
		insideTower();
 
	}


	public void West() {
		System.out.println("");
		System.out.println("You walked into the weapons room and found an Axe");
		playerWeapon = "Axe";
		System.out.println("Your weapon is now an" + playerWeapon);
		System.out.println("");
		System.out.println("Go back to the crossroad inside the tower");

		choice = myScanner.nextInt();
		if (choice == 1)
			;
		insideTower();


	}
						

	public void East() { 
					
					System.out.println("");
					System.out.println("A goblin has come out of nowhere to attack you");
					System.out.println("");
					System.out.println("1. Run back to the crossroad");
					System.out.println("2. Use your" + playerWeapon + "and attack the goblin");
					System.out.println("3. Try to talk to the goblin");
					System.out.println("");
					
					choice = myScanner.nextInt();
					
					if(choice == 1) { 
						insideTower(); 
						
					} 
					
					if(choice == 2) { 
						Fight(); 
						
					}
					
					if(choice == 3) { 
						playerHP = playerHP - 2; 
						System.out.println("The goblin grabs his club and hits you");
						System.out.println(playerName + "Your HP is now" + playerHP);
					}
					
						else { 
						}  East(); 
					}

public void Fight() {
	
}
}