import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private String repositoryType;
    private ArrayList<Commit> commits;

    public Repository(){
        commits = new ArrayList<Commit>();
    }

    public int repositoryCount(){
        return this.commits.size();
    }

    public void addCommitToRepository(Commit commit){
        this.commits.add(commit);
    }
}
