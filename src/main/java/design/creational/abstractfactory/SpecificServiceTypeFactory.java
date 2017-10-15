package design.creational.abstractfactory;

public class SpecificServiceTypeFactory extends ServiceFactory{
    @Override
    public Service getService() {
        return new SpecificServiceType();
    }
}
