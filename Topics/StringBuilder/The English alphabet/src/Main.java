class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder ABC = new StringBuilder("A");
        for (char ch = 'B'; ch <= 'Z'; ch++){
            ABC.append(" " + ch);
        }
        return ABC;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}