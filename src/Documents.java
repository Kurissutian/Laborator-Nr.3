public class Documents extends Projects {
    private String termsOfService;
    private String userManual;
    private String devManual;
    private Double yearOfWarranty;
    private Integer daysOff; // calculated in hours -> 1 day - 24 hours not worked

    public Documents (String termsOfService, String userManual, String devManual, Double yearOfWarranty, Integer daysOff) {
        super("Departamentul de Documentatie", "Managementul documentelor", 20, 180);
        this.termsOfService = termsOfService;
        this.userManual = userManual;
        this.devManual = devManual;
        this.yearOfWarranty = yearOfWarranty;
        this.daysOff = daysOff;
    }

    @Override
    public Integer totalWorkedHours() {
        return ((getNumberOfWorkers() * getWorkedHours()) - (getDaysOff()));
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public String getUserManual() {
        return userManual;
    }

    public String getDevManual() {
        return devManual;
    }

    public Double getYearOfWarranty() {
        return yearOfWarranty;
    }

    public Integer getDaysOff() {
        return daysOff;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public void setUserManual(String userManual) {
        this.userManual = userManual;
    }

    public void setDevManual(String devManual) {
        this.devManual = devManual;
    }

    public void setYearOfWarranty(Double yearOfWarranty) {
        this.yearOfWarranty = yearOfWarranty;
    }

    public void setDaysOff(Integer daysOff) {
        this.daysOff = daysOff;
    }
}