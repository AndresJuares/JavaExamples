/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciosjava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USUARIO
 */
public class EjerciciosJava {

    public static void main(String[] args) throws Exception {
        //ejercicio 1:Hacer un programa que calcule e imprima suma de 3 calificaciones
        
        /*
        System.out.println("Ingrese las 3 calificaciones con espacio: ");
        float n1,n2,n3,resultado;
        Scanner lec1=new Scanner(System.in);
        n1=lec1.nextFloat();
        n2=lec1.nextFloat();
        n3=lec1.nextFloat();
        resultado=n1+n2+n3;//   SUMA LAS 3 NOTAS
        System.out.println("la suma total es de: "+resultado);
       */
        
        
        /*ejercicio 2:HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL
        DE UN EMPLEADO A PARTIR DE SUS HORAS SEMANALES TRABAJADAS Y DE SU
        SALARIO POR HORA
        */
        
        /*
        System.out.println("Ingrese las horas semanales :");
        Scanner lec1=new Scanner(System.in);
        System.out.println("Ingrese el salario por hora :");
        float n1,n2,resultado;
        
        n1=lec1.nextFloat();
        n2=lec1.nextFloat();
        resultado=n1*n2;
        System.out.println("El salario semanal es: "+resultado);
        */
        
        /*ejercicio 3: GUILLERMO TIENE N DOLARES. LUIS TIENE LA MITAD DE LO QUE
        POSEE GUILLERMO.JUAN TIENE LA MITAD DE LO QUE POSEEN LUIS Y GUILLERMO
        JUNTOS.HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO
        QUE TIENEN ENTRE LOS TRES
        */
        
        /*
        System.out.println("Cuantos dolares tiene guillermo? ");
        Scanner lectura= new Scanner(System.in);
        float guille,luis,juan;
        guille=lectura.nextFloat();
        luis=guille/2;
        juan=(guille+luis)/2;
        System.out.println("Guillermo tiene: "+guille);
        System.out.println("Luis tiene: "+luis);
        System.out.println("Juan tiene: "+juan);
        */
        
        

        //Ejercicio 4: invertir una cadena
        
        /*
        System.out.println("Escriba algo para invertir");
        Scanner lec=new Scanner(System.in);
        String text,result="";
        text=lec.nextLine();
        for(int i=text.length();i>=0;i--){
            result+=text.indexOf(i);
        }
        System.out.println("El resultado es: "+result);
        */
        
        // Ejercicio 5: CONTAR CUANTAS VECES SE REPITE UN CARACTER
        
        /*
        System.out.println("ingrese caracteres:");
        Scanner lec=new Scanner(System.in);
        String lectura= lec.nextLine();//LEO ENTRADA DE USUARIO
        System.out.println("Ingrese el caracter:");
        char character=lec.next().charAt(0);//GUARDO CARACTER
        int contador=0;
        for(var chara:lectura.toCharArray()){// VAR VARIABLE: ARRAY
           //VAR ES CUALQUIER TIPO DE VALOR
            if(chara==character){//PREGUNTO SI CARACTER VAR ES IGUAL AL INGRESADO
            contador++;
            }
        }
        System.out.println("El caracter se repite "+contador+" veces");
        */
        
        //Ejercicio 6: distancia de Hamming. 
        //MEDIANTE 2 CADENAS, COMPARAR Y ENUMERAR LA DIFERENCIA,DEBEN SER IGUAL DE LONGITUD
           
        /*
        System.out.println("Ingrese una cadena");
        Scanner lec=new Scanner(System.in);
        String tabla1,tabla2;
        tabla1=lec.nextLine();
        System.out.println("Ingrese otra cadena");
        tabla2=lec.nextLine();
        int distancia=0;
        try{//INSTRUCCIONES CUANDO NO HAY UNA EXCEPCION
            if(tabla1.length()!=tabla2.length())
                throw new Exception("Longitudes distintas");
        }
        
        catch(Exception error){//INSTRUCCIONES CUANDO HAY UNA EXCEPCION,TIPO DE EXCEPTCION DENTRO DEL PARENTESIS
            System.out.println("No se realizará la operación, "+error.getMessage());
            System.out.println("Reingrese una cadena");
            tabla1=lec.nextLine();
            System.out.println("Reingrese otra cadena");
            tabla2=lec.nextLine();
            
        }
        finally{//INSTRUCCIONES TANTO SI HAY O NO EXCEPCION
            for(int i=0;i<=tabla1.length()-1;i++){
                if(tabla1.charAt(i)!=tabla2.charAt(i)){//SE PREGUNTA CON CHARAT PARA DIFERENCIAR CADA LETRA
                    distancia++;
                }
            }   
        }
        System.out.println("La distancia es "+distancia);
        */
        
        //Ejercicio 7: Contador de palabras
        
        /*
        System.out.println("Ingrese un texto: ");
        String[] text;  //UTILIZO UN ARRAY PARA INVOCAR EL SPLIT
        String texto;
        Scanner lec= new Scanner(System.in);
        texto=lec.nextLine();// LO DEBO GUARDAR PRIMERO EN EL TIPO DE ENTRADA Y DPS INVOCAR EL SPLIT
        texto=texto.replaceAll("\s+","\s").trim();//EL TRIM DEVUELVE EL MISMO TEXTO SIN ESPACIOS ANTES Y DESPUES DE LAS PALABRAS
        //EL REPLACE ALL REEMPLAZA EL PRIMER PARAMETRO POR EL SEGUNDO. SE TOMA LA VARIABLE.REPLACEALL
        //SE DEBE GUARDAR EN LA MISMA VARIABLE PORQUE RETORNA MISMO TIPO.
        text=texto.split(" ");// EL SPLIT CUENTA CUANTAS VECES ESTA EL PARAMETRO QUE LE PASO
        System.out.println("La cantidad de palabras ingresadas es: "+text.length);
        */
        
        
        //Ejercicio 8: contar caracteres en una cadena de caracteres
        /*
        System.out.println("Ingrese una cadena ");
        Scanner lec=new Scanner(System.in);
        String text,text1;
        text=lec.nextLine();
        System.out.println("Ingrese el caracter a buscar");
        text1=lec.nextLine();
        Pattern patron= Pattern.compile(text1,Pattern.CASE_INSENSITIVE);
        //el PATTERN DETERMINA LO QUE DEBO BUSCAR(TEXTO O NUMEROS,RANGO)
        
        
        Matcher matcher= patron.matcher(text);//EL MATCHER SE UTILIZA PARA REALIZAR LA BUSQUEDA
        int contador=0;
        boolean result;
        //CREO UN CONTADOR Y UN BOOLEANO PARA SABER SI ESTA EL NRO EN EL CARACTER
        for(var i:text.toCharArray()){
            result=matcher.find();//BUSCO CADA CARACTER QUE PASA POR EL FOR(CARACTER POR CARACTER)
            //DEVUELVE UN BOOLEAN
            if(result==true){
                contador++;
            }
        }
            
        System.out.println("La cadena tiene: "+contador+" caracteres");
        */
        
        
    }
}
