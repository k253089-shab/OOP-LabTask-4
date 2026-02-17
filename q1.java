import java.util.Scanner;

class Box{
    private double width;
    private double height;

    public void print(){
        System.out.println("Width: " + width + "\nHeight: " + height);
    }

    public Box(double width, double height){
        if(width > 0 && height > 0){
            this.width=width;
            this.height=height;
        } else{
            System.out.println("Error: width and height must be positive");
        }
    }

    public Box(double height){
        this.height=height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        this.width = sc.nextDouble();
    }

    public Box(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        this.width = sc.nextDouble();
        System.out.println("Enter height: ");
        this.height = sc.nextDouble();
    }
}
