
class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        java.math.BigInteger bi = new java.math.BigInteger(number);
        return bi;
        //create BigInteger instance here

    }
}