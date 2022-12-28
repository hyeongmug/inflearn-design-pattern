package iterator._01_before;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private LocalDateTime createDateTime;

    public Post(String title) {

        this.title = title;
        this.setCreateDateTime(LocalDateTime.now());
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }
}
