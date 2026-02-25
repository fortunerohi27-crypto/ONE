public class Student{
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + " years old and I study " + course + ".");
    }
    public static void main(String[] args) {
        Student myObj = new Student("Fortune", 20, "Software engineer");
        Student myObj2 = new Student("Rohi", 18, "Robotics");

        myObj.introduce();
        myObj2.introduce();
    }
}