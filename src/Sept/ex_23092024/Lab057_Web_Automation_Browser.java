package Sept.ex_23092024;

public class Lab057_Web_Automation_Browser {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run in the code.
        // Chrome - Execute Chrome
        // Firefox - Execute Firefox
        // Edge - Execute Edge
        // If we put starting browser as "Opera" then default value will display
        // As "Opera" browser not mentioned in the cases

        String browser = "opera";
        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome Browser");
                // Further Code to Start the Chrome
                // Webdriver driver = new chrome(); //Selenium Code
                break;
            case "Firefox":
                System.out.println("Starting the Firefox Browser");
                // Further Code to Start the Chrome
                // Webdriver driver = new Firefox(); //Selenium Code
                break;
            case "edge":
                System.out.println("Starting the Firefox Browser");
                // Further Code to Start the Chrome
                // Webdriver driver = new edge(); //Selenium Code
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
