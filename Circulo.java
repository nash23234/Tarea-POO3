public class Circulo extends Figura implements Comparable<Figura> {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    //obtemer area
    
    

    public int lados() {
        return 0;
    }


    public int compareTo(Figura circuloPorComparar) {
        double areaPorComparar = circuloPorComparar.calcularArea();
        double miArea= this.calcularArea();

        int lados = circuloPorComparar.lados();
        int ladosMi = this.lados();

        if(lados == ladosMi){
            if(miArea == areaPorComparar){
                return 0;
            }else if(miArea > areaPorComparar){
                return 1;
            }else{
                return -1;
            }
        }else if(lados > ladosMi){
            return 1;
        }else{
            return -1;
        }
        
    }
}
    

