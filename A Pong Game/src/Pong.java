import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private final static String WINDOW_TITLE = "A Pong Game";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;
	
	public Pong() {
        setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);        
        add(new PongPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static int getWindowWidth() {
		return WINDOW_WIDTH;
	}
	
	public static int getWindowHeight() {
		return WINDOW_HEIGHT;
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	           public void run() {
	                  new Pong();
	           }
	         });
	}

}