/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.util.Scanner;
import java.util.Hashtable;

/**
 *
 * @author Maynor
 */
public class Tarea2 {
        static int opcion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor;
        int codCliente;
        int clientes[];
        clientes = new int[5];
        clientes[0]=1000;
        clientes[1]=1001;
        clientes[2]=1002;
        clientes[3]=1003;
        clientes[4]=1004;
        int codigo1 = 1001;
        int codigo2 = 1002;
        int codigo3 = 1003;
        int codigo4 = 1004;
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        Moneda moneda0 = new Moneda(clientes[0],1500);
        Moneda moneda1 = new Moneda(clientes[1],750);
        Moneda moneda2 = new Moneda(clientes[2],1100);
        Moneda moneda3 = new Moneda(clientes[3],2500);
        Moneda moneda4 = new Moneda(clientes[4],400);

        Menu();
        
        while(!salir){
        switch(opcion){
               case 1:
                   System.out.println("Ver clientes y saldos \n");
                    System.out.println("no. de cuenta: "+clientes[0]+" tiene: Q"+moneda0.getSaldo()+"\n");
                    System.out.println("no. de cuenta: "+clientes[1]+" tiene: Q"+moneda1.getSaldo()+"\n");
                    System.out.println("no. de cuenta: "+clientes[2]+" tiene: Q"+moneda2.getSaldo()+"\n");
                    System.out.println("no. de cuenta: "+clientes[3]+" tiene: Q"+moneda3.getSaldo()+"\n");
                    System.out.println("no. de cuenta: "+clientes[4]+" tiene: Q"+moneda4.getSaldo()+"\n");
                    sn.nextInt();
                    Menu();
                   break;
               case 2:
                   System.out.println("Ingresa codigo de usuario a recibir fondos del monedero, pueden ser (1000,1001,1002,1003,1004):");
                   codCliente = sn.nextInt();
                   switch(codCliente){
                       case 1000:
                         System.out.println("Ingresa el valor a transferir a la cuenta 1000");
                         valor = sn.nextInt();
                         moneda0.transferir(moneda0, valor);
                         System.out.println("no. de cuenta: "+clientes[0]+" tiene: Q"+moneda0.getSaldo());
                         break;
                       case 1001:
                         System.out.println("Ingresa el valor a transferir a la cuenta 1001");
                         valor = sn.nextInt();
                         moneda1.transferir(moneda1, valor);
                         System.out.println("no. de cuenta: "+clientes[1]+" tiene: Q"+moneda1.getSaldo());
                         break;
                       case 1002:
                         System.out.println("Ingresa el valor a transferir a la cuenta 1002");
                         valor = sn.nextInt();
                         moneda2.transferir(moneda2, valor);
                         System.out.println("no. de cuenta: "+clientes[2]+" tiene: Q"+moneda2.getSaldo());
                         break;
                       case 1003:
                         System.out.println("Ingresa el valor a transferir a la cuenta 1003");
                         valor = sn.nextInt();
                         moneda3.transferir(moneda3, valor);
                         System.out.println("no. de cuenta: "+clientes[3]+" tiene: Q"+moneda3.getSaldo());
                             break;

                       case 1004:
                         System.out.println("Ingresa el valor a transferir a la cuenta 1004");
                         valor = sn.nextInt();
                         moneda4.transferir(moneda4, valor);
                         System.out.println("no. de cuenta: "+clientes[4]+" tiene: Q"+moneda4.getSaldo());
                         break;
                       default:
                            System.out.println("Lo sentimos esa cuenta no existe, adios");
                           break;
                   }         
                   
                   System.out.println("Presiona cualquier numero y presiona enter para ver el menu");
                   sn.nextInt();
                   Menu();
                   break;
                case 3:
                   System.out.println("Transferir de usuario a usuario");
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
        }
        
        
        


        System.out.println("no. de cuenta: "+codigo2+" tiene: Q"+moneda2.getSaldo());
        System.out.println("Restante Monedero: "+ moneda2.getMonedero()+" tiene: Q"+moneda2.getSaldo());

        
        

    }
    public static void Menu(){
        System.out.println("El Nombre de la Moneda es Mayncoin y su sufijo son Mayns\n Solo existen Mayns 10,000.00");
        System.out.println("1. Ver Usuarios de la Moneda");
        System.out.println("2. Transferir de Monedero a usuario");
        System.out.println("3. Transferir de usuario a usuario");
        System.out.println("4. Salir");
        System.out.println("Escribe el numero de una opcion:");
        Scanner sn = new Scanner(System.in);
        opcion = sn.nextInt();
    
    }
    
    
}
