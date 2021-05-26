class Problem {
    public static void main(String[] args) {
        for (int ind = 0; ind < args.length; ind += 2) {
            if ("mode".equals(args[ind])) {
                System.out.println(args[ind + 1]);
                return;
            }
        }
        System.out.println("default");
    }
}