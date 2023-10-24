package sitecore.sherpa.training;

public class Application {

    public Application()
    {
        System.out.println("Inside the application!");
    }

    public static void main (String[] args){
        System.out.println("Inside main!");
        Application app = new Application();
    }
}