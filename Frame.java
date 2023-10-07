/*
-	programmer:Mayank
-	./Frame.java
*/
class Test
{
	public static void main(String args[])
	{
		java.awt.Frame frame = new java.awt.Frame();

		frame.setTitle("Frame");
		frame.setSize(500,500);
		frame.setResizable(true);

//		frame.setWidth(300);
//		frame.setHeight(300);

//		frame.setUndecorated(true);

//		frame.setOpacity((float)0.8);

		frame.setVisible(true);
	}
}

/*Compiled from "Frame.java"
public class java.awt.Frame extends java.awt.Window implements java.awt.MenuContainer {
  public static final int DEFAULT_CURSOR;
  public static final int CROSSHAIR_CURSOR;
  public static final int TEXT_CURSOR;
  public static final int WAIT_CURSOR;
  public static final int SW_RESIZE_CURSOR;
  public static final int SE_RESIZE_CURSOR;
  public static final int NW_RESIZE_CURSOR;
  public static final int NE_RESIZE_CURSOR;
  public static final int N_RESIZE_CURSOR;
  public static final int S_RESIZE_CURSOR;
  public static final int W_RESIZE_CURSOR;
  public static final int E_RESIZE_CURSOR;
  public static final int HAND_CURSOR;
  public static final int MOVE_CURSOR;
  public static final int NORMAL;
  public static final int ICONIFIED;
  public static final int MAXIMIZED_HORIZ;
  public static final int MAXIMIZED_VERT;
  public static final int MAXIMIZED_BOTH;
  java.awt.Rectangle maximizedBounds;
  java.lang.String title;
  java.awt.MenuBar menuBar;
  boolean resizable;
  boolean undecorated;
  boolean mbManagement;
  java.util.Vector<java.awt.Window> ownedWindows;
  public java.awt.Frame() throws java.awt.HeadlessException;
  public java.awt.Frame(java.awt.GraphicsConfiguration);
  public java.awt.Frame(java.lang.String) throws java.awt.HeadlessException;
  public java.awt.Frame(java.lang.String, java.awt.GraphicsConfiguration);
  java.lang.String constructComponentName();
  public void addNotify();
  public java.lang.String getTitle();
  public void setTitle(java.lang.String);
  public java.awt.Image getIconImage();
  public void setIconImage(java.awt.Image);
  public java.awt.MenuBar getMenuBar();
  public void setMenuBar(java.awt.MenuBar);
  public boolean isResizable();
  public void setResizable(boolean);
  public synchronized void setState(int);
  public void setExtendedState(int);
  public synchronized int getState();
  public int getExtendedState();
  public void setMaximizedBounds(java.awt.Rectangle);
  public java.awt.Rectangle getMaximizedBounds();
  public void setUndecorated(boolean);
  public boolean isUndecorated();
  public void setOpacity(float);
  public void setShape(java.awt.Shape);
  public void setBackground(java.awt.Color);
  public void remove(java.awt.MenuComponent);
  public void removeNotify();
  void postProcessKeyEvent(java.awt.event.KeyEvent);
  protected java.lang.String paramString();
  public void setCursor(int);
  public int getCursorType();
  public static java.awt.Frame[] getFrames();
  public javax.accessibility.AccessibleContext getAccessibleContext();
  static {};
}
*/
