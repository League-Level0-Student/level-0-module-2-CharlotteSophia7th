package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int hi = Integer.parseInt(age);
		if (hi >= 18) {
			JOptionPane.showInputDialog("Who do you think should be president?");
		} else if (hi < 18) {
			JOptionPane.showMessageDialog(null, "No one cares what you think!");
		}
	}

}
