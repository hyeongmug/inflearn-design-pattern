package state._01_before;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return this.privateCourses.contains(onlineCourse);
    }

    public String getName() {
        return name;
    }
}
