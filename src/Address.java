public class Address {
    String[] address;

    public Address(String[] address) {
        this.address = address;
    }

    public String getCountry() {
        return address[address.length-1];
    }
}
