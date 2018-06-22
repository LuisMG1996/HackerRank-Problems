/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.time.saving.affair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lmontesg
 */
public class Grafo extends ArrayList<Nodo>{
    
    public Grafo(int n, int m){
        Scanner scanner = new Scanner(System.in);
        Nodo newNode = new Nodo(0);
        add(newNode);
        for (int i = 1; i <= n; i++){
            newNode = new Nodo(i); 
            add(newNode);
        }
        for (int i = 0; i < m; i++){
                String[] data = new String[3];
                data = scanner.nextLine().split(" ");
                get(Integer.parseInt(data[0])).addEdge(get(Integer.parseInt(data[1])),
                        Integer.parseInt(data[2]));
        }        
    }    
}
