class Book {
    private String title;
    private Author Author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.Author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return Author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}
