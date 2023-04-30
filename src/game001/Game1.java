package game001;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game1
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame ("打地鼠");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//显示面板
		
		MyPanel myPanel =new MyPanel();
		frame.add(myPanel);
		
		frame.setSize(310, 400);//设置位置
		frame.setLocationRelativeTo(null);//设置面板位置默认居中
		frame.setResizable(false);//设置面板大小不可改动
	}

}