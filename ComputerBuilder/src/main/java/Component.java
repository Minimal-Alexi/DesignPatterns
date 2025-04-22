public class Component {
    private String name;
    private int grade;
    public Component(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name + " (" + grade + ")";
    }
}
