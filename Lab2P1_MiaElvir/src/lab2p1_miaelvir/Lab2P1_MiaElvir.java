
package lab2p1_miaelvir;

import java.util.Scanner; 
public class Lab2P1_MiaElvir {

   
    public static void main(String[] args) {
        Scanner papoy = new Scanner(System.in); 
        
        int opcion; 
        
        System.out.println("Lab2P1_MiaElvir");
        System.out.println("Menu");
        System.out.println("Ejercicio 1 - Dibujando triangulos = 1 ");
        System.out.println("Ejercicio 2 - Area de Figuras = 2 ");
        System.out.println("Ejercicio 3 - Evaluando numeros = 3 ");
        System.out.println("Salir del menu = 4");
        opcion = papoy.nextInt(); 
        
        while (opcion > 0 && opcion < 4) { 
            if (opcion == 1){
                System.out.println("Ejercicio 1 - Dibujando Triangulos ");
                System.out.println(" ");
                System.out.println("Ingrese 3 longitudes");
                System.out.print("Ingrese a: ");
                int opcion_a = papoy.nextInt(); 
                System.out.print("Ingrese b: ");
                int opcion_b = papoy.nextInt(); 
                System.out.print("Ingrese c: ");
                int opcion_c = papoy.nextInt(); 
                
                boolean prueba1=false; 
                boolean prueba2=false; 
                boolean prueba3=false; 
                
                
                if (opcion_a < 0 || opcion_b < 0 || opcion_c < 0) {
                    System.out.println("Las opciones que ingrese deben ser numeros positivos.");  
                }else{
                    
                    if(opcion_a + opcion_b > opcion_c){
                        prueba1 = true; 
                    }if (opcion_b + opcion_c > opcion_a){
                        prueba2 = true;      
                    }if (opcion_c + opcion_a > opcion_b){
                         prueba3 = true;    
                    }
                    
                    if (prueba1 == true && prueba2 == true && prueba3 == true){
                        System.out.println("Las longitudes ingresadas forman un triangulo. ");
                    }else{
                        System.out.println("Las longitudes ingresadas no forman un triangulo. ");   
                    }
                }//fin else 1 principal 
            }// fin opcion 1 
            
            if (opcion == 2){
                
                double base;
                double altura; 
                char s_n = 's'; 
              
                while (s_n == 's' || s_n == 'S'){
                    
                System.out.println("Ejercicio 2 - Area de figuras");
                System.out.println("Calcular areas");
                System.out.println("Ingrese la figura a la cual desea calcularle el area");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("3. Circulo");
                System.out.print("Ingrese su respuesta: ");
                int ej2_user; 
                ej2_user = papoy.nextInt();
                
                    if (ej2_user == 1){
                        System.out.print("Ingrese la base: ");
                        base = papoy.nextDouble(); 
                        System.out.print("Ingrese la altura: ");
                        altura = papoy.nextDouble(); 
                        double area_triangulo = 0.5*base*altura; 
                        System.out.println("El area del triangulo es: "+ area_triangulo);  

                    }else if (ej2_user == 2){
                        System.out.print("Ingrese la base: ");
                        base = papoy.nextDouble(); 
                        System.out.print("Ingrese la altura: ");
                        altura = papoy.nextDouble();
                        double area_rectangulo = base * altura; 
                        System.out.println("El area del rectangulo es: "+area_rectangulo);

                    }else if (ej2_user == 3){
                        double pi = Math.PI;
                        System.out.print("Ingrese el radio: ");
                        double radio = papoy.nextDouble(); 
                        double area_circulo = pi * radio * radio; 
                        System.out.println("El area del circulo es: "+area_circulo);
                    }   

                    System.out.println("Desea calcular otra figura (s/n): ");
                    s_n = papoy.next().charAt(0); 
                }
                
            }//fin opcion 2
            
            if (opcion == 3){
                System.out.println("Ejercicio 3 - Evaluando Numeros");
                System.out.print("Ingrese el numero que desea evaluar: ");
                int n_evaluar = papoy.nextInt(); 
                
                boolean n_primo = false; 
                boolean n_par = false; 
                int cont_divisores = 0; 
                int contador = 1; 
                
                
                if (n_evaluar%2 == 0){
                    n_par = true; 
                }
                
                while (n_evaluar >= contador){
                    if (n_evaluar%contador == 0 ){
                    cont_divisores++; 
                    }
                contador++;    
                }
                
                if (cont_divisores == 2){
                    n_primo = true; 
                }
                
                
                if (n_par == true && n_primo == true) {
                    System.out.println("El numero ingresado es un numero par y un numero primo.");
                }else if(n_par == true){
                    System.out.println("El numero ingresado es un numero par."); 
                }else if (n_par == false && n_primo == true){
                    System.out.println("El numero ingresado es un numero impar y primo.");    
                }else if (n_par == false){
                    System.out.println("El numero ingresado es un numero impar");
                }
                
            }//fin opcion 3 
            
              
        System.out.println("Lab2P1_MiaElvir");
        System.out.println("Menu");
        System.out.println("Ejercicio 1 - Dibujando triangulos = 1 ");
        System.out.println("Ejercicio 2 - Area de Figuras = 2 ");
        System.out.println("Ejercicio 3 - Evaluando numeros = 3 ");
        System.out.println("Salir del menu = 4");
        opcion = papoy.nextInt(); 
        }//fin while 
        
        
    } // fin public static 
    
} // fin class
