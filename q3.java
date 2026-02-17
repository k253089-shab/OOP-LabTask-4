import java.util.Scanner;

class ProgrammingLanguage{
    private String language;

    public ProgrammingLanguage(){
        this.language="JAVA";
    }

    public ProgrammingLanguage(String language){
        this.language=language;
    }

    public void display(){
        System.out.println("Language: " + this.language);
    }
}

public class Main
{
	public static void main(String[] args) {
		ProgrammingLanguage p1 = new ProgrammingLanguage();
        ProgrammingLanguage p2 = new ProgrammingLanguage("C");

        p1.display();
        p2.display();
	}
}
