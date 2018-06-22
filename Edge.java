/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.time.saving.affair;

/**
 *
 * @author lmontesg
 */
public class Edge {
    Nodo dest;
    int cost;
    
    public Edge(Nodo d, int cost){
        dest = d;
        this.cost = cost;
    }

    
}
