

package BroCodeJava;

import javax.swing.JOptionPane;

public class GUI {
	
	public static void main(String[] args)
	
	{
		String name = JOptionPane.showInputDialog("enter your name");
		JOptionPane.showMessageDialog(null,"hello "+name);
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
		/*Integer.parseInt is take string and convert it to int and shows the output*/
		JOptionPane.showMessageDialog(null,"you are "+age+" years old");
		
		
		
		//
		double height =Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		/*1.Input dialog box is very important and interactive feature of Java Swing.
		2.You have been using the system.in for inputting anything from user. 
		3.Java swing provides the facility to input any thing(whether the text or numeric.
		4.The input dialog box contains two buttons first is "ok" and another is the "cancel". */
		JOptionPane.showMessageDialog(null,"you are "+height+" cm tall");
		
	}

}
