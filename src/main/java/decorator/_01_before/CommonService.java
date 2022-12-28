package decorator._01_before;

import java.util.ArrayList;
import java.util.List;

public class CommonService {

    private List<String> comments = new ArrayList();

    public void writeComment(String comment) {
        System.out.println(comment);
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}
