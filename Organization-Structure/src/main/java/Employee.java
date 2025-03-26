public class Employee extends Component{
    private float salary;
    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData() {
        System.out.println("<employee>");
        System.out.println("<name>" + name + "</name>");
        System.out.println("<salary>"+salary+"</salary>");
        System.out.println("</employee>");
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException("Not supported in Employee class.");
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException("Not supported in Employee class.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported in Employee class.");
    }
    public float getSalary() {
        return salary;
    }
}
