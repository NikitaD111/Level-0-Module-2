import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("How old are you");
		int a = Integer.parseInt(r);
		if (a >= 18) {

			JOptionPane.showInputDialog("Who should be the next president.");
		}

		if (a < 18) {
			JOptionPane.showMessageDialog(null, "No one cares what you think");

		}
	}
}
