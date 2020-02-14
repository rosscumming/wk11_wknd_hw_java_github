import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("I've committed :)", 1);
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("I've committed :)", commit.getDescription());
    }

    @Test
    public void canGetUniqueId() {
        assertEquals(1, commit.getUniqueId());
    }

    @Test
    public void canAddCommitToRepository(){
        commit.addCommitToRepository(commit);
        assertEquals(1, commit.commitCount());
    }


}
