/*De las principales violaciones y la mas resaltada es que el principio establece 
que UNA clase solo debe tener una resposabilidad y en este caso vemos que tiene 4
esta clase tiene 4 responsabilidades que estan mal, pero ya sea por facilidad de aprendizaj o por falta 
de conocimiento en el principio de responsabilidad unica(srp) se hace omision de este principio
*/ 

// CODIGO REFACTORIZADO

import java.util.Scanner;

class Usuario2 {
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Float salario;
    
    public Usuario2(String nombre,String apellido,String email,String contraseña,Float salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
    }
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getEmail(){
        return email;
    }
    public String getContraseña(){
        return contraseña;
    }
    public Float getSalario(){
        return salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    public void setSalario(Float salario){
        this.salario = salario;
    }
    public void InformacionPersonal () {
        System.out.println("nombre: " + nombre + "\n apellidoo: " + apellido + "\n email: " + email + "\n contraseña: " + contraseña +"\n su salario es de:"+ salario);
    }
}
class ServicioEnvioACorreo {
    public void EnviarCorreo (String email) {
        System.out.println("Correo enviado a: " + email+" "+"bienvenido");
    }
}
class ServicioValidacionDeContaseña {
    public boolean  ValidarContraseña (String contraseña , String nuevaContraseña) {
        if (contraseña.equals(nuevaContraseña) ) {
            System.out.println("contraseña correcta");
            return true;
        } else {
            System.out.println("contraseña incorrecta");
            return false;
        }
    }
}
class ServicioCalculadoraDeSalario {
    public void  CalcularSalario( Float salario) {
        salario = ((salario*5)/2) ;
        System.out.println("su salario es de: "+ salario);
    }
}

public class BaseDeDatos {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("ingrese su correo: ");
        String email = scanner.nextLine();
        System.out.println("ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("ingrese su salario: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();
        Usuario2 usuario2 = new Usuario2(nombre, apellido, email, contraseña, salario);
        usuario2.InformacionPersonal();
        ServicioEnvioACorreo servicioEnvioACorreo = new ServicioEnvioACorreo();
        servicioEnvioACorreo.EnviarCorreo(email);
        ServicioValidacionDeContaseña validarContraseña = new ServicioValidacionDeContaseña();
        System.out.println("ingrese sucontraseña: ");
        String nuevaContraseña = scanner.nextLine();
        validarContraseña.ValidarContraseña(contraseña, nuevaContraseña);
        
        ServicioCalculadoraDeSalario servicioCalculadoraDeSalario = new ServicioCalculadoraDeSalario();
        servicioCalculadoraDeSalario.CalcularSalario(salario);
    }                
}