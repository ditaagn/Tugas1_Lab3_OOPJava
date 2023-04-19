public class Main {
    public static void main(String[] args){
        //using overloading constructor
        Shopping shopping1 = new Shopping();
        Shopping shopping2 = new Shopping("Dita",1000000);

        //using overloading method
        shopping1.rincian();
        shopping2.rincian(0.1);
    }
}
