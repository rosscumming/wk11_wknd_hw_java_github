import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("I've commited :)", 1);
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("I've commited :)", commit.getDescription());
    }

}
