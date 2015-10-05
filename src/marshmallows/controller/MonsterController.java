package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster TylerMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3.0;
		double hair = 1.0;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Fraz-Urb'luu";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		TylerMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(TylerMonster.toString());
		myOutput.displayMonsterGUI(TylerMonster.toString());
		this.makeUserMonster();
		myOutput.displayMonsterGUI(userMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("master, give me a name");
		String betterMonsterName = monsterScanner.next();
		
		System.out.println("GIVE ME A NUMBER OF EYES");
		int betterMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("TIME FOR NOSES");
		int betterMonsterNoses = monsterScanner.nextInt();
		
		System.out.println("HOW BOUT HAIR");
		double betterMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("GIVE ME SOME LEGS!");
		double betterMonsterLegs = monsterScanner.nextDouble();
		
		System.out.println("Do I have a belly button?");
		boolean betterMonsterHasBellyButton = monsterScanner.nextBoolean();
		TylerMonster.setMonsterName(betterMonsterName);
		TylerMonster.setMonsterEyes(betterMonsterEyes);
		TylerMonster.setMonsterNoses(betterMonsterNoses);
		TylerMonster.setMonsterHair(betterMonsterHair);
		TylerMonster.setMonsterLegs(betterMonsterLegs);
		TylerMonster.setMonsterBellyButton(betterMonsterHasBellyButton);
		
	}

    /**
     *  This method will get the information to create an instance of a MarshmallowMonster.
     */
	private void makeUserMonster()
    {
    	//step one: get variables
		String userName; 
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userHasBellyButton;
		
		//step two: define variables by using Scanner to get user input
		System.out.println("type in you monstrosities name");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster");
		userEyes = monsterScanner.nextInt();
		System.out.println("type in the number of noses for your monster");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("type in the number of hair for your monster");
		userHair = monsterScanner.nextDouble();
		System.out.println("type in the number of legs for your monster");
		userLegs = monsterScanner.nextDouble();
		System.out.println("does your monster have a belly button?");
		userHasBellyButton = monsterScanner.nextBoolean();
		monsterScanner.nextLine();
		
		//step three: make a monster - use constructor!! remember that order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userHasBellyButton);
		
    }
}
    