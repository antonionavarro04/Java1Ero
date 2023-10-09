package ejercicioscrud.ejercicio2;

public class Articulo {
    /**
     * Codigo del Articulo
     */
    private String codigo;

    /**
     * Descripcion del Articulo
     */
    private String descripcion;

    /**
     * Precio de Compra del Articulo
     */
    private double precioCompra;

    /**
     * Precio de Venta del Articulo
     */
    private double precioVenta;

    /**
     * Stock del Articulo
     */
    private int stock;

    /**
     * Constructor por defecto
     */
    public Articulo () {
        this.codigo = "";
        this.descripcion = "";
    }

    /**
     * Constructor con parámetros, comprobará que los datos sean correctos
     * @param codigo Codigo del Articulo
     * @param descripcion Descripcion del Articulo
     * @param precioCompra Precio de Compra del Articulo
     * @param precioVenta Precio de Venta del Articulo
     * @param stock Stock del Articulo
     */
    public Articulo (String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        // ! Comprobamos que el codigo no este vacío
        if (!codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            this.codigo = "";
        }

        // ! Comprobamos que la descripción no este vacía
        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
        } else {
            this.descripcion = "";
        }
        
        // ! Comprobamos que el precio de compra sea mayor que 0
        if (precioCompra > 0) {
            this.precioCompra = precioCompra;
        } else {
            this.precioCompra = 0;
        }

        // ! Comprobamos que el precio de venta sea mayor que 0
        if (precioVenta > 0) {
            this.precioVenta = precioVenta;
        } else {
            this.precioVenta = 0;
        }

        // ! Comprobamos que el stock sea mayor que 0
        if (stock > 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    /**
     * @return Devuelve el codigo del Articulo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo Establece el codigo del Articulo
     */
    public void setCodigo(String codigo) {
        if (!codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            this.codigo = "";
        }
    }

    /**
     * @return Devuelve la descripcion del Articulo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion Establece la descripcion del Articulo
     */
    public void setDescripcion(String descripcion) {
        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
        } else {
            this.descripcion = "";
        }
    }

    /**
     * @return Devuelve el precio de compra del Articulo
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra Establece el precio de compra del Articulo
     */
    public void setPrecioCompra(double precioCompra) {
        if (precioCompra > 0) {
            this.precioCompra = precioCompra;
        } else {
            this.precioCompra = 0;
        }
    }

    /**
     * @return Devuelve el precio de venta del Articulo
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta Establece el precio de venta del Articulo
     */
    public void setPrecioVenta(double precioVenta) {
        if (precioVenta > 0) {
            this.precioVenta = precioVenta;
        } else {
            this.precioVenta = 0;
        }
    }

    /**
     * @return Devuelve el stock del Articulo
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock Establece el stock del Articulo
     */
    public void setStock(int stock) {
        if (stock > 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    /**
     * Crea y devuelve una String con la información del artículo
     * @return Cadena ya montada
     */
    public String toString() {
        return "{" +
            "\n  Código: \"" + codigo + "\"" +
            ",\n  Descripción: \"" + descripcion + "\"" +
            ",\n  Precio de Compra: " + precioCompra +
            ",\n  Precio de Venta: " + precioVenta +
            ",\n  Stock: " + stock +
        "\n}";
    }
}
