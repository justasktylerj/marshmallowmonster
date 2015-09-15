package marshmallows.model;

public class MarshmallowMonster
{
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this. monsterBellyButton = monsterBellyButton;
		
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
	
	public void setMonsterName(String monster)
	{
		this.monsterName = monsterName;
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
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setMonsterNoses(int monster)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHair(double monster)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monster)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterBellyButton(boolean monster)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
}
