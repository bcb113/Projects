import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PushCounterPanel extends JPanel{
	private int count;
	private JButton push;
	private JLabel label;
	private JButton b2;

	//-----------------------------------------------------------------

	// Constructor: Sets up the GUI.

	//-----------------------------------------------------------------

	public PushCounterPanel(){
		count = 0;
		push = new JButton("Push Me!");
		label = new JLabel();
		b2 = new JButton("Don't Push Me!");
		push.addActionListener(new ButtonListener());
		b2.addActionListener(new ButtonListener2());
		push.setForeground(Color.RED);
		push.setBackground(Color.BLACK);
		b2.setForeground(Color.RED);
		b2.setBackground(Color.BLACK);
		
		add(push);
		add(label);
		add(b2);

		setBackground(Color.RED);	
		setPreferredSize(new Dimension(400, 400));
	}

	//*****************************************************************

	// Represents a listener for button push (action) events.

	//*****************************************************************

	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		count++;
		label.setText("Pushes: " + count);
		}
	}
	private class ButtonListener2 implements ActionListener{
		public void actionPerformed(ActionEvent event){
		count--;
		label.setText("Pushes: " + count);
		}
	}
}