public class v10 {
    public static double func(String x1,String y1,String z1) {
        double x = Double.parseDouble(x1);
        double y = Double.parseDouble(y1);
        double z = Double.parseDouble(z1);
        return Math.pow(x,0.25)*(Math.atan(z)+Math.pow(Math.cos(y),2));
    }
}
