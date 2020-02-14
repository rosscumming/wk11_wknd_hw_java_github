import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private String accountType;

    public GitHubAccount(String username, String name, String accountType) {
        this.username = username;
        this.name = name;
        this.repositories = new HashMap<String, Repository>();
        this.accountType = accountType;
    }


}
