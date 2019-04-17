import javax.swing.UIManager;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.xl.util.UIUtil;
import com.xl.window.JSONFormatWindow;


public class JsonFormatMain {
	

	
	public static void main(String[] args) {
		UIUtil.setWindowsStyle();
	JSONFormatWindow	 window= new JSONFormatWindow();
		window.setVisible(true);
	}
}
