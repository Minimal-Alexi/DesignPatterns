import java.util.ArrayList;
import java.util.List;

public class Department extends Component{
    private List<Component> children;
    public Department(String name){
        super(name);
        children = new ArrayList<Component>();
    }

    @Override
    public void printData() {

    }

    @Override
    public void addComponent(Component component) {
        children.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
    public float getTotalSalary(){
        float total = 0;
        for(Component component : children)
        {
            if(component instanceof Department)
            {
                total += ((Department)component).getTotalSalary();
            }
            else
            {
                total += ((Employee)component).getSalary();
            }
        }
        return total;
    }

}
