package ejercicio1;

public class Produto {

    private String descripcion;

    private double precioBruto;


    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) throws IllegalArgumentException {
        if (descripcion.length() == 0){
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }else {
            this.descripcion = descripcion;
        }


    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    private void setPrecioBruto(double precioBruto) throws IllegalArgumentException {
        if (precioBruto <= 0){
            throw new IllegalArgumentException("El precio no puede ser menor o igual a 0");
        } else {
            this.precioBruto = precioBruto;
        }

    }

    public Produto(String descripcion, double precioBruto) {
        setDescripcion(descripcion);
        setPrecioBruto(precioBruto);
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto + " €";
    }

    public double getPrecioNeto(double iva){
        double precioiva = (getPrecioBruto() * iva) / 100;
        double precioNeto = getPrecioBruto() + precioiva;
        return precioNeto;
    }
}
