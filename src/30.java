public class SchoolProjectDemo {
    public static void main(String[] args) {
        // Example of accessing student data from a database
        List<Student> students = new ArrayList<>();
        
        Student s1 = new Student();
        s1.setName("Alice");
        s1.setAge(20);
        s1.setEmail("alice@example.com");
        students.add(s1);
        
        Student s2 = new Student();
        s2.setName("Bob");
        s2.setAge(18);
        s2.setEmail("bob@example.com");
        students.add(s2);
        
        // Example of using a for loop to print out all the students
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getEmail());
        }
    }
}

class Student {
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
