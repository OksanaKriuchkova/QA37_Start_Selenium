import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/index.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));

        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement element1 = wd.findElement(By.cssSelector("a"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        int i = list.size();
        WebElement el4 = list.get(2);

        //by class
        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute
        WebElement divElm = wd.findElement(By.cssSelector("[class='container']"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder=\"Type your name\"]"));
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder=\'Type your name\']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement inputS1 = wd.findElement(By.name("surename"));

        //by linkText By.partialLinkText
        wd.findElement(By.linkText("Item 1"));
        wd.findElement(By.partialLinkText("m 1"));

        WebElement inp = wd.findElement(By.cssSelector("[placeholder='Type your name']"));

        //start
        wd.findElement(By.cssSelector("[placeholder ^='Type']"));
        //end
        wd.findElement(By.cssSelector("[placeholder $='name']"));
        //contains
        wd.findElement(By.cssSelector("[placeholder *='your']"));

    }
}
