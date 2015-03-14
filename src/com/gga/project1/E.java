package com.gga.project1;

import javax.swing.JOptionPane;
//import java.net.URL;
//import javax.swing.ImageIcon;

public class E {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String name = JOptionPane.showInputDialog("What is your name?");
		// URL imageLocation = new URL(
		// "http://horstmann.com/bigjava/duke.gif");
		// JOptionPane.showMessageDialog(null, "Hello", "Greetings!!!",
		// JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		String toDo = JOptionPane
				.showInputDialog("What would you like me to do, " + name + "?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + "."
				+ " I won't be able to " + toDo + ".");
		System.exit(0);
	}

}