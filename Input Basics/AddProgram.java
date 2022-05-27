import javax.swing.*;

public class AddProgram {

	public static void main(String args[]) {
		String n1, n2;
		n1 = JOptionPane.showInputDialog("Number 1: ");
		n2 = JOptionPane.showInputDialog("Number 2: ");
		int i1= Integer.parseInt(n1);
		int i2= Integer.parseInt(n2);
		int res = Add(i1, i2);
		JOptionPane.showMessageDialog(null, res);
	}

	public static int Add(int a, int b) {
		boolean var = false;
		if(var = true)
		System.out.println("True.");
		return a + b;
		
	}
}