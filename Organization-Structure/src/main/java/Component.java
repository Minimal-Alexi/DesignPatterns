import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void printData();

    protected abstract void printData(XMLStreamWriter writer) throws XMLStreamException;

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract Component getChild(int index);
}
