public class Park {
    private String attractionName;
    private String workingHours;
    private int cost;

    public Park(String attractionName, String workingHours, int cost) {
        this.attractionName = attractionName;
        this.workingHours = workingHours;
        this.cost = cost;
    }

    public void displayAttractionInfo() {
        System.out.println("Аттракцион: " + attractionName);
        System.out.println("Время работы: " + workingHours);
        System.out.println("Стоимость: " + cost);
    }
}