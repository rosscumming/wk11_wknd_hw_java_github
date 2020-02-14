import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private String repositoryType;
    private ArrayList<Commit> commits;
    private ArrayList<Repository> repositories;

    public Repository(String name, String description, String repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
        this.repositories = new ArrayList<Repository>();
    }

    public int repositoryCount(){
        return this.repositories.size();
    }

    public void addRepositoryToCollection(Repository repository){
        this.repositories.add(repository);
    }

}
