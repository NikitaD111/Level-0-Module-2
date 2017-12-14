import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int r = new Random().nextInt(100);
		int a = new Random().nextInt(100);
		int s = new Random().nextInt(100);
		int d = new Random().nextInt(100);
		int f = new Random().nextInt(100);
		int g = new Random().nextInt(100);
		JOptionPane.showMessageDialog(null, r + " " + a + " " + s + " " + d + " " + " " + f + " " + g);

	}
}
