/*
-	programmer:Mayank
-	./Font.java
*/
class Font extends javax.swing.JFrame
{
	Font()
	{
	    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	    
		setSize(500,300);
		
		setLayout(new java.awt.GridLayout());

		javax.swing.JLabel l1,l2,l3;

		l1 = new javax.swing.JLabel("title");

		l2 = new javax.swing.JLabel("subtitle");

		l3 = new javax.swing.JLabel("write");

        l1.setFont(new java.awt.Font("arial",java.awt.Font.BOLD,50));

        l2.setFont(new java.awt.Font("arial",java.awt.Font.PLAIN,20));
        
        l3.setFont(new java.awt.Font("arial",java.awt.Font.ITALIC,14));

		add(l1);

		add(l2);

		add(l3);
	}
	public static void main(String args[])
	{
		new Font().setVisible(true);
	}
}
/*
Compiled from "Font.java"
public class java.awt.Font implements java.io.Serializable {
  public static final java.lang.String DIALOG;
  public static final java.lang.String DIALOG_INPUT;
  public static final java.lang.String SANS_SERIF;
  public static final java.lang.String SERIF;
  public static final java.lang.String MONOSPACED;
  public static final int PLAIN;
  public static final int BOLD;
  public static final int ITALIC;
  public static final int ROMAN_BASELINE;
  public static final int CENTER_BASELINE;
  public static final int HANGING_BASELINE;
  public static final int TRUETYPE_FONT;
  public static final int TYPE1_FONT;
  protected java.lang.String name;
  protected int style;
  protected int size;
  protected float pointSize;
  transient int hash;
  public static final int LAYOUT_LEFT_TO_RIGHT;
  public static final int LAYOUT_RIGHT_TO_LEFT;
  public static final int LAYOUT_NO_START_CONTEXT;
  public static final int LAYOUT_NO_LIMIT_CONTEXT;
  public java.awt.Font(java.lang.String, int, int);
  public java.awt.Font(java.util.Map<? extends java.text.AttributedCharacterIterator$Attribute, ?>);
  protected java.awt.Font(java.awt.Font);
  public static boolean textRequiresLayout(char[], int, int);
  public static java.awt.Font getFont(java.util.Map<? extends java.text.AttributedCharacterIterator$Attribute, ?>);
  public static java.awt.Font[] createFonts(java.io.InputStream) throws java.awt.FontFormatException, java.io.IOException;
  public static java.awt.Font[] createFonts(java.io.File) throws java.awt.FontFormatException, java.io.IOException;
  public static java.awt.Font createFont(int, java.io.InputStream) throws java.awt.FontFormatException, java.io.IOException;
  public static java.awt.Font createFont(int, java.io.File) throws java.awt.FontFormatException, java.io.IOException;
  public java.awt.geom.AffineTransform getTransform();
  public java.lang.String getFamily();
  final java.lang.String getFamily_NoClientCode();
  public java.lang.String getFamily(java.util.Locale);
  public java.lang.String getPSName();
  public java.lang.String getName();
  public java.lang.String getFontName();
  public java.lang.String getFontName(java.util.Locale);
  public int getStyle();
  public int getSize();
  public float getSize2D();
  public boolean isPlain();
  public boolean isBold();
  public boolean isItalic();
  public boolean isTransformed();
  public boolean hasLayoutAttributes();
  public static java.awt.Font getFont(java.lang.String);
  public static java.awt.Font decode(java.lang.String);
  public static java.awt.Font getFont(java.lang.String, java.awt.Font);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public java.lang.String toString();
  public int getNumGlyphs();
  public int getMissingGlyphCode();
  public byte getBaselineFor(char);
  public java.util.Map<java.awt.font.TextAttribute, ?> getAttributes();
  public java.text.AttributedCharacterIterator$Attribute[] getAvailableAttributes();
  public java.awt.Font deriveFont(int, float);
  public java.awt.Font deriveFont(int, java.awt.geom.AffineTransform);
  public java.awt.Font deriveFont(float);
  public java.awt.Font deriveFont(java.awt.geom.AffineTransform);
  public java.awt.Font deriveFont(int);
  public java.awt.Font deriveFont(java.util.Map<? extends java.text.AttributedCharacterIterator$Attribute, ?>);
  public boolean canDisplay(char);
  public boolean canDisplay(int);
  public int canDisplayUpTo(java.lang.String);
  public int canDisplayUpTo(char[], int, int);
  public int canDisplayUpTo(java.text.CharacterIterator, int, int);
  public float getItalicAngle();
  public boolean hasUniformLineMetrics();
  public java.awt.font.LineMetrics getLineMetrics(java.lang.String, java.awt.font.FontRenderContext);
  public java.awt.font.LineMetrics getLineMetrics(java.lang.String, int, int, java.awt.font.FontRenderContext);
  public java.awt.font.LineMetrics getLineMetrics(char[], int, int, java.awt.font.FontRenderContext);
  public java.awt.font.LineMetrics getLineMetrics(java.text.CharacterIterator, int, int, java.awt.font.FontRenderContext);
  public java.awt.geom.Rectangle2D getStringBounds(java.lang.String, java.awt.font.FontRenderContext);
  public java.awt.geom.Rectangle2D getStringBounds(java.lang.String, int, int, java.awt.font.FontRenderContext);
  public java.awt.geom.Rectangle2D getStringBounds(char[], int, int, java.awt.font.FontRenderContext);
  public java.awt.geom.Rectangle2D getStringBounds(java.text.CharacterIterator, int, int, java.awt.font.FontRenderContext);
  public java.awt.geom.Rectangle2D getMaxCharBounds(java.awt.font.FontRenderContext);
  public java.awt.font.GlyphVector createGlyphVector(java.awt.font.FontRenderContext, java.lang.String);
  public java.awt.font.GlyphVector createGlyphVector(java.awt.font.FontRenderContext, char[]);
  public java.awt.font.GlyphVector createGlyphVector(java.awt.font.FontRenderContext, java.text.CharacterIterator);
  public java.awt.font.GlyphVector createGlyphVector(java.awt.font.FontRenderContext, int[]);
  public java.awt.font.GlyphVector layoutGlyphVector(java.awt.font.FontRenderContext, char[], int, int, int);
  static {};
}
*/
