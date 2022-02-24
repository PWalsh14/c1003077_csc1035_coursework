

public class Sales {
    private int houseNumber;
    private String postcode;
    private int value;
    private String month;
    private int year;


    public Sales(int houseNumber, String postcode, int value, String month, int year) {
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.value = value;
        this.month = month;
        this.year = year;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getValue() {
        return value;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "houseNumber=" + houseNumber +
                ", postcode='" + postcode + '\'' +
                ", value=" + value +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}





