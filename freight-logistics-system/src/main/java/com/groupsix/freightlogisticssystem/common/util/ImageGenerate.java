package com.groupsix.freightlogisticssystem.common.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class ImageGenerate {
	
	
	//初始化验证字符串
	private final static String str = "123456789abcdefghijklmnopqrstuvwxyz";
	
	//验证码的宽度
	private int width;
	
	//验证码的高度
	private int height;
	
	//验证是否成功 true 成功
	private int isSuccess;
	
	//验证内容
	private String code;
	
	
	/**
	 * 生成一次性的验证码图片
	 * @return
	 */
	public static BufferedImage generate(String code){
		int width = 150;
		int height = 35;
		BufferedImage image = new BufferedImage( width, height,BufferedImage.TYPE_INT_RGB );
		Graphics g = image.getGraphics(); 
		
		Random r = new Random();
	    //以下填充背景颜色  
	    g.setColor(new Color(
	    		r.nextInt(255),
	    		r.nextInt(255),
	    		r.nextInt(255)
	    		));//Color.lightGray);  
	    
	    g.fillRect(0, 0, width, height);  
	    //以下设置前景色  
	    //g.setColor(Color.blue);  
	    
	    //	  绘制干扰线
		Random random = new Random();
//		g.setColor(new Color(
//	    		r.nextInt(255),
//	    		r.nextInt(255),
//	    		r.nextInt(255)
//	    		));//new Color( 255,255,255));// 设置线条的颜色
//		
		for (int i = 0; i < 20; i++)
		{
			g.setColor(new Color(
		    		r.nextInt(255),
		    		r.nextInt(255),
		    		r.nextInt(255)
		    		));
			int x = random.nextInt(width - 1);
			int y = random.nextInt(height - 1);
			int xl = random.nextInt(6) + 1;
			int yl = random.nextInt(12) + 1;
			g.drawLine(x, y, x + xl + 40, y + yl + 20);
		}
	    
	    
	    g.setFont(new Font("Tahoma", Font.BOLD, 24));
	    //验证码
	    //String code = VerificationCode.getVeriCode();
	    //g.drawString(VerificationCode.getVeriCode(),25,25);  
	    for (int i = 0; i < code.length(); i++) {
	    	g.setColor(new Color(
		    		r.nextInt(255),
		    		r.nextInt(255),
		    		r.nextInt(255)
		    		));
	    	g.drawString( code.charAt(i)+"" ,i*25+25,25);
		}
	    
	    //g.drawLine(10,50,290,50);  
	    //g.drawString("Image Show",10,70); 
	    
	    g.dispose();  
		
		
		
		
		return image;	
	}
	/**
	 * 创建指定大小的的图片
	 * @param width
	 * @param height
	 * @return
	 */
	private static BufferedImage createImage() {
		
		int width = 150;
		int height = 35;
		BufferedImage image = new BufferedImage( width, height,BufferedImage.TYPE_INT_RGB );
		Graphics g = image.getGraphics(); 
		
		Random r = new Random();
	    //以下填充背景颜色  
	    g.setColor(new Color(
	    		r.nextInt(255),
	    		r.nextInt(255),
	    		r.nextInt(255)
	    		));//Color.lightGray);  
	    
	    g.fillRect(0, 0, width, height);  
	    //以下设置前景色  
	    //g.setColor(Color.blue);  
	    
	    //	  绘制干扰线
		Random random = new Random();
//		g.setColor(new Color(
//	    		r.nextInt(255),
//	    		r.nextInt(255),
//	    		r.nextInt(255)
//	    		));//new Color( 255,255,255));// 设置线条的颜色
//		
		for (int i = 0; i < 20; i++)
		{
			g.setColor(new Color(
		    		r.nextInt(255),
		    		r.nextInt(255),
		    		r.nextInt(255)
		    		));
			int x = random.nextInt(width - 1);
			int y = random.nextInt(height - 1);
			int xl = random.nextInt(6) + 1;
			int yl = random.nextInt(12) + 1;
			g.drawLine(x, y, x + xl + 40, y + yl + 20);
		}
	    
	    
	    g.setFont(new Font("Tahoma", Font.BOLD, 24));
	    //验证码
	    String code = VerifyCode.getVeriCode();
	    //g.drawString(VerificationCode.getVeriCode(),25,25);  
	    for (int i = 0; i < code.length(); i++) {
	    	g.setColor(new Color(
		    		r.nextInt(255),
		    		r.nextInt(255),
		    		r.nextInt(255)
		    		));
	    	g.drawString( code.charAt(i)+"" ,i*25+25,25);
		}
	    
	    //g.drawLine(10,50,290,50);  
	    //g.drawString("Image Show",10,70); 
	    
	    g.dispose();  
		
		
		
		
		return image;
	}
	
	
	private String getRanStr(BufferedImage image){
		
		Graphics g = image.getGraphics();
		
		Random r = new Random();
		
		g.setColor( new Color(
					r.nextInt(255),
					r.nextInt(255),
					r.nextInt(255)));
		
		return "";
	}
	
	
	
	
	
}
