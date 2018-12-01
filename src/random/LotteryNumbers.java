package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	String lottery = "";
	
	for (int i = 0; i < 5; i++) {
		
	
	int  one;
	one = new Random().nextInt(9);
	lottery = lottery+one;
	}
	
	
	JOptionPane.showMessageDialog(null, lottery);
}
}

