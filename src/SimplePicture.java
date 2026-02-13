import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
// My team is not here, please help!
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static int XNUMBER = 200;
	public static int YNUMBER = 100;

// ndsjfnakjndfkjasnj
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", XNUMBER, YNUMBER);
		add(robot);
		GLabel/* comment in line to break shit */ label = new GLabel("please, please, please dont work, it is important that this does not work for the next step in the project", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}