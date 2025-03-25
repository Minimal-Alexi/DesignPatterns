import java.util.ArrayList;
import java.util.List;

public class Department extends Component{
    private List<Component> components;
    public Department(String name){
        super(name);
        components = new ArrayList<Component>();
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
