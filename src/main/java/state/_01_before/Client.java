package state._01_before;

public class Client {

    public static void main(String[] args) {
        Student student = new Student("lim");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student park = new Student("park");
        park.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(park);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());

    }
}
