/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.modele;

/**
 *
 * @author ac532323
 */
abstract class Fruit {
    
    protected String origine;
    protected double prix;
    
    
    public Fruit(String o, double p)
    {
        this.origine = o;
        this.prix = p;
    }
    protected double getPrix()
    {
        return this.prix;
    }
    
    protected String getOrigine()
    {
        return this.origine;
    }
    
    public String toString()
    {
        String s="";
        s+= "Fruit : "+this.getClass()+ " Origine : "+this.origine+" prix : "+ this.prix;
        return s;
    }
    
    @Override
    public boolean equals(Object obj){
        Fruit f;
        if(obj.getClass() == this.getClass()){
            f = (Fruit) obj;
            return this.prix == f.prix && this.origine.equals(f.origine);
        }
        return false;
    }
    
}
