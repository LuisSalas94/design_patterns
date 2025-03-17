package org.fernando.creational.factory.demo2;

// Creator Class
public abstract class Logistics {
    protected abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }


}
