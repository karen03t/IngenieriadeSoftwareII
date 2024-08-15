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

    public Informacion (String nombre, String apellido, String email, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
        System.out.println("nombre: " + nombre + "\n apellido: " + apellido + "\n email: " + email + "\n contraseña: " + contraseña +"\n su salario es de:"+ salario);
    }

    public EnviarCorreo(){
        this.email = email;
        System.out.println("Correo enviado a: " + email+"bienvenido");
    }

    public ValidarContraseña (){
        Scanner scanner = new Scanner(System.in);
        this.contraseña = contraseña;
        private String nuevaContraseña;
        System.out.println("Ingrese su contraseña: ");
        nuevaContraseña = sc.nextLine();
        if (nuevaContraseña.equals(contraseña)){
            System.out.println("Contraseña correcta");
    }   else{
            System.out.println("contraseña  incorrecta");
        }
    }

    public CalcularSalario(){
        this.salario= salario;
        salario= (salario*5)/2
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
        Usuario usuario = new Usuario(nombre, apellido, email, contraseña, salario);

        Informacion informacion = new Informacion();
        informacion.Informacion(usuario);

        EnviarCorreo envio = new EnviarCorreo();
        envio.EnviarCorreo(usuario);

        ValidarContraseña validacion = new ValidarContraseña();
        validacion.validacionDeContaseña(usuario);

        CalcularSalario calculadora = new CalcularSalario();
        calculadora.CalcularSalario(usuario);
    }
}

/*De las principales violaciones y la mas resaltada es que el principio establece 
que UNA clase solo debe tener una resposabilidad y en este caso vemos que tiene 4
esta clase tiene 4 responsabilidades que estan mal, pero ya sea por facilidad de aprendizaj o por falta 
de conocimiento en el principio de responsabilidad unica(srp) se hace omision de este principio
*/ 

// CODIGO REFACTORIZADO


    //setters
        public void setNombre(String nombre){
            this.nombre= nombre;
        }
        public void setApellido(String apellido){
            this.apellido= apellido;

        }
        public void setEmail(String email){
            this.email= email;
        }
        public void setContraseña(String contraseña){
            this.contraseña= contraseña;
        }
        public void setSalario(Float salario){
            this.salario= salario;
        }
    //getters

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
