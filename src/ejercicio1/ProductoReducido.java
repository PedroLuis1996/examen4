package ejercicio1;

final public class ProductoReducido extends Produto{

    double iva;

    public ProductoReducido(String descripcion, double precioBruto) {
        super(descripcion, precioBruto);
        this.iva = 5;

    }
}
