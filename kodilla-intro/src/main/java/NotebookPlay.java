public class NotebookPlay {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(2000,800, 2013);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
    }
}
