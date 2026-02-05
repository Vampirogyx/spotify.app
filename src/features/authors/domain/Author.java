package features.authors.domain;

public class Author {

    private String id;
    private String name;
    private String dateBorn;
    private String nationality;


    public Author(String id, String name, String dateBorn, String nationality) {
        this.id = id;
        this.name = name;
        this.dateBorn = dateBorn;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
