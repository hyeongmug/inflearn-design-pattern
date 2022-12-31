package state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student lim = new Student("lim");
        Student park = new Student("park");
        park.addPrivate(onlineCourse);

        onlineCourse.addStudent(lim);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", lim);

        onlineCourse.addStudent(park);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());

    }
}
