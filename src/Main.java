public class Main {
    public static void main(String[] args) {
        try {
            switch (args[0].toLowerCase()) {
                case "v0" -> System.out.println(V0.func(Double.parseDouble(args[1])));
                case "v12" -> System.out.println(V12.func(Double.parseDouble(args[1])));
                case "v13" -> System.out.println(V13.func(Double.parseDouble(args[1])));
                case "exit" -> {
                    System.out.println("Done");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
