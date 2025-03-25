import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Employee extends Component{
    private float salary;
    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;
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
        writer.writeStartElement("employee");
        writer.writeAttribute("name", name);
        writer.writeAttribute("salary", String.valueOf(salary));
        writer.writeEndElement();
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
