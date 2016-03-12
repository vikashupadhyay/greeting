package personInfo;

public class Country {
    private String country;



    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country otherCountry = (Country) o;

        return country != null ? country.equals(otherCountry.country) : otherCountry.country == null;

    }

}
