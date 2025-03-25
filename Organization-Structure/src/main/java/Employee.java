public class Employee extends Component{
    private int salary;
    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData() {

    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
