import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("http://localhost:8000/");
        String title1 = driver.getTitle();
        System.out.println(title1);

        CreateTodo createTodo = new CreateTodo();
        PageFactory.initElements(driver, createTodo);

        createTodo.addTodo("Test todo555");


        EditTodo editTodo = new EditTodo();
        PageFactory.initElements(driver, editTodo);

        editTodo.editTodo("Delete todo");
        
        //driver.quit();
   
    }
}
