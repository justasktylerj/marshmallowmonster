package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
    public void displayMonsterGUI(String info)
    {
    	JOptionPane.showMessageDialog(null, "My Monster information is: " + info);
    }
    
    public void displayMonsterBeg(String info)
    {
    	JOptionPane.showMessageDialog(null, "Master, I have: ");
    }
    
    public void displayMonsterHelp(String info)
    {
    	JOptionPane.showMessageDialog(null, "Master, my info is: " );
    }
}
