package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster rinzlerMonster;
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
		rinzlerMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		rinzlerMonster.toString();
		myOutput.displayMonsterInfo(rinzlerMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster info: " + rinzlerMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("Type in a better name or the monster");
		String betterMonsterName = monsterScanner.next();
		
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("Type in a different number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		
		System.out.println("Type in a different number of hair for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("Type in a different number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		
		System.out.println("Type in a wheather or not it has a belly button for the monster");
		boolean betterMonsterHasBellyButton = monsterScanner.nextBoolean();
		rinzlerMonster.setMonsterName(betterMonsterName);
		rinzlerMonster.setMonsterEyes(betterMonsterEyes);
		rinzlerMonster.setMonsterNoses(betterMonsterNoses);
		rinzlerMonster.setMonsterHair(betterMonsterHair);
		rinzlerMonster.setMonsterLegs(betterMonsterLegs);
		rinzlerMonster.setMonsterBellyButton(betterMonsterHasBellyButton);
		
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
		
		//step three: make a monster - use constructor!! remember that order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userHasBellyButton);
		
    }
}
    