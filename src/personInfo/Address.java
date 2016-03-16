package personInfo;

public class Address {
    private final City city;
    private final State state;
    private final Country country;

    @Override
    public String toString() {
        return String.format("%s, %s\n%s",city,state,country);
    }

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isNationality(Country otherCountry) {
        return country.equals(otherCountry);
    }
}
