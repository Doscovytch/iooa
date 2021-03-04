package week2.uitwerkingen.opdracht2_Personen;


public class Student implements Persoon{
    public Student(String naam, int leeftijd, int lengte, int gewicht) {
    }
    @Override
    public void werkt() {
        System.out.println("Student is aan het studeren");
    }
}

