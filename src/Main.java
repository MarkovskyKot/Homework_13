public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев ", "Толстой ");
        Author author2 = new Author("Dale ", "Carnegie ");
        Book book1 = new Book("Собрание сочинений в 14 томах",
                author1, 1951);
        Book book2 = new Book("How to Stop Worrying and Start Living",
                author2, 1948);
        System.out.println(book2.getBookName());
        System.out.println("Author - " + book2.getAuthor().getFirstName()+book2.getAuthor().getLastName());
        System.out.println("Publishing year - " + book2.getPublishingYear());
        System.out.println(book1.getBookName());
        System.out.println("Автор - " + book1.getAuthor().getFirstName()+book1.getAuthor().getLastName());
        System.out.println("Год издания - " + book1.getPublishingYear());
        book1.setPublishingYear(1953);
        System.out.println("Переиздание - " + book1.getPublishingYear());
    }
}