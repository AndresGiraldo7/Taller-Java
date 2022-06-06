package com.taller.ciclos;
import java.util.Scanner;

public class Escuela {
    
    private String usuario;
    Integer opcion;
    private String usu1= "";
    private String usu2= "";
    private String usu3= "";
    private String usu4= "";
    private String usu5= "";
    private String usu6= "";
    private String usu7= "";
    private String usu8= "";
    String presentado= "Prueba presentada";
    String noPresentado="Prueba no presentada";
    String aprobado = "Aprobado.";
    String noAprobado ="No aprobado.";

    static Scanner input = new Scanner(System.in);
    
    public Escuela(String usuario) {
        this.usuario = usuario;
    }
  

    /**
     * @return String return the usurio
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * @param usurio the usurio to set
     */
    public void setUsurio(String usuario) {
        this.usuario = usuario;
    }

  public void Mostrar(String usuario){

    do{ 
        System.out.println("*** Escuela automovilistica El Maestro ***");
        System.out.println("Elija una opcion: ");
        System.out.println("1. Registrar de usuarios ");
        System.out.println("2. Consultar usuarios que presentaron la prueba.");
        System.out.println("3. Ver resultados de la prueba.");
        System.out.println("4. Para salir");
        System.out.println("**********************************************");
        opcion = input.nextInt();
        System.out.print("\033[H\033[2J");

        switch (opcion) {
            case 1:
                System.out.println("***Registro maximo de 8 usuarios****");
                System.out.println("Digite el nombre del usuario 1:");
                usu1 = input.next();
                System.out.println("Digite el nombre del usuario 2:");
                usu2 = input.next();
                System.out.println("Digite el nombre del usuario 3:");
                usu3 = input.next();
                System.out.println("Digite el nombre del usuario 4:");
                usu4 = input.next();
                System.out.println("Digite el nombre del usuario 5:");
                usu5 = input.next();
                System.out.println("Digite el nombre del usuario 6:");
                usu6 = input.next();
                System.out.println("Digite el nombre del usuario 7:");
                usu7 = input.next();
                System.out.println("Digite el nombre del usuario 8:");
                usu8 = input.next();
                System.out.print("\033[H\033[2J");
                System.out.println("Limite de usuario completo.\n ");
            break;
            case 2:
                System.out.println("Digite el nombre del usuario que desea consultar");
                usuario = input.next();
                if(usuario.equals(usu1)){
                    System.out.println("Usuario: "+usu1+ " Estado de la prueba: "+noPresentado+"\n ");
                }
                if(usuario.equals(usu2)){
                    System.out.println("Usuario: "+usu2+ " Estado de la prueba: "+presentado+"\n ");
                }
                if(usuario.equals(usu3)){
                    System.out.println("Usuario: "+usu3+ " Estado de la prueba: "+presentado+"\n ");
                }
                if(usuario.equals(usu4)){
                    System.out.println("Usuario: "+usu4+ " Estado de la prueba: "+noPresentado+"\n ");
                }
                if(usuario.equals(usu5)){
                    System.out.println("Usuario: "+usu5+ " Estado de la prueba: "+presentado+"\n ");
                }
                if(usuario.equals(usu6)){
                    System.out.println("Usuario: "+usu6+ " Estado de la prueba: "+presentado+"\n ");
                }
                if(usuario.equals(usu7)){
                    System.out.println("Usuario: "+usu7+ " Estado de la prueba: "+noPresentado+"\n ");
                }
                if(usuario.equals(usu8)){
                    System.out.println("Usuario: "+usu8+ "Estado de la prueba: "+presentado+"\n ");
                }
            break;
            case 3:
            System.out.println("Digite el nombre del usuario que desea consultar");
            usuario = input.next();
            if(usuario.equals(usu1)){
                System.out.println("Usuario: "+usu1+ " Estado de la prueba: "+noAprobado+"\n ");
            }
            if(usuario.equals(usu2)){
                System.out.println("Usuario: "+usu2+ " Estado de la prueba: "+aprobado+"\n ");
            }
            if(usuario.equals(usu3)){
                System.out.println("Usuario: "+usu3+ " Estado de la prueba: "+aprobado+"\n ");
            }
            if(usuario.equals(usu4)){
                System.out.println("Usuario: "+usu4+ " Estado de la prueba: "+noAprobado+"\n ");
            }
            if(usuario.equals(usu5)){
                System.out.println("Usuario: "+usu5+ " Estado de la prueba: "+aprobado+"\n ");
            }
            if(usuario.equals(usu6)){
                System.out.println("Usuario: "+usu6+ " Estado de la prueba: "+aprobado+"\n ");
            }
            if(usuario.equals(usu7)){
                System.out.println("Usuario: "+usu7+ " Estado de la prueba: "+noAprobado+"\n ");
            }
            if(usuario.equals(usu8)){
                System.out.println("Usuario: "+usu8+ " Estado de la prueba: "+aprobado+"\n ");
            }
              break;  
            }
        }while(opcion !=4);
    }
}
