public class Szamok{
    public static void main(String[] args) {
        int csakSzamjegy = 0;
        atnezes: for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++){
                if (args[i].charAt(j) < '0' || args[i].charAt(j) > '9') {
                    continue atnezes;
                }
            }
            csakSzamjegy++;
        }
    System.err.println(csakSzamjegy);
    }
}
