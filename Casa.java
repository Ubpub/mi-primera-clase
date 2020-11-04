public class Casa {
    
    //Nombre del propietario
    private String propietario;
    //N�mero de habitaciones
    private int habitaciones;
    //Reforma de la casa
    private boolean reformada;
    
    /**
     * Crea una casa inicializando el nombre del propietario
     * y el n�mero de habitaciones como par�metros y
     * el atributo reformada est� fijo.
     */
    public Casa(String nombrePropietario, int numeroHabitaciones) {
        propietario = nombrePropietario;
        habitaciones = numeroHabitaciones;
        reformada = false;
    }
    
    /**
     * Devuelve el nombre del propietario.
     */
    public String getPropietario() {
        return propietario;
    }
    
    /**
     * Devuelve el n�mero de habitaciones.
     */
    public int getHabitaciones(){
        return habitaciones;
    }
    
    /**
     * Devuelve el valor tipo boolean de la reforma.
     */
    public boolean getReformada() {
        return reformada;
    }
    
    /**
     * Cambia el nombre del propietario.
     */
    public void setPropietario(String newPropietario) {
        propietario = newPropietario;
    }
    
    /**
     * A�ade habitaciones con una operaci�n matem�tica.
     */
    public void setA�adirHabitaciones(int nuevaHabitacion) {
        habitaciones = habitaciones + nuevaHabitacion;
    }
    
    /**
     * Cambia el valor de la reforma.
     */
    public void reformar(){
        if (reformada == false) {
            reformada = true;
        }
        else {
            reformada =false;
        }
    }
    
    /**
     * Imprime los detalles de la casa.
     */
    public void imprimeDetalles() {
        if (reformada == true) {
            System.out.println("Propietario: " + propietario + " | N�mero de habitaciones: " + habitaciones + " | Reformada: S�.");
        }
        else {
            System.out.println("Propietario: " + propietario + " | N�mero de habitaciones: " + habitaciones + " | Reformada: No.");
        }
    }
    
    public String getDevuelveDetalles() {
        String reformaCasa;
        if (reformada == true) {
            reformaCasa = "S�";
        }
        else {
            reformaCasa = "No";
        }
        return "Propietario: " + propietario + " | N�mero de habitaciones: " + habitaciones + " | Reformada: " + reformaCasa + ".";
    }
}