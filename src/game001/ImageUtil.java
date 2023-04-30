package game001;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtil
{
	public static BufferedImage getImage(String path)
	{
		try
		{
			BufferedImage bu=ImageIO.read(ImageUtil.class.getResource(path));
			return bu;
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
