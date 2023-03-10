import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            switch (args[0].toLowerCase()) {
                case "v0" -> System.out.println(V0.func(Double.parseDouble(args[1])));
                case "v4" -> System.out.println(V4.func(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
                case "v13" -> System.out.println(V13.func(Double.parseDouble(args[1])));
                case "v10" -> System.out.println(v10.func(args[1],args[2],args[3]));
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
