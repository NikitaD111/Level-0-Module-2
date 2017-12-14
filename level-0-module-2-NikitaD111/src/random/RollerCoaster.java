package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("How tall are you in inches");
		int a = Integer.parseInt(r);
		if (a <= 48) {
		
		
			JOptionPane.showMessageDialog(null, "You can come into the ride");
			}
	
			if (a >= 48) {
				JOptionPane.showMessageDialog(null, "You can't come into the ride");

			}
	}
	}
}
