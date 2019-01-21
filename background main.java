import javax.swing.JFrame;

public class servermainclass {
	public static void main(String[] args) {
		server mark1 = new server();
		mark1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mark1.startRunning();
	}
}