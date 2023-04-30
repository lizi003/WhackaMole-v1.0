package game001;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel
{
	Random ran=new Random();
	
	private int a,b;
	private int score=0;
	
	long time1;//上一次刷新时间
	long time2;//当前时间
	
	BufferedImage b1=ImageUtil.getImage("1.png");
	BufferedImage b2=ImageUtil.getImage("2.png");
	BufferedImage b3=ImageUtil.getImage("3.png");
	public MyPanel() 
	{
		setBackground(Color.black);//设置背景颜色为黑色
		addMouseListener(new MouseListener() //添加鼠标监听器
		{
			//抬起
			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			//按下
			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			//退出
			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			//进入
			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			//点击
			@Override
			public void mouseClicked(MouseEvent e)//处理点击后的事件
			{
				int mox=e.getX();
				int moy=e.getY();
				
				
				
				if((mox>=b*100&&mox<=b*100+100)&&(moy>=a*100&&moy<=a*100+100))
				{
					while(true) 
					{
						int y=ran.nextInt(3);
					 	int x=ran.nextInt(3);
						
						if(y!=a&&x!=b) 
						{
							a=y;
							b=x;
							break;
						}
					}
					score =score+1;
					System.out.println("你打中了");
					
					
				}
				else if(mox<=300&&moy<=300)
				{
					score=score-1;
					System.out.println("你没打中！");

				}
				else
				{
					System.out.println("请点击有地鼠的区域！");
				}
				
			}
		});
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);

//		g.fillOval(0, 0, 100, 100);
//		g.drawOval(100, 0, 100, 100);
//		g.fillRect(100, 200, 100, 100);
		time2=System.currentTimeMillis();//获取当前系统时间（毫秒）
		if(time2-time1>1000)//设置刷新时间（毫秒） 重要参数！
		{
			time1=time2;
			a=ran.nextInt(3);
			b=ran.nextInt(3);
		}
		
		for(int i=0;i<3;i++) //重新绘制所有地鼠的图形
		{
			for(int j=0;j<3;j++) 
			{
				if(i==a&&j==b) 
				{
					g.drawImage(b1, j*100, i*100,100,100,null );
				}else
				{
					g.drawImage(b3, j*100, i*100,100,100,null );
				}
			}
		}
		g.setColor(Color.white);
		g.drawString("分数："+score+"", 0, 350);
//		Integer.parseInt("123");
		repaint();//面板刷新，会调用当前方法
	}
}