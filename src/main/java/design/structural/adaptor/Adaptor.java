package design.structural.adaptor;

public class Adaptor implements RequiredService {
    AvailableService availableService = new AvailableServiceImpl();
    public void doStuff() {
        availableService.doLegacyStuff();
    }
}
