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
        System.out.println("<department>");
        System.out.println("<name>" + name + "</name>");
        System.out.println("<totalexpenses>"+getTotalSalary()+"</totalexpenses>");
        System.out.println("<children>");
        for(Component child : children){
            child.printData();
        }
        System.out.println("</children>");
        System.out.println("</department>");
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
