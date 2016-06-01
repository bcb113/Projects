import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TTTpanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private boolean player = true; //true p1, false p2

	public TTTpanel(){
		GridLayout Layout = new GridLayout(3,3); 
		setLayout(Layout);

		b1 = new JButton();
		b1.setFont(new Font("Arial", Font.PLAIN, 110));
		b1.addActionListener(new b1Listener());

		b2 = new JButton();
		b2.setFont(new Font("Arial", Font.PLAIN, 110));
		b2.addActionListener(new b2Listener());

		b3 = new JButton();
		b3.setFont(new Font("Arial", Font.PLAIN, 110));
		b3.addActionListener(new b3Listener());

		b4 = new JButton();
		b4.setFont(new Font("Arial", Font.PLAIN, 110));
		b4.addActionListener(new b4Listener());

		b5 = new JButton();
		b5.setFont(new Font("Arial", Font.PLAIN, 110));
		b5.addActionListener(new b5Listener());

		b6 = new JButton();
		b6.setFont(new Font("Arial", Font.PLAIN, 110));
		b6.addActionListener(new b6Listener());

		b7 = new JButton();
		b7.setFont(new Font("Arial", Font.PLAIN, 110));
		b7.addActionListener(new b7Listener());

		b8 = new JButton();
		b8.setFont(new Font("Arial", Font.PLAIN, 110));
		b8.addActionListener(new b8Listener());

		b9 = new JButton();
		b9.setFont(new Font("Arial", Font.PLAIN, 110));
		b9.addActionListener(new b9Listener());

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

		setPreferredSize(new Dimension(400,400));
	}

	private class b1Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b1.getText().equals("")){
				if(player == true){
					b1.setText("X");
					test("X");
					player = false;
				}else{
					b1.setText("O");
					test("O");
					player = true;
				}
				b1.setBorderPainted(false);
				b1.setFocusPainted(false);
			}
		}
	}
	private class b2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b2.getText().equals("")){
				if(player == true){
					b2.setText("X");
					test("X");
					player = false;
				}else{
					b2.setText("O");
					test("O");
					player = true;
				}
				b2.setBorderPainted(false);
				b2.setFocusPainted(false);
			}
		}
	}
	private class b3Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b3.getText().equals("")){
				if(player == true){
					b3.setText("X");
					test("X");
					player = false;
				}else{
					b3.setText("O");
					test("O");
					player = true;
				}
				b3.setBorderPainted(false);
				b3.setFocusPainted(false);
			}
		}
	}
	private class b4Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b4.getText().equals("")){
				if(player == true){
					b4.setText("X");
					test("X");
					player = false;
				}else{
					b4.setText("O");
					test("O");
					player = true;
				}
				b4.setBorderPainted(false);
				b4.setFocusPainted(false);
			}
		}
	}
	private class b5Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b5.getText().equals("")){
				if(player == true){
					b5.setText("X");
					test("X");
					player = false;
				}else{
					b5.setText("O");
					test("O");
					player = true;
				}
				b5.setBorderPainted(false);
				b5.setFocusPainted(false);
			}
		}
	}
	private class b6Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b6.getText().equals("")){
				if(player == true){
					b6.setText("X");
					test("X");
					player = false;
				}else{
					b6.setText("O");
					test("O");
					player = true;
				}
				b6.setBorderPainted(false);
				b6.setFocusPainted(false);
			}
		}
	}
	private class b7Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b7.getText().equals("")){
				if(player == true){
					b7.setText("X");
					test("X");
					player = false;
				}else{
					b7.setText("O");
					test("O");
					player = true;
				}
				b7.setBorderPainted(false);
				b7.setFocusPainted(false);
			}
		}
	}
	private class b8Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b8.getText().equals("")){
				if(player == true){
					b8.setText("X");
					test("X");
					player = false;
				}else{
					b8.setText("O");
					test("O");
					player = true;
				}
				b8.setBorderPainted(false);
				b8.setFocusPainted(false);
			}
		}
	}
	private class b9Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(b9.getText().equals("")){
				if(player == true){
					b9.setText("X");
					test("X");
					player = false;
				}else{
					b9.setText("O");
					test("O");
					player = true;
				}
				b9.setBorderPainted(false);
				b9.setFocusPainted(false);
			}
		}
	}
	private void test(String token){
		//test to see if 3 X's or O's have been matched
		switch(token){
		case "X":
			if(b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else if(b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")){
				JOptionPane.showMessageDialog(null, "Player 1 wins!");
				retry();
			}else{
				drawTest();
			}
			break;
		case "O":
			if(b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else if(b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")){
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				retry();
			}else{
				drawTest();
			}
			break;
		}
	}
	private void drawTest(){
		if(!(b1.getText().equals("")) && !(b2.getText().equals("")) && !(b3.getText().equals("")) 
				&& !(b4.getText().equals("")) && !(b5.getText().equals("")) && !(b6.getText().equals(""))
				&& !(b7.getText().equals("")) && !(b8.getText().equals("")) && !(b9.getText().equals(""))){
			JOptionPane.showMessageDialog(null, "Draw!");
			retry();
		}
	}
	private void retry(){
		int reply = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Retry", JOptionPane.YES_NO_OPTION);

		if(reply == JOptionPane.YES_OPTION){
			TicTacToe.retry();
		}		
		deactivateBoard();
	}
	private void deactivateBoard(){
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b3.setBorderPainted(false);
		b3.setFocusPainted(false);
		b4.setBorderPainted(false);
		b4.setFocusPainted(false);
		b5.setBorderPainted(false);
		b5.setFocusPainted(false);
		b6.setBorderPainted(false);
		b6.setFocusPainted(false);
		b7.setBorderPainted(false);
		b7.setFocusPainted(false);
		b8.setBorderPainted(false);
		b8.setFocusPainted(false);
		b9.setBorderPainted(false);
		b9.setFocusPainted(false);

		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
}
