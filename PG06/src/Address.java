public class Address {

    public String createAddress(String country){
        return String.format("Country:%s", country);
    }

    public String createAddress(String country, int postalCode){
        return String.format("Country:%s, postal code:%d", country, postalCode);
    }

    public String createAddress(String country, int postalCode, String streetName){
        return String.format("Country:%s, postal code:%d, street name:%s", country, postalCode, streetName);
    }

    public String createAddress(String country, int postalCode, String streetName, int apartmentNumber){
        return String.format("Country:%s, postal code:%d, street name:%s, apartment number:%d",
                country, postalCode, streetName, apartmentNumber);
    }
}