package week2.opdracht5_Voetblplaatjes;

public class Plaatjesverzamelactie {
    public static void main(String[] args) {

        // idk how to do this
        Voetbalplaatjesalbum hell = new Voetbalplaatjesalbum(
                new Club[]{
                        new Club(
                                "FC_bs",
                                "",
                                new SpelerKaart[]{
                                        new SpelerKaart(
                                                1,
                                                new Foto("pls no", "", "dir"),
                                                "Henk",
                                                "Gert",
                                                12,
                                                "",
                                                "")

                                },
                                new ElftalKaart[]{

                                },
                                new Coach[]{

                                },
                                new Stadion(
                                        2,
                                        new Foto(
                                                "hell",
                                                "foto",
                                                "dir"),
                                        "hellStadion",
                                        3),
                                new Foto(
                                        "stop",
                                        "foto",
                                        "dir"))
                }
        );

        System.out.println(hell.getClubs()[0].getSpelers()[0].getAchternaam());
    }
}
