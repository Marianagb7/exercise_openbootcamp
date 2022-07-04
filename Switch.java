public class Switch {

    public static void main(String[] args){

        String estacion = "OTOÑO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }

    }
}
