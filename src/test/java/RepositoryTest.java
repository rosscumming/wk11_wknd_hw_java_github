import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;


    @Before
    public void before(){
        repository = new Repository();

    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, repository.repositoryCount());
    }



}
