public class Book implements Comparable<Book> {
    private String name;
    private int pageNum;
    private String author;
    private String publishDate;

    public Book(String name, int pageNum, String author, String publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getPageNum() - o.getPageNum();
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int value) {
        this.pageNum = value;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String value) {
        this.author = value;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(String value) {
        this.publishDate = value;
    }
}
