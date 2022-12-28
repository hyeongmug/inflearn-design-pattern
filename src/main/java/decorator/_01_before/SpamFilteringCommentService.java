package decorator._01_before;

import decorator._02_after.CommentService;

public class SpamFilteringCommentService extends CommonService {
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http://");
    }
}
