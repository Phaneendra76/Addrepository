package X_path;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_Setter_Methods {
    private String url;
    private String title;

    public Getter_Setter_Methods(String url) 
    {
        this.url = url;
        this.title = null; // Initial title set to null
    }

    // Getter method for the title
    public String getTitle() {
        return title;
    }

    // Setter method for the title
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    // Method to open the webpage and set the title
    public void openPage() 
    {
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        this.title = driver.getTitle(); // Set the initial title

//        driver.quit();
    }

    // Example usage
    public static void main(String[] args) {
        String url = "https://www.facebook.com/login/";
        Getter_Setter_Methods webPage = new Getter_Setter_Methods(url);

        webPage.openPage();
        System.out.println("Original Title: " + webPage.getTitle());

        // Set a new title using the setter method
        
        webPage.setTitle("Ammi");
        System.out.println("Updated Title: " + webPage.getTitle());
    }
}


