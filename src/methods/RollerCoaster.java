package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
 String answer = JOptionPane.showInputDialog("How many inches tall are you?");
 int height = Integer.parseInt(answer);
	if (height >48) {
		JOptionPane.showMessageDialog(null, "You can go on the roller coaster.");
	} else if (height <= 48) {
		JOptionPane.showMessageDialog(null, "You cannot go on the roller coaster.");
	}
}
}
