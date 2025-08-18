package Packages;

interface Option {

    /**
     * Opcion de emprestar
     */
    void fcToast();

    /**
     * Opcion de devolver
     */
    void fcReturn();

    /**
     * Opcion del material esta disponible
     * @return true: disponible.
     *         false: no disponible.
     */
    boolean isAvailable();
}
