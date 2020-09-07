package corona.model;
public class DailyStatusModel {
    private String date;
    private int activeCases;
    private int totalRecovered;
    private int totalDeaths;
    private int newCases;
    private int totalCases;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getNewCases() {
        return newCases;
    }

    public void setNewCases(int newCases) {
        this.newCases = newCases;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    @Override
    public String toString() {
        return "DailyStatusModel{" +
                "date='" + date + '\'' +
                ", activeCases=" + activeCases +
                ", totalRecovered=" + totalRecovered +
                ", totalDeaths=" + totalDeaths +
                ", newCases=" + newCases +
                ", totalCases=" + totalCases +
                '}';
    }
}
