package design.creational.builder;

public class Builder {

    int data;

    public Builder withProperty(int incomingData) {
        data = incomingData;
        return this;
    }

    public Service build() {
        return new Product(data);
    }
}
