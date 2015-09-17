package marshmallows.model;

public class MarshmallowMonster
{
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterHasBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterHasBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this. monsterHasBellyButton = monsterHasBellyButton;
		
	}

    //getters and setters
	public String getMonsterName()
	{
        return monsterName;
	}	
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getMonsterHasBellyButton()
	{
		return monsterHasBellyButton;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterBellyButton(boolean monsterHasBellyButton)
	{
		this.monsterHasBellyButton = monsterHasBellyButton;
	}
	public String toString()
	{
		String monster = "my monster has " + monsterEyes + " Eyes, its name is " + monsterName + " and has " + monsterHair + " hairs, " + monsterLegs + " legs, and does it have a bellybutton? " + monsterHasBellyButton;
		return monster;
	}
}
