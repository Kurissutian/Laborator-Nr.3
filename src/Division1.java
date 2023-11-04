public class Division1 extends Brand1 {
    private Integer numberOfEmployers;

    public Division1(String name, Integer foundationYear, Integer numberOfEmployers) {
        super(name, foundationYear);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }
}