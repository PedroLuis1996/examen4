package ejercicio2;

public class Suscripcion implements Comprable{
    String descripcion;
    int existencias;
    double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }



    public double getPrecio() {
        return precio;
    }



    public Suscripcion(String descripcion, int existencias, double precio) {
        if (descripcion.length() == 0){
            throw new IllegalArgumentException("descripcion incorrecta");
        }else {
            this.descripcion = descripcion;
        }
        if(existencias <= 0){
            throw new IllegalArgumentException("existencias incorrecto");
        } else {
            this.existencias = existencias;
        }
        if(precio <= 0){
            throw new IllegalArgumentException("precio incorrecto");
        } else {
            this.precio = precio;
        }
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        if (existencias == 0){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void cogerUnidad() {
        if (existencias != 0){
            existencias--;
        } else {
            Exception NoHayExistenciasException;
        }

    }


    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
