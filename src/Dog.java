import javafx.scene.paint.Color;

public class Dog {

    // 1. Member Variables, Class variables, Klasse variabler, data members
    private int antalBen = 4;
    private String navn = "";
    private String breed = "";
    private int sizeKG  = 0;
    private Color color = Color.BEIGE;
    private int alder = 0;


    // 2. Counstructor

    public Dog(){
        System.out.println("et nyt hundobject er oprettet");
    }





    // 3. Metoder, methods, functions

    //public eat(){}
    //public sleep(){}
    //public run(){}
    //public sit(){}


    public int getAntalBen() {
        return antalBen;
    }

    public void setAntalBen(int antalBen) {
        this.antalBen = antalBen;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSizeKG() {
        return sizeKG;
    }

    public void setSizeKG(int sizeKG) {
        this.sizeKG = sizeKG;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
