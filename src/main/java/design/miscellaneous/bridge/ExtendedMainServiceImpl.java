package design.miscellaneous.bridge;

public class ExtendedMainServiceImpl extends MainService implements ExtendedMainService {

    public ExtendedMainServiceImpl(SupportService supportService) {
        super(supportService);
    }

    public void doExtendedStuff() {
        // extended stuff
        doMainStuff();
    }
}
