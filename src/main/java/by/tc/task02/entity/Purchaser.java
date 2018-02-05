package main.java.by.tc.task02.entity;

public class Purchaser {

    private int idPurchaser;

    private int numberOfPurchases;

    public Purchaser(){
        this.idPurchaser = this.hashCode();
    }

    public void setNumberOfPurchases(int numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }

    public int getIdPurchaser() {
        return idPurchaser;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){ return true; }

        if(null == obj){ return false; }

        if(this.getClass() != obj.getClass()){ return false; }

        Purchaser purchaser = (Purchaser)obj;

        if(this.idPurchaser != purchaser.idPurchaser){return false;}

        if(this.numberOfPurchases != purchaser.numberOfPurchases){return false;}

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
