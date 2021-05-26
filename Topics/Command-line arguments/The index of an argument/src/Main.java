class Problem {
    public static void main(String[] args) {
        boolean isFound = false;
        int index = 0;
        for (int i = 0; i < args.length; i++){
            if (args[i].equals("test")){
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound){
            System.out.println(index);
        }
        else System.out.println(-1);

    }
}