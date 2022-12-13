/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menutrabajomiguelrosero;
import java.util.Scanner;
/**
 *
 * @author egg
 */
public class MenuTrabajoMiguelRosero {
    static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuGeneral();
    }
    //Inicio de los subprogramas para resolución de los ejercicios
    //1) Subrpograma que muestra por pantalla el menú general
    public static void menuGeneral(){
        int opcion = 0;
        do{
            //Mostramos las opciones del menú
            System.out.println("1. Menu vectores ");
            System.out.println("2. Menu Matrices  ");
            System.out.println("3. Menu cadenas ");
            System.out.println("4. Menu ejercicios varios ");
            System.out.println("5. Salir  ");
            System.out.println("------------------------------ ");
            System.out.print("Seleccione una opcion del menu : ");
            opcion = entrada.nextInt();
            // evaluamos los pasos a seguir según la opción del usuario mediante una estructura switch
            switch(opcion){
                case 1 :
                    //Mostrar los ejerciciso de vectores 
                    menuVectores();
                    break;
                case 2: 
                    //Mostrar ejercicios matrices 
                    menuMatrices();
                    break;
                case 3: 
                    //Mostrar ejercicios cadenas
                    menuCadenas();
                    break;
                case 4 :
                    //Mostrar ejercicios varios 
                    menuEjerVarios();
                    break;
            
            }
        }while(opcion!=5);
    }
    //creamos el menú de los ejercicios del vector 
    public static void menuVectores(){
        int opcion =0;
        do{
            
            //Mostramos por pantlla las opciones del menu de vectores 
            System.out.println("1.Se tienen tres vectores con datos numericos, hallar la interseccion de"
                    + " los tres de los numeros primos sin repetidos.  ");
            System.out.println("2.De los tres Hallar la unión de los numeros impares sin repetidos   ");
            System.out.println("3.De los tres ordenarlos y obtener un vector ordenado por mezcla de los tres, solo con pares y sin repetidos");
            System.out.println("4.Se tiene un vector con datos numericos, eliminar los primos que no sean numeros de Fibonacci. ");
            System.out.println("5.Se tiene un vector con datos numericos repetidos, encontrar el primo que mas se repite");
            System.out.println("6. volver al menu principal ");
            System.out.println("------------------------------ ");
            System.out.print("Seleccione una opcion del menu : ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 :
                    //Mostrar ejercicio 1 
                    int [] v1,v2,v3,vr,vrsinrepetidos;
                    vr = new int [100];
                    vrsinrepetidos = new int[100];
                    int cd,cd2,cd3;
                    //llenar v1
                    System.out.print("Llenar primer vector ");
                    cd = cantidadDatosVector();
                    v1 = new int [cd];
                    llenarVector(v1, cd);
                    mostarVector(v1, cd);
                    System.out.println(" ");
                    System.out.print("Llenar Segundo vector -- ");
                    cd2 = cantidadDatosVector();
                    v2 = new int [cd2];
                    llenarVector(v2, cd2);
                    mostarVector(v2, cd2);
                    System.out.println(" ");
                    System.out.print("Llenar Tercer  vector ");
                    cd3 = cantidadDatosVector();
                    v3 = new int [cd3];
                    llenarVector(v3, cd3);
                    mostarVector(v3, cd3);
                    System.out.println(" ");
                    int j=0;
                    for(int i =0;i<v1.length;i++){
                        if(determinarPrimo(v1[i])==true){
                            if(buscarDato(v2, cd2, v1[i])==true){
                                if(buscarDato(v3, cd3, v1[i])==true){
                                    vr[j]=v1[i];
                                    j++;
                                
                                }
                            }
                            
                        }
                            
                    }
                    int y=0;
                    for(int i =0;i<vr.length;i++){
                        if(buscarDato(vrsinrepetidos, vrsinrepetidos.length, vr[i])== false){
                            vrsinrepetidos[y]=vr[i];
                            y++;
                        }
                    }
                    System.out.println("Resulatdo ----------> ");
                    for(int i =0;i<vrsinrepetidos.length;i++){
                        if(vrsinrepetidos[i]!=0){
                            System.out.print(vrsinrepetidos[i] +" ");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 2: 
                    //Mostrar ejercicio 2
                    int [] vv1,vv2,vv3,vvr,vvrsinrepetidos;
                    vvr = new int [100];
                    vvrsinrepetidos= new int [100];
                    int ccd,ccd2,ccd3;
                    System.out.print("Llenar primer vector ");
                    ccd = cantidadDatosVector();
                    vv1 = new int [ccd];
                    llenarVector(vv1, ccd);
                    mostarVector(vv1, ccd);
                    System.out.println(" ");
                    System.out.print("Llenar Segundo vector -- ");
                    ccd2 = cantidadDatosVector();
                    vv2 = new int [ccd2];
                    llenarVector(vv2, ccd2);
                    mostarVector(vv2, ccd2);
                    System.out.println(" ");
                    System.out.print("Llenar Tercer  vector ");
                    ccd3 = cantidadDatosVector();
                    vv3 = new int [ccd3];
                    llenarVector(vv3, ccd3);
                    mostarVector(vv3, ccd3);
                    System.out.println(" ");
                    int s=0;
                    for(int i =0;i<vv1.length;i++){
                        if(esImpar(vv1[i])==true){
                            vvr[s]=vv1[i];
                            s++;
                        }
                    }
                    for(int i =0;i<vv2.length;i++){
                        if(esImpar(vv2[i])==true){
                            vvr[s]=vv2[i];
                            s++;
                        }
                    }
                    for(int i =0;i<vv3.length;i++){
                        if(esImpar(vv3[i])==true){
                            vvr[s]=vv3[i];
                            s++;
                        }
                    }
                    
                    System.out.println(" ");
                    int q=0;
                    for(int i =0;i<vvr.length;i++){
                        if(buscarDato(vvrsinrepetidos, vvrsinrepetidos.length, vvr[i])== false){
                            vvrsinrepetidos[q]=vvr[i];
                            q++;
                        }
                    }
                    for(int i =0;i<vvrsinrepetidos.length;i++){
                        if(vvrsinrepetidos[i]!=0){
                            System.out.print(vvrsinrepetidos[i] +" ");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 3: 
                    //Mostrar ejercicio 3 
                    int [] vvv1;
                    int [] vvv2;
                    int [] vvv3;
                    int cccd,cccd2,cccd3;
                    System.out.print("Llenar el primer vector ");
                    cccd = cantidadDatosVector();
                    vvv1 = new int [cccd];
                    llenarVector(vvv1, cccd);
                    mostarVector(vvv1, cccd);
                    System.out.println(" ");
                    System.out.println("vector Ordenado ");
                    ordenarVector(vvv1, cccd);
                    System.out.println(" ");
                    System.out.println("Llenar el Segundo vector ");
                    cccd2 = cantidadDatosVector();
                    vvv2 = new int [cccd2];
                    llenarVector(vvv2, cccd2);
                    mostarVector(vvv2, cccd2);
                    System.out.println(" ");
                    System.out.println(" vector ordenado  ");
                    ordenarVector(vvv2, cccd2);
                    System.out.println(" ");
                    System.out.print("Llenar el tercer vector ");
                    cccd3 = cantidadDatosVector();
                    vvv3 = new int [cccd3];
                    llenarVector(vvv3, cccd3);
                    mostarVector(vvv3, cccd3);
                    System.out.println(" ");
                    System.out.println(" vector ordenado ");
                    ordenarVector(vvv3, cccd3);
                    System.out.println(" ");
                    
                    
                    break;
                case 4 :
                    //Mostrar ejercicio 4
                    int [] vvvv1;
                    int ccccd;
                    System.out.print("Llenar el vector ");
                    ccccd = cantidadDatosVector();
                    vvvv1 = new int [ccccd];
                    llenarVector(vvvv1, ccccd);
                    mostarVector(vvvv1, ccccd);
                    System.out.println(" ");
                    int u=0;
                    for(int i=0;i<vvvv1.length;i++){
                        if(determinarPrimo(vvvv1[i])==true){
                            if(determinarFibonacci(vvvv1[i])==false){
                                vvvv1[i]=0;
                            }
                        }else{
                            vvvv1[i]=0;
                        }
                    }
                    System.out.println("------------------- ");
                   for(int i =0;i<vvvv1.length;i++){
                        if(vvvv1[i]!=0){
                            System.out.print(vvvv1[i] +" ");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 5 :
                    //Mostrar ejercicios 5 
                    int [] vvvvv1;
                    int cccccd;
                    System.out.print("Llenar el vector ");
                    cccccd = cantidadDatosVector();
                    vvvvv1 = new int [cccccd];
                    llenarVector(vvvvv1, cccccd);
                    mostarVector(vvvvv1, cccccd);
                    break;
                case 6 : 
                    //regresar al principal
                    return;
            }
            
        }while(opcion!=6);
    }
    //menú que muestra las opciones de los ejercicios de matrices 
    public static void menuMatrices(){
        int opcion =0;
        do{
            //Mostramos por pantlla las opciones del menu de matrices
            System.out.println("1.Se tiene una matriz con datos numericos, ordenarla en forma ascendente ");
            System.out.println("2.Se tiene una matriz con datos repetidos, formar un vector con los datos no repetidos");
            System.out.println("3.Se tienen dos matrices cuadradas con datos numericos repetidos, encontrar el primo mayor y menor de las diagonales principales y secundarias. ");
            System.out.println("4.Se tienen dos matrices con datos numericos, hallar la interseccion de los numeros primos de las dos matrices. ");
            System.out.println("5.Se tienen dos matrices con datos numericos, hallar la union de los numeros primos de las dos matrices");
            System.out.println("6. volver al menu principal ");
            System.out.println("------------------------------ ");
            System.out.print("Seleccione una opcion del menu : ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    //código primer ejercicio
                    int [][] m1;
                    int nf,nc;
                    System.out.println("Llenar matriz");
                    nf = filasM();
                    nc = numeroColumnasM();
                    m1 = new int [nf][nc];
                    llenarMatriz(m1, nf, nc);
                    mostrarMatriz(m1, nf, nc);
                    System.out.println(" ");
                    ordenarMatriz(m1, nf, nc);
                    System.out.println(" ");
                    System.out.println(" Matriz ordenada en forma asc ");
                    mostrarMatriz(m1, nf, nc);
                    System.out.println(" ");
                    
                    
                    
                    break;
                case 2 :
                    //código ejercicio 2 
                    int [][] m2;
                    int [] vdatosnorepetidosmatriz;
                    int nf2,nc2;
                    System.out.println("Llenar matriz");
                    nf2 = filasM();
                    nc2 = numeroColumnasM();
                    m2 = new int [nf2][nc2];
                    vdatosnorepetidosmatriz = new int [nf2*nc2];
                    llenarMatriz(m2, nf2, nc2);
                    mostrarMatriz(m2, nf2, nc2);
                    System.out.println(" ");
                    vectorSinRepetidosMatriz(m2, vdatosnorepetidosmatriz, nf2, nc2, vdatosnorepetidosmatriz.length);
                    System.out.println(" Vector resultado ");
                    mostarVector(vdatosnorepetidosmatriz, vdatosnorepetidosmatriz.length);
                    break;
                case 3 : 
                    //código ejercicio 3
                    int [][] matrizCuadardaUno;
                    int [][] matrizcaudradaDOS;
                    int [] vectorConLosPrimosDiagonalPrincipalPRIMERAMATR;
                    int [] vectorConLosPrimosDiagonalPrincipalSEGUNDAM;
                    int nfc;
                    int nfc2;
                    System.out.println("Llenar Primera  matriz Cuadrada -- De cuanto por cuanto :");
                    nfc = entrada.nextInt();
                    matrizCuadardaUno = new int [nfc][nfc];
                    vectorConLosPrimosDiagonalPrincipalPRIMERAMATR = new int [(nfc*nfc)];
                    llenarMatrizCuadrada(matrizCuadardaUno, nfc);
                    mostrarMatrizCuadrada(matrizCuadardaUno, nfc);
                    System.out.println(" ");
                    System.out.println(" ");
                    //sacaré todos los primos de la diagonal principal en un vector para luego comprar el mayor y menor
                    System.out.println(" El siguiente vector obtiene los primos de la diagonal ");
                    SacarPrimosDiagonalPrincipalAvector(matrizCuadardaUno, nfc, vectorConLosPrimosDiagonalPrincipalPRIMERAMATR);
                    mostarVector(vectorConLosPrimosDiagonalPrincipalPRIMERAMATR, vectorConLosPrimosDiagonalPrincipalPRIMERAMATR.length);
                    System.out.println(" ");
                    MayorrEjercicioMatrizCuadrada(vectorConLosPrimosDiagonalPrincipalPRIMERAMATR, vectorConLosPrimosDiagonalPrincipalPRIMERAMATR.length);
                    MenorrEjercicioMatrizCuadrada(vectorConLosPrimosDiagonalPrincipalPRIMERAMATR, vectorConLosPrimosDiagonalPrincipalPRIMERAMATR.length);
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Llenar Segunda  matriz Cuadrada -- De cuanto por cuanto :");
                    nfc2 = entrada.nextInt();
                    matrizcaudradaDOS = new int [nfc2][nfc2];
                    vectorConLosPrimosDiagonalPrincipalSEGUNDAM = new int [(nfc2*nfc2)];
                    llenarMatrizCuadrada(matrizcaudradaDOS, nfc2);
                    mostrarMatrizCuadrada(matrizcaudradaDOS, nfc2);
                    System.out.println(" ");
                    System.out.println(" ");
                    //sacaré todos los primos de la diagonal principal en un vector para luego comprar el mayor y menor
                    System.out.println(" El siguiente vector obtiene los primos de la diagonal ");
                    SacarPrimosDiagonalPrincipalAvector(matrizcaudradaDOS, nfc2, vectorConLosPrimosDiagonalPrincipalSEGUNDAM);
                    mostarVector(vectorConLosPrimosDiagonalPrincipalSEGUNDAM, vectorConLosPrimosDiagonalPrincipalSEGUNDAM.length);
                    System.out.println(" ");
                    MayorrEjercicioMatrizCuadrada(vectorConLosPrimosDiagonalPrincipalSEGUNDAM, vectorConLosPrimosDiagonalPrincipalSEGUNDAM.length);
                    MenorrEjercicioMatrizCuadrada(vectorConLosPrimosDiagonalPrincipalSEGUNDAM, vectorConLosPrimosDiagonalPrincipalSEGUNDAM.length);
                    System.out.println(" ");
                    System.out.println(" ");
                    
                    
                    System.out.println(" ");
                    
                    
                    
                    
                    
                    break;
                case 4 :
                    //código ejercico 4
                    int [][] m3;
                    int [][] m4;
                    int [] vresultantePrimosMatriz; 
                    int nf3,nc3,nf4,nc4;
                    System.out.println("Llenar Primera  matriz");
                    nf3= filasM();
                    nc3 = numeroColumnasM();
                    m3 = new int[nf3][nc3];
                    llenarMatriz(m3, nf3, nc3);
                    mostrarMatriz(m3, nf3, nc3);
                    System.out.println(" ");
                    System.out.println("Llenar Segunda  matriz");
                    nf4= filasM();
                    nc4 = numeroColumnasM();
                    m4 = new int[nf3][nc3];
                    vresultantePrimosMatriz = new int[(nf3*nc3)+(nf4*nc4)];
                    llenarMatriz(m4, nf4, nc4);
                    mostrarMatriz(m4, nf4, nc4);
                    System.out.println(" ");
                    interseccionPrimosDosMatrices(m3, m4, nf3, nc3, nf4, nc4, vresultantePrimosMatriz, vresultantePrimosMatriz.length);
                    System.out.println("---------------------------- ");
                    for(int i =0;i<vresultantePrimosMatriz.length;i++){
                        if(vresultantePrimosMatriz[i]!=0){
                            System.out.print(vresultantePrimosMatriz[i] +" ");
                        }
                    }
                    System.out.println(" ");
                case 5 :
                    //código ejercicio 5
                    int [][] m5;
                    int [][] m6;
                    int [] vectorunionnumerosprimosmatrices;
                    int [] vectorunionnumerosprimosmatricesSINREPE;
                    int nf5,nc5,nf6,nc6;
                    System.out.println("Llenar Primera  matriz");
                    nf5= filasM();
                    nc5 = numeroColumnasM();
                    m5 = new int[nf5][nc5];
                    llenarMatriz(m5, nf5, nc5);
                    mostrarMatriz(m5, nf5, nc5);
                    System.out.println(" ");
                    System.out.println("Llenar Segunda  matriz");
                    nf6= filasM();
                    nc6 = numeroColumnasM();
                    m6= new int[nf6][nc6];
                    vectorunionnumerosprimosmatrices = new int[(nf5*nc5)+(nf6*nc6)];
                    vectorunionnumerosprimosmatricesSINREPE = new int [vectorunionnumerosprimosmatrices.length];
                    llenarMatriz(m6, nf6, nc6);
                    mostrarMatriz(m6, nf6, nc6);
                    System.out.println(" ");
                    unionPrimosMatricesavector(m5, m6, nf5, nc5, nf6, nc6, vectorunionnumerosprimosmatrices, vectorunionnumerosprimosmatrices.length);
                    int v=0;
                    for(int i =0;i<vectorunionnumerosprimosmatrices.length;i++){
                        if(buscarDato(vectorunionnumerosprimosmatricesSINREPE, vectorunionnumerosprimosmatricesSINREPE.length, vectorunionnumerosprimosmatrices[i])== false){
                            vectorunionnumerosprimosmatricesSINREPE[v]=vectorunionnumerosprimosmatrices[i];
                            v++;
                        }
                    }
                     for(int i =0;i<vectorunionnumerosprimosmatricesSINREPE.length;i++){
                        if(vectorunionnumerosprimosmatricesSINREPE[i]!=0){
                            System.out.print(vectorunionnumerosprimosmatricesSINREPE[i] +" ");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 6 :
                    //volver al menú principal
                    return;
            
            
            }
            
        }while(opcion!=6);
    }
    //Menú cadenas 
     public static void menuCadenas(){
        int opcion =0;
        do{
            //Mostramos por pantlla las opciones del menu de cadenas
            System.out.println("1.Se tienen dos cadenas hallar los caracteres comunes sin repetidos");
            System.out.println("2.Se tienen dos cadenas hallar la union de los caracteres de las dos cadenas sin repetidos. ");
            System.out.println("3.Se tiene una cadena hallar los caracteres que mas se repiten. ");
            System.out.println("4.Se tiene un vector de cadenas mostrarla en orden ascendente.  ");
            System.out.println("5.Con cadenas, hallar la suma de dos números binarios. ");
            System.out.println("6. volver al menu principal ");
            System.out.println("------------------------------ ");
            System.out.print("Seleccione una opcion del menu : ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    //código ejercicio 1
                    String cadena1,cadena2;
                    char [] cadenaComunes;
                    char [] cadenaComunesSINREPE;
                    entrada.nextLine();
                    cadena1 = llenarcadena();
                    cadena2 = llenarcadena();
                    cadenaComunes = new char [(cadena1.length())+(cadena2.length())];
                    cadenaComunesSINREPE = new char [cadenaComunes.length];
                    System.out.println("cadena 1 : "+cadena1);
                    System.out.println("cadena 2 : "+cadena2);
                    int y=0;
                    for(int i=0;i<cadena1.length();i++){
                        if(buscaruncaracterenCadena(cadena2, cadena1.charAt(i))==true){
                            cadenaComunes[y]=cadena1.charAt(i);
                            y++;
                        }
                    }
                    //quitar los repetidos del vector principal de tipo char
                    
                    for(int i=0;i<cadenaComunes.length;i++){
                        if(BuscarDatoEnUnVectorChar(cadenaComunesSINREPE, cadenaComunesSINREPE.length, cadenaComunes[i])==false){
                            cadenaComunesSINREPE[y]=cadenaComunes[i];
                            y++;
                        }
                    }
                    mostrarVectorCharParaEjerciciosString(cadenaComunes, cadenaComunes.length);
                    System.out.println(" ");
                    System.out.println("Caracteres comunes sin repetidos :  ");
                    for(int i=0;i<cadenaComunesSINREPE.length;i++){
                        System.out.print(cadenaComunesSINREPE[i] +" ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    //Código ejercico 2
                    String cadena3,cadena4;
                    char [] unioncaracterensnormal;
                    char [] unioncaracteresSINREPE;
                    entrada.nextLine();
                    cadena3 = llenarcadena();
                    cadena4 = llenarcadena();
                    unioncaracterensnormal = new char [(cadena3.length())+(cadena4.length())];
                    unioncaracteresSINREPE = new char [unioncaracterensnormal.length];
                    System.out.println("cadena 1 : "+cadena3);
                    System.out.println("cadena 2 : "+cadena4);
                    int q=0;
                    //Llnear lo del primer string al vector unión
                    for(int i=0; i<cadena3.length();i++){
                        unioncaracterensnormal[q]=cadena3.charAt(i);
                        q++;
                    
                    }
                    //LLenar lo del segundo string al vectro unión
                    for(int i=0; i<cadena4.length();i++){
                        unioncaracterensnormal[q]=cadena4.charAt(i);
                        q++;
                    
                    }
                    //imprimir el vector union(aun imprime los repetidos)
                    for(int i=0;i<unioncaracterensnormal.length;i++){
                        System.out.print(unioncaracterensnormal[i] +" ");
                    
                    }
                    System.out.print(" ");
                     //quitar los repetidos del vector principal de tipo char
                    int h=0;
                    for(int i=0;i<unioncaracterensnormal.length;i++){
                        if(BuscarDatoEnUnVectorChar(unioncaracteresSINREPE, unioncaracteresSINREPE.length, unioncaracterensnormal[i])==false){
                            unioncaracteresSINREPE[h]=unioncaracterensnormal[i];
                            h++;
                        }
                    }
                    System.out.println(" ");
                    System.out.println(" Union sin repetidos");
                    for(int i=0;i<unioncaracteresSINREPE.length;i++){
                        System.out.print(unioncaracteresSINREPE[i] +" ");
                        
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    //Códifo ejerccicio 3
                    String cadena5;
                    entrada.nextLine();
                    break;
                case 4:
                    //Código ejervciio 4
                    break;
                case 5:
                    //Código ejercicio 5
                    break;
                case 6:
                    //Volver al menú principal
                    return;
            
            }
        }while(opcion!=6);
    }
    //menú ejercicios varios 
      public static void menuEjerVarios(){
        int opcion =0;
        do{
            //Mostramos por pantlla las opciones del menu de ejervarios
            System.out.println("1.Se tiene un vector con varios números primos determinar si el primo 2 y el primo 4 son consecutivos. ");
            System.out.println("2.Se tiene una matriz y un vector con datos repetidos, formar un vector con los datos no repetidos que no sean primos. ");
            System.out.println("3. volver al menu principal ");
            System.out.println("------------------------------ ");
            System.out.print("Seleccione una opcion del menu : ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    //código ejercicio 1
                    int [] v1;
                    int cd,primosegundo,primocuarto;
                    System.out.println("Llenar vector :");
                    cd = cantidadDatosVector();
                    v1 = new int [cd];
                    llenarVector(v1, cd);
                    mostarVector(v1, cd);
                    System.out.println(" ");
                    PrimoSegundoYCuartoConsecutivos(v1, cd);
                    
                    break;
                case 2:
                    //código ejercicio 2
                    int [] v2;
                    int [][] m1;
                    int [] vrConNOprimosnormal;
                    int [] vrConNOprimosSINREPE;
                    int cd2,nf,nc;
                    System.out.println("Llenar  matriz");
                    nf= filasM();
                    nc= numeroColumnasM();
                    m1 = new int[nf][nc];
                    llenarMatriz(m1, nf, nc);
                    mostrarMatriz(m1, nf, nc);
                    System.out.println(" ");
                    System.out.println("Llenar vector :");
                    cd2 = cantidadDatosVector();
                    vrConNOprimosnormal = new int [(nf*nc)+(cd2)];
                    vrConNOprimosSINREPE = new int [vrConNOprimosnormal.length];
                    v2 = new int [cd2];
                    llenarVector(v2, cd2);
                    mostarVector(v2, cd2);
                    System.out.println(" ");
                    //
                    int y=0;
                    for(int i=0;i<nf;i++){
                        for(int j=0;j<nc;j++){
                            if(determinarPrimo(m1[i][j])==false){
                            vrConNOprimosnormal[y]=m1[i][j];
                            y++;
                            
                        }
                        }
                    }
                    
                    for(int i=0;i<v2.length;i++){
                        if(determinarPrimo(v2[i])==false){
                            vrConNOprimosnormal[y]=v2[i];
                            y++;
                            
                        }
                    
                    }
                    
                     System.out.println(" ");
                    System.out.println(" ");
                     int u=0;
                    for(int i =0;i<vrConNOprimosnormal.length;i++){
                        if(buscarDato(vrConNOprimosSINREPE, vrConNOprimosSINREPE.length, vrConNOprimosnormal[i])== false){
                            vrConNOprimosSINREPE[u]=vrConNOprimosnormal[i];
                            u++;
                        }
                    }
                    for(int i=0;i<vrConNOprimosSINREPE.length;i++){
                        System.out.print(vrConNOprimosSINREPE[i] +" ");
                    
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    //salir al menú princiapl
                    return;
            }
            
        }while(opcion!=6);
    }
    
    public static int cantidadDatosVector(){
        int cd;
        System.out.print("Ingrese cantidad datos vector  ");
        cd = entrada.nextInt();
        return cd;
    }
    public static void llenarVector(int [] genericVector, int cd ){
        int dato;
        
        for(int i =0; i<genericVector.length;i++){
            System.out.print("Dato del vector en la pos " +i +" :");
            dato = entrada.nextInt();
            genericVector[i] = dato;
        }
    
    }
    public static void mostarVector(int [] genericVector, int cd){
        for(int i =0; i<cd;i++){
            System.out.print(genericVector[i] +" ");
        }
    }
    //método que determina si un numero es primo
      public static boolean determinarPrimo(int nro){ 
            int c,cd; 
            c=1; 
            cd=0; 
            while (c<=nro){ 
                if (nro % c==0) 
                    cd=cd+1;  //cd++ 
                c=c+1;    
            } 
            if (cd==2){ 

               return true;  
            } 
            else 
                return false;        

      }
    
    public static boolean buscarDato(int[] vector,int cd, int dato) {
        boolean encontrado = false;

        for (int i = 0; i < cd; i++) {
            if (vector[i] == dato) {
                encontrado = true;
                 break;
            }
        }

        return encontrado;
    }

    // función que recibe un número y devuelve true si es impar y false si es par
    public static boolean esImpar(int numero) {
    // usar el operador módulo para determinar si el número es impar
        if (numero % 2 == 1) {
            return true;
        } else {
        return false;
        }
    }
    
       public static boolean determinarFibonacci(int nro){ 

        int a,b,t; 

        a=0; 

        b=1; 

        t=0; 

        while (t<nro){ 

            t=a+b; 

            a=b; 

            b=t; 

        } 

        if (t==nro) 

            return true; 

        else 

            return false; 

    } 
//las tres funciones que siguen ayudan a lenar una matriz por el usuario
   //pide el némro de filas matriz
   public static int filasM(){
        int nf;
        System.out.println("ingrese numero de filas matriz :");
        nf = entrada.nextInt();
        return nf;
    }
    //Pide el numero de columnas matriz
    public static int numeroColumnasM(){
        int nc;
        System.out.println("Ingrese columnas de la matriz :");
        nc = entrada.nextInt();
        return nc;
    }
    //Llena la matriz con los datos anteriores
    public static void llenarMatriz(int [][] genericMatriz, int nf,int nc){
        int dato;
        for(int i=0;i<nf;i++){
            for(int j=0;j<nc;j++){
                System.out.println("Ingrese el dato de la matriz en la pos "+i+""+j);
                dato = entrada.nextInt();
                genericMatriz[i][j] = dato;

            }

        }

    }
    //el siguiente subprograma imprimer la matriz por la consola
    public static void mostrarMatriz(int [][] genericMatriz, int nf,int nc){
        for(int i=0;i<nf;i++){
            System.out.println();
            for(int j=0;j<nc;j++){
                System.out.print(genericMatriz[i][j]+" ");

            }

        }

    }
    public static void ordenarMatriz(int [][] genericMatriz, int nf, int nc){
        int aux;
        for(int i=0;i<nf;i++){
            for(int j=0;j<nc;j++){
                for(int z=0;z<nf;z++){
                    for(int y=0;y<nc;y++){
                        if((genericMatriz[i][j]) < (genericMatriz[z][y])){
                            aux = genericMatriz[i][j];
                            genericMatriz[i][j] = genericMatriz[z][y];
                            genericMatriz[z][y]=aux;
                        }
                    }
                
                }
            
            }
                
        }
    }
    public static void vectorSinRepetidosMatriz(int [][] genericMatriz, int [] vresultadosinrepe, int nf,int nc, int cd){
        int r=0;
        for(int i=0;i<nf;i++){
            for(int j=0; j<nc;j++){
                if(buscarDato(vresultadosinrepe, vresultadosinrepe.length, genericMatriz[i][j])==false){
                    vresultadosinrepe[r]=genericMatriz[i][j];
                    r++;
                }
            }
        
        }
    
    }
    
    public static void interseccionPrimosDosMatrices(int [][] genericMatriz1, int [][] genericMatriz2, int nf,int nc, int nf2, int nc2, int [] vectorInterseccionMPrimos, int cd){
        int y=0;
        for(int i=0;i<nf;i++){
            for(int j=0;j<nc;j++){
                if(determinarPrimo(genericMatriz1[i][j])==true){
                    if(buscarDatoMatriz(genericMatriz2, nf2, nc2, genericMatriz1[i][j])==true){
                        vectorInterseccionMPrimos[y]=genericMatriz1[i][j];
                        y++;
                    }
                }
            }
        }
    }
    public static boolean buscarDatoMatriz(int[][] matriz,int nf, int nc, int dato) {
        boolean encontrado = false;

        for (int i = 0; i < nf; i++) {
            for(int j=0;j<nc;j++){
                if ( matriz[i][j]== dato) {
                encontrado = true;
                 break;
            }
            
            }
            
        }

        return encontrado;
    }
    
    public static void unionPrimosMatricesavector(int [][] genericMatriz1, int [][] genericMatriz2, int nf,int nc, int nf2, int nc2, int [] vectorunionprimos, int cd){
        int y=0;
        for(int i=0; i<nf;i++){
            for(int j=0;j<nc;j++){
                if(determinarPrimo(genericMatriz1[i][j])==true){
                    vectorunionprimos[y]=genericMatriz1[i][j];
                    y++;
                
                }
            }
        }
        for(int i=0; i<nf2;i++){
            for(int j=0;j<nc2;j++){
                if(determinarPrimo(genericMatriz2[i][j])==true){
                    vectorunionprimos[y]=genericMatriz2[i][j];
                    y++;
                
                }
            }
        }
    
    }
    
    public static void PrimoSegundoYCuartoConsecutivos(int [] genericVectro, int cd){
        int contadorprimos =0;
        int contadorprimos2 =0;
        int primoSegudno=0;
        int primoCuarto=0;
        for(int i=0;i<cd;i++){
            if(determinarPrimo(genericVectro[i])==true){
                contadorprimos=(contadorprimos+1);
                contadorprimos2++;
                 if(contadorprimos==2){
                primoSegudno=genericVectro[i];
            }
             if(contadorprimos2==4){
                primoCuarto=genericVectro[i];
            }
            
            }
           
        }
        System.out.println("Primo 2 "+ primoSegudno);
        System.out.println("Primo 4 "+primoCuarto);
        if(primoSegudno+1==primoCuarto){
            System.out.println("Primo 2 y 4 Son consecutivos ");
        }else{
            System.out.println("Primo 2 y 4 NO son consecutivos");
        }
    }
    public static void ordenarVector(int [] genericvector, int cd){
        int aux;
        for(int i=0;i<(cd-1);i++){
            for(int j=0;j<(cd-1);j++){
                if(genericvector[j]>genericvector[(j+1)]){
                    aux = genericvector[j];
                    genericvector[j]=genericvector[(j+1)];
                    genericvector[(j+1)]=aux;
                
                }
            
            }
                
        }
        for(int i=0;i<cd;i++){
            System.out.print(genericvector[i] +" ");
        }
    }
    
    public static String llenarcadena(){
        String genericCadena;
        System.out.print("Digite la cadena 1:   ");
        genericCadena = entrada.nextLine();
        return genericCadena;
    }
    
    public static boolean buscaruncaracterenCadena(String genericCadena, char datoabuscar){
        boolean encontro = false;
        for(int i=0;i<genericCadena.length();i++){
            if(genericCadena.charAt(i)==datoabuscar){
                encontro = true;
                break;
            }
        }
        
        return encontro;
    }
    
    public static void mostrarVectorCharParaEjerciciosString(char [] genericVectorChar, int cd){
        for(int i=0;i<genericVectorChar.length;i++){
            System.out.print(genericVectorChar[i] +" ");
        
        }
        
    }
    
    public static boolean BuscarDatoEnUnVectorChar(char [] genericVector, int cd, char dato){
        boolean encontro = false;
        for(int i=0;i<genericVector.length;i++){
            if(genericVector[i]==dato){
                encontro=true;
                break;
            }
        
        }
        return encontro;
    }
    
    public static void llenarMatrizCuadrada(int [][] generiCMatrizCuadarada, int nfc){
        int dato;
        for(int i=0;i<nfc;i++){
            for(int j=0;j<nfc;j++){
                System.out.println("Ingrese el dato de la matriz en la pos "+i+""+j);
                dato = entrada.nextInt();
                generiCMatrizCuadarada[i][j] = dato;

            }

        }
        
    }
    
    public static void mostrarMatrizCuadrada(int[][]generiCMatrizCuadrada, int nfc){
        for(int i=0;i<nfc;i++){
            System.out.println();
            for(int j=0;j<nfc;j++){
                System.out.print(generiCMatrizCuadrada[i][j]+" ");

            }

        }
    
    }
    
    public static void SacarPrimosDiagonalPrincipalAvector(int [][] genericMatriz, int nfc, int [] vectorConLosPrimosDiagonal){
        int y=0;
        for(int i=0;i<nfc;i++){
            for(int j=0;j<nfc;j++){
                if(i==j){
                    if(determinarPrimo(genericMatriz[i][j])==true){
                    vectorConLosPrimosDiagonal[y]=genericMatriz[i][j];
                    y++;
                }
                }
                
            }
        }
    
    }
    
    public static void MayorrEjercicioMatrizCuadrada(int [] genericVector, int cd){
        
        int mayor;
        mayor =genericVector [0];
        
       
        for (int i = 0; i < genericVector.length; i++) {
           
            if(genericVector[i] > mayor) {
                mayor = genericVector[i];
            }
            
        }
        System.out.println("El Primo mayor dela diagonal principal es : "+mayor);
       
    
    }
    
     public static void MenorrEjercicioMatrizCuadrada(int [] genericVector, int cd){
        
        int menor;
        menor =genericVector[0];
        
       
        for (int i = 0; i < genericVector.length; i++) {
           
            if(genericVector[i] < menor) {
                menor = genericVector[i];
            }
            
        }
        System.out.println("El Primo menor dela diagonal principal es : "+menor);
       
    
    }
}
