class Problem {
    public static void main(String[] args) {
        char operation = args[0].charAt(0);
        int fstNumber = Integer.parseInt(args[1]);
        int sndNumber = Integer.parseInt(args[2]);

        switch (operation){
            case '+':
                int result = fstNumber + sndNumber;
                System.out.println(result);
                break;
            case '-':
                  result = fstNumber - sndNumber;
                System.out.println(result);
                break;
            case '*':
                result = fstNumber * sndNumber;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}