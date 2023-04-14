public class Personaje {
    private String nombre = "";
    private int PosicionX = 0;
    private int PosicionY = 0;
    private int Velocidad  = 1;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionX() {
        return PosicionX;
    }

    public void setPosicionX(int posicionX) {
        PosicionX = posicionX;
    }

    public int getPosicionY() {
        return PosicionY;
    }

    public void setPosicionY(int posicionY) {
        PosicionY = posicionY;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }
}
