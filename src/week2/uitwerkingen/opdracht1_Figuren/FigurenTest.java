//package week2.uitwerkingen.opdracht1_Figuren;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class FigurenTest {
//
//    // Tests constructors and Polymorphism
//    @Test
//    public void testConstructors() {
//        try {
//            Figuur driehoek = new Driehoek();
//            Figuur customDriehoek = new Driehoek(1.2, 2.3, 3.4, "groen",
//                    "groen");
//
//            Assert.assertEquals(driehoek.berekenOmtrek(), 3.0, 0.0);
//            Assert.assertNotEquals(customDriehoek.berekenOmtrek(), 3.0);
//
//        } catch (Exception e) {
//            System.out.println("Constructor faulty implementation");
//            System.out.println("Are you using polymorphism?");
//        }
//    }
//
//    @Test
//    public void testToString() {
//        Vierhoek vierhoek = new Vierhoek(1.2, 2.3, "groen",
//                "groen");
//
//        Assert.assertEquals(vierhoek.toString(), "De zijden hebben elk een lengte van " + 1.2 + " en " + 2.3 +
//                ", die ervoor zorgen dat het vierkant een omtrek van " + 7.0 + " heeft.");
//        Assert.assertNotEquals(vierhoek.toString(), "De zijden hebben elk een lengte van " + 1.0 + " en " + 1.0 +
//                ", die ervoor zorgen dat het vierkant een omtrek van " + 4.0 + " heeft.");
//    }
//
//    @Test
//    public void testBerekenOmtrek() {
//        Vierkant vierkant = new Vierkant(1.5, ":)", ":(");
//
//        Assert.assertEquals(vierkant.berekenOmtrek(), 6.0, 0.0);
//        Assert.assertNotEquals(vierkant.berekenOmtrek(), 4.0);
//    }
//
//    @Test
//    public void testGettersAndSetters() {
//        Vierkant vierkant = new Vierkant();
//
//        Assert.assertEquals(vierkant.getLengteZijde1(), 1.0, 0.0);
//
//        vierkant.setLengteZijde1(3.0);
//
//        Assert.assertNotEquals(vierkant.getLengteZijde1(), 1.0);
//
//    }
//}


