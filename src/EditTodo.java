import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTodo {

    @FindBy(id = "todoItems")
    private WebElement editTodoButton;


    public void editTodo(String editedTodo){

        editTodoButton.click();
        editTodoButton.sendKeys(editedTodo);
        editTodoButton.sendKeys(Keys.RETURN);
    }

    
}
