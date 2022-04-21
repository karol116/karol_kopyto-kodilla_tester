public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000, 600, 2019);
        Notebook heavyNotebook = new Notebook("2000g", 1500, 2000, 2021);
        Notebook oldNotebook = new Notebook("1200g", 500, 1200, 2015);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price + "$");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}