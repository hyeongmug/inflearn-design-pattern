package prototype;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeMain {

        public static void main(String[] args) throws CloneNotSupportedException {
            GithubRepository repository = new GithubRepository();
            repository.setName("prototype");
            repository.setUser("java-design-patterns");

            GithubIssue githubIssue = new GithubIssue(repository);
            githubIssue.setId(1);
            githubIssue.setTitle("1주차 과제");

            String url = githubIssue.getUrl();
            System.out.println(url);

//            GithubIssue githubIssue2 = new GithubIssue(repository);
//            githubIssue2.setId(2);
//            githubIssue2.setTitle("2주차 과제");

            GithubIssue githubIssue2 = (GithubIssue) githubIssue.clone();
            System.out.println(githubIssue2.getUrl());

            System.out.println(githubIssue != githubIssue2);
            System.out.println(githubIssue.equals(githubIssue2));
            System.out.println(githubIssue.getClass() == githubIssue2.getClass());


            System.out.println("=============");
            System.out.println(githubIssue.getRepository() == githubIssue2.getRepository());
            System.out.println(githubIssue.getId() == githubIssue2.getId());
            System.out.println(githubIssue.getTitle() == githubIssue2.getTitle());
            System.out.println(githubIssue.getUrl() == githubIssue2.getUrl());


            // clone 활용
            ArrayList<GithubIssue> githubIssues = new ArrayList<>();
            ArrayList<GithubIssue> clone = (ArrayList<GithubIssue>) githubIssues.clone();

            List<GithubIssue> githubIssues1 = new ArrayList<>();
            List<GithubIssue> clone1 = (List<GithubIssue>) githubIssues.clone();



        }
}
