package JavaAssess;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String letTheAdventureBegin = inputCheckerOne();
		{
		}

	}

	private static String inputCheckerOne() {
		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do {
			System.out.println("Are you ready to begin your adventure?");
			System.out.println("1 = Yes, 2= No");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input >= 1 & input <= 2) {
					badInput = false;
				} else {
					System.out.println("You do want to go on an adventure don't you?");
				}
			} catch (Exception ex) {
				System.out.println("You do want to go on an adventure don't you?");
			}

		} while (badInput);
		switch (input) {
		case 1:
			System.out.println("Let's Go!");
			System.out.println("LET THE ADVENTURE BEGIN!");
			System.out.println(".");
			System.out.println(".");
			inputCheckerTwo();
		}
		switch (input) {
		case 2:
			System.out.println("That's too bad!");
			System.out.println("LET THE ADVENTURE BEGIN!");
			System.out.println(".");
			System.out.println(".");

			inputCheckerTwo();
		}
		return null;
	}

	private static String inputCheckerTwo() {

		System.out.println("##############################################################");
		System.out.println("##############################################################");
		System.out.println("########  __________________________________________   #######");
		System.out.println("########//                      *                    \\#######");
		System.out.println("########//       *                              *     \\######");
		System.out.println("########//                      *         *          \\#######");
		System.out.println("########//                 *                    *    \\#######");
		System.out.println("########//           *                               \\#######");
		System.out.println("########//       *                        *      *   \\#######");
		System.out.println("########//                 *                         \\#######");
		System.out.println("########//                           *               \\#######");
		System.out.println("########//                                  *        \\#######");
		System.out.println("########//        *          *                       \\#######");
		System.out.println("########//     *                                *    \\#######");
		System.out.println("########//                           *               \\#######");
		System.out.println("########//              *                       *    \\#######");
		System.out.println("########//          *                   *            \\#######");
		System.out.println("########//      *                *                *  \\#######");
		System.out.println("########//___________________________________________\\#######");
		System.out.println("##############################################################");
		System.out.println("##############################################################");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Crackling warp lighening surrounds you and you're pulled through a portal...");
		System.out.println("SWWOOOSHHHHH CRAAAASSHHH ZZWWOOOOOOOOOP");
		System.out.println("It would appear you've been transported to a strange and mysterious land...");
		System.out.println(
				"A foul smell hits your nose as you come to your senses, you've never seen a land like this before.");
		System.out.println(
				"You look around you and as far as the eye can see there is nothing but dark grey fog and bleak swampland.");
		System.out.println(
				"A thick cloud coveres the sky, blocking out the sun so much its impossible to tell where you are.");
		System.out.println("You should probably find the way home!");
		System.out.println("--------------------------------------------------------------------------");

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do {
			System.out.println("Do you remember who you are?");
			System.out.println("1 = Tom, 2= Dale");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input >= 1 & input <= 2) {
					badInput = false;
				} else {
					System.out.println("You do remember who you are don't you?");
				}
			} catch (Exception ex) {
				System.out.println("You do remember who you are don't you?");
			}

		} while (badInput);
		switch (input) {
		case 1:
			System.out.println("Greetings Tom,");
			System.out.println("--------------------------------------------------------------------------");

			playerTom();
		}
		switch (input) {
		case 2:
			System.out.println("Greetings Dale,");
			System.out.println("--------------------------------------------------------------------------");

			playerDale();
		}
		return null;
	}

	private static String playerTom() {

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		Character MageTom = new Character("Tom the Powerful", 1, "Magician", 10, 10, "Fire Blast");
		Character WarriorTom = new Character("Tom the Mighty", 1, "Warrior", 20, 20, "Double Strike");
		Character ArcherTom = new Character("Tom the Swift", 1, "Archer", 15, 15, "Double Shot");
		do {
			System.out.println("Do you remember your class?");
			System.out.println("1 = Warrior, 2 = Archer, 3 = Magician");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input >= 1 & input <= 3) {
					badInput = false;
				} else {
					System.out.println("Come on, you can rememeber!");
				}
			} catch (Exception ex) {
				System.out.println("Come on, you can rememeber!");
			}

		} while (badInput);
		switch (input) {
		case 1:
			System.out.println("Oh so you're a a mighty Warrior then?");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(WarriorTom);
			System.out.println("Now then warrior, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		switch (input) {
		case 2:
			System.out.println("An agile Archer?");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(ArcherTom);
			System.out.println("Now then Ranger, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		switch (input) {
		case 3:
			System.out.println("A powerful Magician, intersting...");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(MageTom);
			System.out.println("Now then Mage, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		return null;

	}

	private static String playerDale() {

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		Character MageDale = new Character("Dale the Powerful", 1, "Magician", 10, 10, "Fire Blast");
		Character WarriorDale = new Character("Dale the Mighty", 1, "Warrior", 20, 20, "Double Strike");
		Character ArcherDale = new Character("Dale the Swift", 1, "Archer", 15, 15, "Double Shot");
		do {
			System.out.println("Do you remember your class?");
			System.out.println("1 = Warrior, 2 = Archer, 3 = Magician");
			System.out.println("--------------------------------------------------------------------------");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input >= 1 & input <= 3) {
					badInput = false;
				} else {
					System.out.println("Come on, you can remember!");
				}
			} catch (Exception ex) {
				System.out.println("Come on, you can rememeber!");
			}

		} while (badInput);
		switch (input) {
		case 1:
			System.out.println("Oh so you're a a mighty Warrior then?");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(WarriorDale);
			System.out.println("Now then warrior, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		switch (input) {
		case 2:
			System.out.println("An agile Archer?");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(ArcherDale);
			System.out.println("Now then Ranger, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		switch (input) {
		case 3:
			System.out.println("A powerful Magician, intersting...");
			System.out.println("Lets find out a little bit more about out you shall we?");
			System.out.println(MageDale);
			System.out.println("Now then Mage, how are we going to get back home?");
			System.out.println("--------------------------------------------------------------------------");

			inputCheckerThree();
		}
		return null;

	}

	private static String inputCheckerThree() {

		int x1 = 2;
		int y1 = 2;
		int x2 = 1;
		int y2 = 1;
		System.out.println(
				"You begin to wander aroound the swamp, becoming increasingly lost. Slowly you being lose all hope of ever returning home.");
		System.out.println(
				"What feels like hours go by, but suddenly you remember you have a magical compass in your pocket! What are the chances of that?");
		System.out.println("You pull out your trusty compass, it will show you the way home");
		System.out.println("You take a look at your compass: ");
		System.out.println("2, 2");
		System.out.println("When it reaches 0, 0 you'll find what you need to get home!");
		System.out.println("    _______________");
		System.out.println("   //     //\\     \\");
		System.out.println("  //     //||\\     \\");
		System.out.println(" //        ||        \\");
		System.out.println("||         ||        ||");
		System.out.println("||         []        ||");
		System.out.println("||                   ||");
		System.out.println(" \\                  //");
		System.out.println("  \\                //");
		System.out.println("   \\______________//");

		System.out.println("What direction do you want to go in?");
		System.out.println("1 = North 2 = East 3 = South 4 = West");

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do {

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input > 0 & input <= 1) {
					badInput = false;
				} else {
					System.out.println("I dont think that's the corect way!");
				}
			} catch (Exception ex) {
				System.out.println("Are you sure you're following the compass?");
			}

		} while (badInput);

		/* switch (input) {

		case 2:
			System.out.println((x1 * x2)+1 + " , " + (y1 * y2)+1);
			System.out.println("you seem to be going the wrong way");
			badInput= true;
		}

		switch (input) {

		case 3:

		}

		switch (input) {

		case 4:

		} */

		switch (input) {

		case 1:
			System.out.println("You're getting closer!");
			System.out.println(x1 * x2 + " , " + y1 * y2);
			System.out.println("--------------------------------------------------------------------------");

			bufferOne();
		}
		return null;
	}

	private static String inputCheckerFour() {

		int x1 = 1;
		int y1 = 2;
		int x2 = 1;
		int y2 = 1;

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do {
			System.out.println("You look back at your compass: ");

			System.out.println("    _______________");
			System.out.println("   //              \\");
			System.out.println("  //                \\");
			System.out.println(" //                  \\");
			System.out.println("||                   ||");
			System.out.println("||         []======> ||");
			System.out.println("||                   ||");
			System.out.println(" \\                  //");
			System.out.println("  \\                //");
			System.out.println("   \\______________//");

			System.out.println("What direction do you want to go in?");
			System.out.println("1 = North 2 = East 3 = South 4 = West");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input > 1 & input <= 2) {
					badInput = false;
				} else {
					System.out.println("Pick a direction!");
				}
			} catch (Exception ex) {
				System.out.println("Please enter a number");
			}

		} while (badInput);
		switch (input) {
		case 2:
			System.out.println(x1 * x2 + " , " + y1 * y2);
			System.out.println("You're getting closer!");
			System.out.println("--------------------------------------------------------------------------");

			bufferTwo();
		}
		return null;
	}

	private static String inputCheckerFive() {

		int x1 = 1;
		int y1 = 1;
		int x2 = 1;
		int y2 = 1;

		System.out.println("You take another look at your compass: ");
		System.out.println("    _______________");
		System.out.println("   //              \\");
		System.out.println("  //                \\");
		System.out.println(" //                  \\");
		System.out.println("||                   ||");
		System.out.println("||<========[]        ||");
		System.out.println("||                   ||");
		System.out.println(" \\                  //");
		System.out.println("  \\                //");
		System.out.println("   \\______________//");

		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do {

			System.out.println("What direction do you want to go in?");
			System.out.println("1 = North 2 = East 3 = South 4 = West");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input > 3 & input <= 4) {
					badInput = false;
				} else {
					System.out.println("I dont think thats the right way!");
				}
			} catch (Exception ex) {
				System.out.println("Are you sure you're following the compass?");
			}

		} while (badInput);
		switch (input) {
		case 4:
			System.out.println(x1 * x2 + " , " + y1 * y2);
			System.out.println("Just a little further!");
			System.out.println("--------------------------------------------------------------------------");

			bufferThree();
		}
		return null;
	}

	private static String inputCheckerSix() {

		int x1 = 0;
		int y1 = 1;
		int x2 = 1;
		int y2 = 1;
		int input = 0;
		boolean badInput = true;

		System.out.println("You're just one more step away from freedom! ");
		System.out.println("    _______________");
		System.out.println("   //              \\");
		System.out.println("  //                \\");
		System.out.println(" //                  \\");
		System.out.println("||                   ||");
		System.out.println("||         []        ||");
		System.out.println("||         ||        ||");
		System.out.println(" \\        ||        //");
		System.out.println("  \\       ||       //");
		System.out.println("   \\_______v_______//");

		Scanner inputScanner = new Scanner(System.in);
		do {

			System.out.println("What direction do you want to go in?");
			System.out.println("1 = North 2 = East 3 = South 4 = West");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input > 2 & input <= 3) {
					badInput = false;
				} else {
					System.out.println("I dont think thats the right way!");
				}
			} catch (Exception ex) {
				System.out.println("Are you sure you're following the compass?");
			}

		} while (badInput);
		switch (input) {
		case 3:
			System.out.println(x1 * x2 + " , " + y1 * y2);
			System.out.println("lets go!");
			System.out.println("--------------------------------------------------------------------------");

			bufferFour();
		}
		return null;
	}

	private static String inputCheckerSeven() {

		int x1 = 0;
		int y1 = 0;
		int x2 = 1;
		int y2 = 1;
		int input = 0;
		boolean badInput = true;

		System.out.println("You did it!");
		System.out.println("You look down at the compass");
		System.out.println(x1 * x2 + " , " + y1 * y2);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Suddenly a goblin jumpers out at you! It smacks you in the head with its club!");
		System.out.println("OUCH!");
		System.out.println("What would you like to do?");

		Scanner inputScanner = new Scanner(System.in);
		do {

			System.out.println("1 = Attack! 2 = Run!");

			try {
				input = Integer.parseInt(inputScanner.nextLine());
				if (input > 0 & input <= 2) {
					badInput = false;
				} else {
					System.out.println("Quick, he's right there!");
				}
			} catch (Exception ex) {
				System.out.println("Quickly make a choice!");
			}

		} while (badInput);
		switch (input) {
		case 1:
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("You murder the goblin in cold blood!");
			System.out.println(
					"You also loot the goblin for all the gold he was carrying on him and dash into the portal!");
			System.out.println("Without your trusty magic compass you would have surely died in there!");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("GAME OVER - YOU WIN");
			System.out.println("Thanks for playing!");
			System.out.println("-----Credits-----");
			System.out.println("Storyline: Thomas Sessions");
			System.out.println("Animations and art: Thomas Sessions");
			System.out.println("Promgramming and game design: Thomas Sessions");

		}
		switch (input) {
		case 2:
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("You dsh into the portal! That was quite enough for me!");
			System.out.println("You make it back home safe and sound, what an adventure!");
			System.out.println("Without your trusty magic compass you would have surely died in there!");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("GAME OVER - YOU WIN");
			System.out.println("Thanks for playing!");
			System.out.println("-----Credits----");
			System.out.println("Storyline: Thomas Sessions");
			System.out.println("Animations and art: Thomas Sessions");
			System.out.println("Promgramming and game design: Thomas Sessions");

		}
		return null;

	}

	public static String bufferOne() {

		System.out.println("You follow the compus and keep walking, it suddenly changes direction!");
		System.out.println("--------------------------------------------------------------------------");

		inputCheckerFour();
		return null;
	}

	public static String bufferTwo() {

		System.out.println("You're tired but you press on, deeper into this strange and unknown land");
		System.out.println("--------------------------------------------------------------------------");

		inputCheckerFive();
		return null;
	}

	public static String bufferThree() {

		System.out.println("You keep going, you're sure the end is just around the corner!");
		System.out.println("--------------------------------------------------------------------------");

		inputCheckerSix();
		return null;
	}

	public static String bufferFour() {

		System.out.println("The compass starts swinning quickly on the spot, you must have finally reached the end!");
		System.out.println("You see a portal up ahead!");
		inputCheckerSeven();
		return null;
	}
}