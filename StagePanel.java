import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class StagePanel extends JPanel 
{
	private BufferedImage image;
	private int width, height, posX;
	private Stage stage;
	public StagePanel(int width, int height, int posX, Stage stage) 
	{
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.stage = stage;
		image = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		g2.setColor(Color.blue);
		g2.fillRect(0, 0, image.getWidth(), image.getHeight());
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		((Graphics2D)g).drawImage(image, this.posX, 0, this);
	}

	public StagePanel(LayoutManager arg0) 
	{
		super(arg0);

	}

	public StagePanel(boolean arg0) 
	{
		super(arg0);

	}
	
	public void update(int posx)
	{
		this.posX = posx;
		repaint();
	}
	

	public StagePanel(LayoutManager arg0, boolean arg1) 
	{
		super(arg0, arg1);

	}
	
	public int getPosX()
	{
		return this.posX;
	}
	
	public void setLength(int length)
	{
		this.width = length;
	}
	
	public void setStageStartTime(int startTime)
	{
		stage.setStartTime(startTime);
	}
	
	public void setStageEndTime(int endTime)
	{
		stage.setEndTime(endTime);
	}
	
	public int getStageStartTime()
	{
		return stage.getStartTime();
	}
	
	public int getImageWidth()
	{
		return this.width;
	}

}
