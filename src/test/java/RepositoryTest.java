import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;
    private Commit commit;
    private Commit commit2;


    @Before
    public void before(){
        repository = new Repository();
        commit = new Commit("I've committed", 1);
        commit2 = new Commit("I've committed again!", 2);

    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, repository.repositoryCount());
    }

    @Test
    public void canAddCommitToRepository(){
        repository.addCommitToRepository(commit);
        assertEquals(1, repository.repositoryCount());
    }



}
