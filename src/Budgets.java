public class Budgets extends Projects {
    private Integer bPerson; // budget per worker in $
    private Integer bHardSoftware; // budget for hardware and software
    private Integer bTesting; // budget for project testing
    private Integer bMarketing; // budget for marketing

    public Budgets(Integer bPerson, Integer bHardSoftware, Integer bTesting, Integer bMarketing) {
        super("Contabilitate", "Gestionarea bugetelor", 8, 180);
        this.bPerson = bPerson;
        this.bHardSoftware = bHardSoftware;
        this.bTesting = bTesting;
        this.bMarketing = bMarketing;
    }

    @Override
    public Integer totalWorkedHours() {
        return (getNumberOfWorkers() * getWorkedHours());
    }

    public Integer getbPerson() {
        return bPerson;
    }

    public Integer getbHardSoftware() {
        return bHardSoftware;
    }

    public Integer getbTesting() {
        return bTesting;
    }

    public Integer getbMarketing() {
        return bMarketing;
    }

    public void setbPerson(Integer bPerson) {
        this.bPerson = bPerson;
    }

    public void setbHardSoftware(Integer bHardSoftware) {
        this.bHardSoftware = bHardSoftware;
    }

    public void setbTesting(Integer bTesting) {
        this.bTesting = bTesting;
    }

    public void setbMarketing(Integer bTesting) {
        this.bMarketing = bMarketing;
    }
}