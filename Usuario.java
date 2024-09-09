import java.util.Scanner;

public class Usuario{
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Float salario;
    
    public Usuario(String nombre,String apellido,String email,String contraseña,Float salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
    }

    public void Informacion (String nombre, String apellido ,String  email ,String contraseña ,Float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
        System.out.println("nombre: " + nombre + "\n apellidoo: " + apellido + "\n email: " + email + "\n contraseña: " + contraseña +"\n su salario es de:"+ salario);
        
    }

    public void EnviarCorreo (String email) {
        this.email = email;
        System.out.println("Correo enviado a: " + email+" " +"bienvenido");
    }

    public boolean  ValidarContraseña (String contraseña , String nuevaContraseña) {
        this.contraseña = contraseña;
        if (contraseña.equals(nuevaContraseña) ) {
            System.out.println("contraseña correcta");
            return true;
        } else {
            System.out.println("contraseña incorrecta");
            return false;
        }
    }

    public void  CalcularSalario( Float salario) {
        this.salario= salario ;
        salario = ((salario*5)/2) ;
        System.out.println("su salario es de: "+ salario);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("ingrese su correo: ");
        String email = scanner.nextLine();
        System.out.println("ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("ingrese su salario: ");
        Float salario = scanner.nextFloat();
        scanner.nextLine();

        Usuario Usuario = new Usuario(nombre, apellido, email, contraseña, salario);

        Usuario.Informacion(nombre, apellido, email, contraseña, salario);

        Usuario.EnviarCorreo(email);

        System.out.println("ingrese sucontraseña: ");
        String nuevaContraseña = scanner.nextLine();
        Usuario.ValidarContraseña(contraseña, nuevaContraseña);

        Usuario.CalcularSalario(salario);
    }
};

