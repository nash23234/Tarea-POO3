public class Circulo extends Figura implements Comparable<Circulo> {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public int lados() {
        return 0;
    }


    public int compareTo(Circulo circuloPorComparar) {
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
    

