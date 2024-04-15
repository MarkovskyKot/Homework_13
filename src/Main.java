public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев ", "Толстой ");
        Author author2 = new Author("Dale ", "Carnegie ");
        Author author3 = author1;
        Book book1 = new Book("Собрание сочинений в 14 томах",
                author1, 1951);
        Book book2 = new Book("How to Stop Worrying and Start Living",
                author2, 1948);
        Book book3 = book1;
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        book3.setPublishingYear(1953);
        System.out.println(book1.equals(book3));
        System.out.println(book1);
        System.out.println(book3);
    }
}