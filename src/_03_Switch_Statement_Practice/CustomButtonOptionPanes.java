package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Today is Sunday");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Today is Saturday");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Today is Monday");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Today is Tuesday");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Today is Wednesday");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Today is Thursday");
			break;
		case "Friday":	
			JOptionPane.showMessageDialog(null, "Today is Friday");
			break;
		
		}
		
	}
}
