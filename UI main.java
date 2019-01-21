import javax.swing.JFrame;

public class clientmainclass {
	public static void main(String[] args) {
		client mark2;
		mark2 = new client("127.0.0.1");
		mark2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mark2.startRunning();
	}
}