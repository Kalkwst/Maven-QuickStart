package sitecore.sherpa.training;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application()
    {
        System.out.println("Inside the application!");
    }

    public static void main (String[] args){
        System.out.println("Inside main!");
        Application app = new Application();

        int count = countWords("I have four words");
        System.out.println("Word count: "+count);
    }

    public int countWords(String words){
        String[] tokens = StringUtils.split(words, ' ');
        return (tokens == null) ? 0 : tokens.Length;
    }
}