public class oopsstring {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // O O P S (O repeated twice)
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Build Letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Build Letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Build Letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}