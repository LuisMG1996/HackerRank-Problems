/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.time.saving.affair;

import java.util.ArrayList;

/**
 *
 * @author lmontesg
 */
public class Nodo {
    
    int nodeId;
    boolean greenLight = true;
    ArrayList<Edge> edges;
    
    public Nodo(int id){
        edges = new ArrayList<Edge>();
        nodeId = id;
    }
    /**
    *@param dest = nodo destino
    * @param cost = costo del viaje del nodo al nodo destino
    */
    public void addEdge(Nodo dest, int cost){
        Edge newEdge = new Edge(dest, cost);
        edges.add(newEdge);
    }
    
    public void setGreenLight(){
        greenLight = !greenLight;
    }    
}
