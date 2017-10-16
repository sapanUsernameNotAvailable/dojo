package design.miscellaneous.bridge;

public class Client {

    ExtendedMainService service = new ExtendedMainServiceImpl(new SupportServiceImpl());

    public void doStuff() {
        service.doExtendedStuff(); // code to interface
    }
}
