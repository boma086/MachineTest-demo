public class DragonWarriorReferenceChallenger {

	  public static void main(String... doYourBest) {
	    StringBuilder warriorProfession = new StringBuilder("Dragon ");
	    String warriorWeapon = "Sword ";
	    changeWarriorClass(warriorProfession, warriorWeapon);
	    warriorWeapon = null;
	    warriorProfession = null;

	    System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
	  }

	  static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
	    warriorProfession.append("Knight");
	    weapon = "Dragon " + weapon;

	  }

	}