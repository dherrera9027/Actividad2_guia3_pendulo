
public class Main {

    public static void main(String[] args) {
        double Longitud;
        double Aceleracion_g;
        double Periodo;
        double Frecuencia;
        
        Pendulo pendulo =new Pendulo();
        
        System.out.println("Creacion del Pendulo");
        System.out.print("Digite la Longitud del Pendulo : ");
        Longitud = LeerConsola.nextDouble();
        System.out.print("Digite la Aceleracion : ");
        Aceleracion_g = LeerConsola.nextDouble();
        Periodo = pendulo.Periodo(Longitud, Aceleracion_g);
        System.out.println("El Periodo del Pendulo es : "+ Periodo);
        Frecuencia = pendulo.Frecuencia(Periodo);
        System.out.println("La Frecuencia del Pendulo es : "+Frecuencia);
    }
}