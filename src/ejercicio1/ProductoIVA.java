package ejercicio1;

public  class ProductoIVA extends Produto{

    double precioNeto;
    double iva;

    public ProductoIVA(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;

    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    @Override
    public String toString() {
        return super.toString() + " + " + iva + " = " + getPrecioNeto(iva) + " €";
    }
}
