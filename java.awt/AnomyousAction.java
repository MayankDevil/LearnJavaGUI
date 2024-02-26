/*
-	programmer:Mayank
-	./AnomyousAction.java
*/
class AnomyousAction extends java.awt.Frame
{
	AnomyousAction()
	{
		setSize(300,300);

		addWindowListener(new java.awt.event.WindowAdapter(){

			public void windowClosing(java.awt.event.WindowEvent window_event)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[])
	{
		new AnomyousAction().setVisible(true);
	}
}
/*
Compiled from "WindowAdapter.java"
public abstract class java.awt.event.WindowAdapter implements java.awt.event.WindowListener,java.awt.event.WindowStateListener,java.awt.event.WindowFocusListener {
  public java.awt.event.WindowAdapter();
  public void windowOpened(java.awt.event.WindowEvent);
  public void windowClosing(java.awt.event.WindowEvent);
  public void windowClosed(java.awt.event.WindowEvent);
  public void windowIconified(java.awt.event.WindowEvent);
  public void windowDeiconified(java.awt.event.WindowEvent);
  public void windowActivated(java.awt.event.WindowEvent);
  public void windowDeactivated(java.awt.event.WindowEvent);
  public void windowStateChanged(java.awt.event.WindowEvent);
  public void windowGainedFocus(java.awt.event.WindowEvent);
  public void windowLostFocus(java.awt.event.WindowEvent);
}
*/
