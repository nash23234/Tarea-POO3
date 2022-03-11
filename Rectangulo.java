public class Rectangulo extends Figura implements Comparable<Figura> {
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura;
    }

    public int lados() {
        return 4;
    }

    public int compareTo(Figura rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea= this.calcularArea();

        int lados = rectPorComparar.lados();
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
