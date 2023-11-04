public abstract class Projects {
    private String name;
    private String purpose; // Goal (scop)
    private Integer numberOfWorkers; // number of workers responsible for the project budget, etc.
    private Integer workedHours; // number of hours work by person
    public Projects(String name, String purpose, Integer numberOfWorkers, Integer workedHours) {
        this.name = name;
        this.purpose = purpose;
        this.numberOfWorkers = numberOfWorkers;
        this.workedHours = workedHours;
    }

    public abstract Integer totalWorkedHours();

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }
}