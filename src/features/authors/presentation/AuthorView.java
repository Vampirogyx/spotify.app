package features.authors.presentation;

import features.authors.data.AuthorApiLocalDataSource;
import features.authors.data.AuthorDataRepository;
import features.authors.data.AuthorMemLocalDataSource;
import features.authors.domain.Author;
import features.authors.domain.AuthorRepository;
import features.authors.domain.GetAuthorUseCase;

import java.util.ArrayList;
import java.util.List;

public class AuthorView {

    public static void printAuthors(){
        GetAuthorUseCase getAuthorUseCase = new GetAuthorUseCase(new AuthorDataRepository(new AuthorMemLocalDataSource(new AuthorApiLocalDataSource())));
        ArrayList<Author> authorList = getAuthorUseCase.execute();

        System.out.println(authorList);
    }
}
