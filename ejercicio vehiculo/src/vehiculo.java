public class vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    //constructor
    public vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrardatos(){
        return "Marca: "+marca+"\n Modelo: "+modelo+"\n Precio: $"+precio+"\n";
    }
}
