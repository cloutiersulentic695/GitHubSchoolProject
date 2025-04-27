public class Project {
    private String name;
    private int id;

    public Project(String name) {
        this.name = name;
        this.id = Math.random() * 10000; // Generate a random integer between 0 and 9999
    }

    public void updateName(String newName) {
        if (name.equals(newName)) return; // If the name is already in use, do nothing

        String newID = id + 1;
        this.name = newName;
        this.id = newID;
    }

    public void display() {
        System.out.println("Project: " + name);
        System.out.println("ID: " + id);
    }
}
