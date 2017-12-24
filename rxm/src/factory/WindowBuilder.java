package factory;

public class WindowBuilder {
	  public static MainWindow1 createWindow(){
		    MainWindow1 window = new MainWindow1();
		    Menu menu = new Menu();
		    ToolBar toolBar = new ToolBar();
		    window.setMenu(menu);
		    window.setToolBar(toolBar);
		    return window;
		  }
}
