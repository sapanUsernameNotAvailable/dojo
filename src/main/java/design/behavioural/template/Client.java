package design.behavioural.template;

public class Client {
    Template template = new TemplateImplemented();
    public void doStuff() {
        template.doStuff(); // code to interface.
    }
}
