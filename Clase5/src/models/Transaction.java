package models;


import java.time.LocalDateTime;

public class Transaction {

    private Integer id;
    private String nombre;
    private Double monto;
    private LocalDateTime fechaCreacion;
    private String tipoPago;
    private String lugar;

    public Transaction()
    {
    }

    public Transaction(Integer id, String nombre, Double monto, LocalDateTime fechaCreacion, String tipoPago, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
        this.fechaCreacion = fechaCreacion;
        this.tipoPago = tipoPago;
        this.lugar = lugar;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public Double getMonto() {
        return monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
