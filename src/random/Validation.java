//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		Random generator = new Random();
	
		for (int i = 0; i < 10.; i++) {
			int random = generator.nextInt(4);
		
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "You are nice!");
		} else if (random == 1) {
			JOptionPane.showMessageDialog(null, "You are funny!");
		} else if (random == 2) {
			JOptionPane.showMessageDialog(null, "I like your shirt!");
		} else if (random == 3) {
			JOptionPane.showMessageDialog(null, "You are really nice!");
		}
		}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
