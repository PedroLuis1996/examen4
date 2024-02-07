package ejercicio1;

final public class ProductoGeneral extends Produto{

    double iva;
    public ProductoGeneral(String descripcion, double precioBruto) {
        super(descripcion, precioBruto);
        this.iva = 21;
    }
}
