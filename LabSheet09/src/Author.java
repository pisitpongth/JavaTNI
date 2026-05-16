public class Author {
    private String name;
    private String nationality;
    private int birthyear;

    public Author(String name, String nationality, int birthyear) {
        this.name = name;
        this.nationality = nationality;
        this.birthyear = birthyear;
    }

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.birthyear = 0;
    }

    public Author(String name) {
        this.name = name;
        this.nationality = "";
        this.birthyear = 0;
    }

    public Author() {
        this.name = "";
        this.nationality = "";
        this.birthyear = 0;
    }

    public String getName() {
        return name;
    }

    public String showAuthorInfo() {
        if (this.nationality.isEmpty()) {
            return getName();
        } else if (this.birthyear == 0) {
            return getName() + " (" + this.nationality + ")";
        }
        return getName() + " (" + this.nationality + ", born " + this.birthyear + ")";
    }
}
