package bedroom;

import bedroom.bedroom.Bed;
import bedroom.bedroom.Lamp;
import bedroom.bedroom.Wardrobe;
import bedroom.bedroom.Ceiling;
import bedroom.bedroom.Wall;
import bedroom.bedroom.Carpet;
import bedroom.bedroom.Bedroom;

public class Main {
    public static void main(String[] args) {
        // Wall nesnelerini oluşturuyoruz
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");

        // Ceiling nesnesini oluşturuyoruz
        Ceiling ceiling = new Ceiling(300,Ceiling.PaintColor.WHITE);

        // Bed nesnesini oluşturuyoruz
        Bed bed = new Bed("King", 2, 30, 2, 1);

        // Lamp nesnesini oluşturuyoruz
        Lamp lamp = new Lamp(Lamp.LampType.TABLE, true, 5);

        // Wardrobe nesnesini oluşturuyoruz
        Wardrobe wardrobe = new Wardrobe(150, 200, 100.5);

        // Carpet nesnesini oluşturuyoruz
        Carpet carpet = new Carpet(200, 300, Carpet.PaintColor.BLUE);

        // Bedroom nesnesini oluşturuyoruz
        Bedroom myBedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Bedroom bilgilerini ekrana basıyoruz
        System.out.println("Bedroom Name: " + myBedroom.getName());
        System.out.println("Bedroom Wall1: " + myBedroom.getWall1().getDirection());
        System.out.println("Bedroom Ceiling Height: " + myBedroom.getCeiling().getHeight() + " cm");
        System.out.println("Bedroom Bed Style: " + myBedroom.getBed().getStyle());
        System.out.println("Bedroom Lamp Battery: " + myBedroom.getLamp().isBattery());
        System.out.println("Bedroom Wardrobe Width: " + myBedroom.getWardrobe().getWidth() + " cm");
        System.out.println("Bedroom Carpet Color: " + myBedroom.getCarpet().getColor());

        // Bedroom metodlarını çağırıyoruz
        myBedroom.getBed().make();
        myBedroom.getLamp().turnOn();
        myBedroom.getWardrobe().add();
        myBedroom.getCarpet().lying();
    }
}
