//HEHE
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class GuiTest implements MouseListener{
	private static JFrame homeFrame;
	private static JPanel homePanel;
	private static JPanel northPanel, southPanel, eastPanel, westPanel, centerPanel;
	public GuiTest(){
		homeFrame = new JFrame("Put Name Here");
		homePanel = new JPanel();
		homeFrame.addMouseListener(this);
		northPanel = new JPanel();
		southPanel = new JPanel();
		eastPanel = new JPanel();
		westPanel = new JPanel();
		centerPanel = new JPanel(){
			public void paintComponent(Graphics g){
			centerPanel.setLayout(null);
			g.drawOval(80, 70, 150, 150);
			g.setColor(Color.BLACK);
			g.fillOval(120, 120, 15, 15);
			g.fillOval(170, 120, 15, 15);
			g.drawArc(130, 180, 50, 20, 180, 180);
			}
		};
	}
    public static void main(String args[]){
		GuiTest gt = new GuiTest();
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setSize(700,700);
		homeFrame.add(homePanel);
		homePanel.setLayout(null);
		homeFrame.setResizable(false);
		homeFrame.setVisible(true);
		gt.homeImg();
		//gt.homeCenter();
    }
    // x,y: are the click coords
    // xloc,yloc,width, height is just the drawOval parameters
    public boolean isInCircle(int x, int y, int xloc, int yloc, int width, int height){
		if (x > xloc && x < (xloc+ width) && y > yloc && y < (yloc+height)){
			return true;
		}
		return false;
	}
    public void homeImg(){
		//JButton button = new JButton("Press");
		//homePanel.add(button);
		homePanel.setLayout(new BorderLayout());
		homePanel.add(northPanel, BorderLayout.NORTH); 
        homePanel.add(southPanel, BorderLayout.SOUTH); 
        homePanel.add(eastPanel, BorderLayout.EAST); 
        homePanel.add(westPanel, BorderLayout.WEST); 
        homePanel.add(centerPanel, BorderLayout.CENTER); 
        northPanel.setBackground(Color.red);
        southPanel.setBackground(Color.blue);
        eastPanel.setBackground(Color.green);
        westPanel.setBackground(Color.yellow);
        centerPanel.setBackground(Color.pink);
	}
	public void mouseReleased(MouseEvent e){}
	public void mosueClicked(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		if(isInCircle(e.getX(), e.getY(), 80, 70, 150, 150))
			System.out.println("GRRRR");
		
	}
	
}
