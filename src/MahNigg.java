public class MahNigg {


    public static void main(String[] args) {

        Dog vuffelivov = new Dog();
        Dog kamphund = new Dog();



        System.out.println(vuffelivov.getAntalBen());

        vuffelivov.setAntalBen(2);

        System.out.println(vuffelivov.getAntalBen());

        System.out.println("Navn = "+vuffelivov.getNavn() +" "+"breed = "+ vuffelivov.getBreed());

        vuffelivov.setBreed("Schnauser");
        vuffelivov.setNavn("Vuffelivov");

        System.out.println("Navn ="+vuffelivov.getNavn() +" "+"breed = "+ vuffelivov.getBreed());
    }
}
