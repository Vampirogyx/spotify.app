package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorApiLocalDataSource {


    public ArrayList<Author> authorsApiStorage = new ArrayList<>();

    public AuthorApiLocalDataSource(){
        iniData();
    }

    private void iniData(){
        Author author1 = new Author("1", "ApiSFDK", "01-01-1970", "Española");
        authorsApiStorage.add(author1);

        Author author2 = new Author("2", "ApiKaze", "01-01-1970", "Española");
        authorsApiStorage.add(author2);

        Author author3 = new Author("3", "ApiPertegasss", "26-03-2004", "Española");
        authorsApiStorage.add(author3);
    }

    public ArrayList<Author> findAll(){
        return authorsApiStorage;
    }


}
