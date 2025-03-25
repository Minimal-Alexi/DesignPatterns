public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void printData();

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract Component getChild(int index);
}
