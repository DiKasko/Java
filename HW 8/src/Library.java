public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Tolstoy", "Alexey Nikolaevich");
        Author author2 = new Author("Nosov", "Nikolai Nikolaevich");

        Book book1 = new Book(" Kolobok ", author1, 1965);
        Book book2 = new Book(" Adventures of Dunno and his friends", author2, 1953);


        System.out.println(" Книга " + "                 " + book1.getTitle());
        System.out.println(" Фамилия автора " + "         " + book1.getAuthor().getFirstName());
        System.out.println(" Имя автора "  + "             " + book1.getAuthor().getLastName());
        System.out.println(" Год публикации " + "         " + book1.getPublishingYear());
        System.out.println(" Книга " + "                 " + book2.getTitle());
        System.out.println(" Фамилия автора " + "         " + book2.getAuthor().getFirstName());
        System.out.println(" Имя автора "  + "             " + book2.getAuthor().getLastName());
        System.out.println(" Год публикации " + "         " + book2.getPublishingYear());
    }
}