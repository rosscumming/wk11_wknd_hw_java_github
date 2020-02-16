import com.sun.org.omg.CORBA.Repository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit1;
    private Commit commit2;
    private Commit commit3;

    @Before
    public void before(){

        commit1 = new Commit("I've committed :)", 1);
        commit2 = new Commit("I've committed again :)", 2);
        commit3 = new Commit("I've committed once again... :)", 3);
    }


    @Test
    public void canGetCommitDescription(){
        assertEquals("I've committed :)", commit1.getDescription());
    }

    @Test
    public void canGetUniqueId() {
        assertEquals(1, commit1.getUniqueId());
    }

    @Test
    public void addToCommitsArrayList(){
        commit1.addCommit(commit1);
        commit1.addCommit(commit2);
        commit1.addCommit(commit3);
        assertEquals(3, commit1.commitCount());

    }




}
