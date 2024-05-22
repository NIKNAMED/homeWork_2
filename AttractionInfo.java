public class AttractionInfo {
    public static void main(String[] args) {
        Park attraction1 = new Park("Карусель", "с 10:00 до 18:00", 150);
        Park attraction2 = new Park("Горки", "с 11:00 до 20:00", 200);
        Park attraction3 = new Park("Колесо обозрения", "с 12:00 до 21:00", 250);

        attraction1.displayAttractionInfo();
        attraction2.displayAttractionInfo();
        attraction3.displayAttractionInfo();
    }
}