import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;



    @Before
    public void before(){
        this.gitHubAccount = new GitHubAccount("Angelina101", "Angelina", "Free");
    }

    @Test
    public void canGetUsername(){
        assertEquals("Angelina101", gitHubAccount.getUsername() );
    }

    @Test
    public void canGetName(){
        assertEquals("Angelina", gitHubAccount.getName() );
    }

    @Test
    public void canGetAccountType(){
        assertEquals("Free", gitHubAccount.getAccountType() );
    }


}
