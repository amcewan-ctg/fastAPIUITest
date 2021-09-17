import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTodo {

    @FindBy(id = "contentInput")
    private WebElement addTodoButton;

    public void addTodo(String todo){
        addTodoButton.sendKeys(todo);
        addTodoButton.sendKeys(Keys.RETURN);
    }
    
}
