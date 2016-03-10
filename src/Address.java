public class Address {
    private final City city;
    private final State state;
    private final Country country;

    public Address(City city,State state,Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isOfCountry(Country otherCountry) {
        return country.equals(otherCountry);
    }
}
