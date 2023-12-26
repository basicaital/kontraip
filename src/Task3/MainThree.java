package Task3;

public class MainThree {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Братья Карамазовы", "Ф.М.Достоевский", 1880);
        Book book2 = new Book("Кровавый Меридиан", "Кормак Маккарти", 1985);

        library.addBooks(book1);
        library.addBooks(book2);

        System.out.println("На полке лежат: ");
        library.showLib();

        library.removeBook(book1);
        System.out.println("После удаления книги: ");
        library.showLib();
    }
}
