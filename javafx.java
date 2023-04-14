
package application; 
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.BorderPane; 
import javafx.stage.Stage; 
public class MenuExample extends Application { 
 public static void main(String[] args) { 
 launch(args); 
 } 
 
 public void start(Stage primaryStage) throws Exception { 
 BorderPane root = new BorderPane(); 
 Scene scene = new Scene(root,200,300); 
 MenuBar menubar = new MenuBar(); 
 Menu FileMenu = new Menu("File"); 
 MenuItem filemenu1=new MenuItem("new"); 
 MenuItem filemenu2=new MenuItem("Save"); 
 MenuItem filemenu3=new MenuItem("Exit"); 
 Menu EditMenu=new Menu("Edit"); 
 MenuItem EditMenu1=new MenuItem("Cut"); 
 MenuItem EditMenu2=new MenuItem("Copy"); 
 MenuItem EditMenu3=new MenuItem("Paste"); 
 EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3); 
 root.setTop(menubar); 
 FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3); 
 menubar.getMenus().addAll(FileMenu,EditMenu); 
 primaryStage.setScene(scene); 
 primaryStage.show(); 
 
 } 
}
