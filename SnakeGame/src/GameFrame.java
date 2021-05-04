import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	GameFrame(){
		
		/*
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		*/
		
		JFrame frame = new JFrame();
		frame.add(new GamePanel());
		frame.setTitle("Snake Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
		ImageIcon image = new ImageIcon("C:\\Users\\Kenny\\eclipse-workspace\\SnakeGame\\src/Snake.png");
		frame.setIconImage(image.getImage());
		
		
		
		
	}
	
	
}
