import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
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
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = null;
        try {
            writer = factory.createXMLStreamWriter(System.out, "UTF-8");
            writer.writeStartDocument("UTF-8", "1.0");
            printData(writer);
            writer.writeEndDocument();
            writer.flush();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

    }
    protected void printData(XMLStreamWriter writer) throws XMLStreamException {
        writer.writeStartElement("department");
        writer.writeAttribute("name", name);
        writer.writeAttribute("total expenses", Float.toString(getTotalSalary()));
        for(Component child : children)
        {
            child.printData();
        }
        writer.writeEndElement();
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
