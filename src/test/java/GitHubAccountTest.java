import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount1;
    private GitHubAccount gitHubAccount2;



    @Before
    public void before(){
        this.gitHubAccount1 = new GitHubAccount("Angelina101", "Angelina", "Free");
        this.gitHubAccount2 = new GitHubAccount("OnJetLag23", "Evan", "Pro");
    }

    @Test
    public void canGetUsername(){
        assertEquals("Angelina101", gitHubAccount1.getUsername());
    }

    @Test
    public void canGetName(){
        assertEquals("Angelina", gitHubAccount1.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals("Free", gitHubAccount1.getAccountType());
    }

    @Test
    public void canDowngradeAccountType(){
        gitHubAccount2.downgradeAcc(gitHubAccount2);
        assertEquals("Free", gitHubAccount2.getAccountType());
    }

    @Test
    public void canUpgradeAccountType(){
        gitHubAccount1.upgradeAcc(gitHubAccount1);
        assertEquals("Pro", gitHubAccount1.getAccountType());
    }


}
