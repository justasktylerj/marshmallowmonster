package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster rinzlerMonster;
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
		myOutput.displayMonsterInfo(rinzlerMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster info: " + rinzlerMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("Type in a better name or the monster");
		String betterMonsterName = monsterScanner.next();
		rinzlerMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		rinzlerMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		rinzlerMonster.setMonsterNoses(betterMonsterNoses);
	}
}