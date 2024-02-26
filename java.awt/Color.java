/*
-	programmer:Mayank
-	./Font.java
*/
class Color extends javax.swing.JFrame
{
	Color()
	{
	    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	    
		setSize(500,300);
		
		setLayout(new java.awt.GridLayout(2,1));

		javax.swing.JLabel l1,l2,l3;

		l1 = new javax.swing.JLabel("check out color");

		l2 = new javax.swing.JLabel("subtitle");

		l3 = new javax.swing.JLabel("write");


        l1.setForeground(java.awt.Color.RED);
        
        l1.setBackground(java.awt.Color.BLACK);
        
        l1.setOpaque(true);
        
        l2.setForeground(java.awt.Color.WHITE);
        
        l2.setBackground(java.awt.Color.decode("#00C6FF"));
        
        l2.setOpaque(true);

		add(l1);

		add(l2);

		add(l3);
	}
	public static void main(String args[])
	{
		new Color().setVisible(true);
	}
}
/*
Compiled from "Color.java"
public class java.awt.Color implements java.awt.Paint,java.io.Serializable {
  public static final java.awt.Color white;
  public static final java.awt.Color WHITE;
  public static final java.awt.Color lightGray;
  public static final java.awt.Color LIGHT_GRAY;
  public static final java.awt.Color gray;
  public static final java.awt.Color GRAY;
  public static final java.awt.Color darkGray;
  public static final java.awt.Color DARK_GRAY;
  public static final java.awt.Color black;
  public static final java.awt.Color BLACK;
  public static final java.awt.Color red;
  public static final java.awt.Color RED;
  public static final java.awt.Color pink;
  public static final java.awt.Color PINK;
  public static final java.awt.Color orange;
  public static final java.awt.Color ORANGE;
  public static final java.awt.Color yellow;
  public static final java.awt.Color YELLOW;
  public static final java.awt.Color green;
  public static final java.awt.Color GREEN;
  public static final java.awt.Color magenta;
  public static final java.awt.Color MAGENTA;
  public static final java.awt.Color cyan;
  public static final java.awt.Color CYAN;
  public static final java.awt.Color blue;
  public static final java.awt.Color BLUE;
  int value;
  public java.awt.Color(int, int, int);
  public java.awt.Color(int, int, int, int);
  public java.awt.Color(int);
  public java.awt.Color(int, boolean);
  public java.awt.Color(float, float, float);
  public java.awt.Color(float, float, float, float);
  public java.awt.Color(java.awt.color.ColorSpace, float[], float);
  public int getRed();
  public int getGreen();
  public int getBlue();
  public int getAlpha();
  public int getRGB();
  public java.awt.Color brighter();
  public java.awt.Color darker();
  public int hashCode();
  public boolean equals(java.lang.Object);
  public java.lang.String toString();
  public static java.awt.Color decode(java.lang.String) throws java.lang.NumberFormatException;
  public static java.awt.Color getColor(java.lang.String);
  public static java.awt.Color getColor(java.lang.String, java.awt.Color);
  public static java.awt.Color getColor(java.lang.String, int);
  public static int HSBtoRGB(float, float, float);
  public static float[] RGBtoHSB(int, int, int, float[]);
  public static java.awt.Color getHSBColor(float, float, float);
  public float[] getRGBComponents(float[]);
  public float[] getRGBColorComponents(float[]);
  public float[] getComponents(float[]);
  public float[] getColorComponents(float[]);
  public float[] getComponents(java.awt.color.ColorSpace, float[]);
  public float[] getColorComponents(java.awt.color.ColorSpace, float[]);
  public java.awt.color.ColorSpace getColorSpace();
  public synchronized java.awt.PaintContext createContext(java.awt.image.ColorModel, java.awt.Rectangle, java.awt.geom.Rectangle2D, java.awt.geom.AffineTransform, java.awt.RenderingHints);
  public int getTransparency();
  static {};
}
*/

