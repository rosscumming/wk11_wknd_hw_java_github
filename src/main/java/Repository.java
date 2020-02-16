import java.util.ArrayList;
import java.util.HashMap;


public class Repository {

    private String name;
    private String description;
    private String repositoryType;
    private ArrayList<Commit> commits;
    private HashMap <String,Repository> repositories;

    public Repository(String name, String description, String repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
        this.repositories = new HashMap<String, Repository>();
    }

    public int repositoryCount(){
        return this.repositories.size();
    }

    public void addRepositoryToCollection(Repository repository){
        this.repositories.put(this.name ,repository);
    }

    public String getRepoByName() {

        String keyToBeChecked = this.name;

        for(String key : repositories.keySet()){
            if (key.contains(keyToBeChecked)){
                return keyToBeChecked;
            } else {
                return key;
            }
        }
        return null;
    }

}
