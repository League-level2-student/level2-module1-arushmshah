package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	void userinterface() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setTitle("Guest Book");
		frame.setSize(1000, 1000);
		button1.setText("Add Name");
		button2.setText("View Names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		frame.pack();
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button1) {
			String name = JOptionPane.showInputDialog("Please Enter a Name.");
			names.add(name);
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, names);
			
		}
	}
}
