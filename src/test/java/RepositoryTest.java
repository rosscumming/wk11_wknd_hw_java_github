import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository1;
    private Commit commit;
    private Commit commit2;


    @Before
    public void before(){
        this.repository1 = new Repository("my first repo", "an upload to github, wow", "public");
        this.commit = new Commit("I've committed", 1);
        this.commit2 = new Commit("I've committed again!", 2);

    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, repository1.repositoryCount());
    }

    @Test
    public void canAddRepositoryToCollection(){
        repository1.addRepositoryToCollection(repository1);
        assertEquals(1, repository1.repositoryCount());

    }



}
