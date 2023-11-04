import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("___________________________________________________________________________________________");
        System.out.println("1. Mostenire simpla:");

        Division1 newDivision = new Division1("HR - Human Resources", 2005, 150);
        System.out.println("Subdiviziunea: " + newDivision.getName() +
                " este fondata in anul " + newDivision.getFondationYear() +
                " si numara " + newDivision.getNumberOfEmployers() + " de lucratori.");
        System.out.println("___________________________________________________________________________________________");
        System.out.println("2. Mostenire ierarhica + polimorfism de 2 tipuri + abstractizare:");
        System.out.println("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓↓ ↓ ↓ ↓ ↓ ↓↓ ↓ ↓ ↓ ↓");

        Projects budgets = new Budgets(1200, 20000, 5000, 15000);
        Projects documents = new Documents("Termeni si Conditii Generale", "Manual pentru Utilizatori", "Manual pentru Dezvoltatori", 2.0, 168);
        List<Projects> list = List.of(budgets, documents);

        for (Projects Projects: list) {
            System.out.println("___________________________________________________________________________________________");
            System.out.println("Nume: " + Projects.getName() + ", Scop: " + Projects.getPurpose());
            System.out.println("Ore lucrate in total: " + Projects.totalWorkedHours());
        }
    }
}