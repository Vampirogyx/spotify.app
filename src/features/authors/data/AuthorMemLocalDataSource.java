package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {


    public ArrayList<Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource(AuthorApiLocalDataSource authorApiLocalDataSource){
        iniData();
    }

    private void iniData(){
        Author author1 = new Author("1", "SFDK", "01-01-1970", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "Kaze", "01-01-1970", "Española");
        authorsMemStorage.add(author2);

        Author author3 = new Author("3", "Pertegasss", "26-03-2004", "Española");
        authorsMemStorage.add(author3);
    }

    public ArrayList<Author> findAll(){
        return authorsMemStorage;
    }


}
