import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1: ");
        Persona fulano = new Persona("1", "Fulanito Pérez", 22, LocalDate.of(1995, 12, 01), "1020473852");
        System.out.println(fulano.mostrar());
        System.out.println(fulano.esMayorDeEdad());

        System.out.println("Ejercicio 2: ");
        Cuenta micuenta = new Cuenta("Yuliana", 1000 );
        micuenta.ingresar(-500);
        micuenta.retirar(3000);
        System.out.println(micuenta.mostrar());

    }
}
