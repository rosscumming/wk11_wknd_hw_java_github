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

    public String getUsername(){
        return this.username;
    }

    public String getName(){
        return this.name;
    }

    public String getAccountType(){
        return this.accountType;
    }


    public void downgradeAcc(GitHubAccount gitHubAccount2) {
        if (this.accountType == "Pro"){
            this.accountType = "Free";
        } else {
            this.accountType = "Pro";
        }
    }

    public void upgradeAcc(GitHubAccount gitHubAccount1) {
        if (this.accountType == "Free"){
            this.accountType = "Pro";
        } else {
            this.accountType = "Free";
        }
    }

    public int getCommitsInRepositoryCount(){
        return this.repositories.size();
    }
}
