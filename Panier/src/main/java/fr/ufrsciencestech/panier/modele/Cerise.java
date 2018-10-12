package fr.ufrsciencestech.panier.modele;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Cerise extends Fruit{
    private double prix;
    private String origine;
    
    public double getPrix(){
        return prix;
    }
    
    public String getOrigine(){
        return origine;
    }
    
    
    
    public Cerise (double p, String o) {
            super(o,p);
    }
    
    private double prixPositif(double p){
        Scanner scn = new Scanner(System.in);
        while(p<0.0){
            System.out.println("Le prix doit etre positif");
            p = scn.nextDouble();
        }
        return p;
    }
    
    @Override
    public String toString(){
        String s = "Prix: " + prix + "\nOrigine:" + origine;
        return s;
    }
    
    @Override
    public boolean equals(Object obj){
        Cerise c;
        if(obj.getClass() == this.getClass()){
            c = (Cerise) obj;
            return this.prix == c.prix && this.origine.equals(c.origine);
        }
        return false;
    }
}
