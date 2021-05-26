class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    Phone(String ownerName, String number){
        this.ownerName = ownerName;
        this.number = number;
    }
    Phone(String ownerName, String countryCode, String cityCod, String number){
        this.ownerName = ownerName;
        this.countryCode = countryCode;
        this.cityCode = cityCod;
        this.number= number;
    }
}