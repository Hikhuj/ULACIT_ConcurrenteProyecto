package ClasesPrograma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class InteraccionConCSV {

    //variables
    private final String rutaDBUsuario = "";
    private final String rutaDBArticulo = "";
    public static final String SEPARADOR = ",";
    private int cantidadColumnasUsuarioCSV;
    private int cantidadColumnasArticuloCSV;

    //Metodos
    public String[] buscarUsuario(String idRecibido) {
        // BufferedReader: Lee el texto de una entrada de texto, almacenando 
        // los mismo datos a como se reciben para una mejor eficiencia de los
        // caracteres, arreglos y lineas

        boolean primeraLinea = true;
        String[] informacionObtenida = null;

        // Inicializaciones
        BufferedReader bufferLectura = null;

        try {

            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(rutaDBUsuario));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                // La siguiente linea evita leer la primera linea, la cual son los
                // Headers del archivo CSV.
                if (primeraLinea) {
                    primeraLinea = false;
                } else {

                    // Separar la linea leída con el separador definido previamente
                    String[] campos = linea.split(SEPARADOR);

                    if (idEncontrado(campos, idRecibido) == true) {

                        informacionObtenida = campos;
                        bufferLectura.close();
                        break;

                    }

                }

                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();

            }

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        return informacionObtenida;

    }

    public String[] buscarArticulo(String idRecibido) {

        // BufferedReader: Lee el texto de una entrada de texto, almacenando 
        // los mismo datos a como se reciben para una mejor eficiencia de los
        // caracteres, arreglos y lineas
        // Variables
        boolean primeraLinea = true;
        String[] informacionObtenida = null;

        // Inicializaciones
        BufferedReader bufferLectura = null;

        try {

            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(rutaDBArticulo));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                // La siguiente linea evita leer la primera linea, la cual son los
                // Headers del archivo CSV.
                if (primeraLinea) {
                    primeraLinea = false;
                } else {

                    // Separar la linea leída con el separador definido previamente
                    String[] campos = linea.split(SEPARADOR);

                    if (idEncontrado(campos, idRecibido) == true) {

                        informacionObtenida = campos;
                        bufferLectura.close();
                        break;

                    }

                }

                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();

            }

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        return informacionObtenida;

    }

    private boolean idEncontrado(String[] array, String idRecibido) {

        /*
            Funcion recibe un arreglo y lo imprime en consola
         */
        boolean resultado = false;

        if (idRecibido.equals(array[0])) {
            resultado = true;
        }

        return resultado;

    }

    public boolean actualizarDatosUsuario(String[] array, String idRecibido) {

        /* 
            BufferedWriter: Escribe texto a una salida de texto, almacenando los mismo datos 
            a como se reciben para una eficaz escritura de los caracteres, arreglos y lineas
         */
        // Crear archivo temporal donde se escribiran todos los datos y los nuevos
        boolean result = false;
        BufferedReader br = null;
        boolean primeraLinea = true;
        String tempPath = "src/projectDatabase/tempFile.csv";

        // BufferedReader debe ir en Try con el fin de probar el codigo, puede llegar a devolver errores
        try {

            // BufferedReader me permite leer datos de una entrada de datos recibida (como un archivo en este caso)
            // FileReader: permite leer "Streams" de datos y de archivos (Steam: fuente o destino de bytes) Streams
            // mas comunes --> archivos.
            br = new BufferedReader(new FileReader(rutaDBUsuario));

            // Almacenar una linea del objeto 'br' en una variable tipo String.
            String linea = br.readLine();

            // Crear archivo temporal, retorna pathTemporal
            tempPath = crearArchivoTemp(tempPath);

            // Crear un ciclo que permita leer cada linea del objeto mientras no sea NULA
            while (linea != null) {

                // Separar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR);

                if (primeraLinea) {

                    escribirEnTemp(campos, tempPath);
                    primeraLinea = false;

                } else {

                    if (idEncontrado(campos, idRecibido) == true) {

                        escribirEnTemp(array, tempPath);
                        result = true;

                    } else {

                        escribirEnTemp(campos, tempPath);

                    }

                }

                // Volver a leer otra línea del fichero
                linea = br.readLine();

            }

            br.close();
            borrarArchivo(rutaDBUsuario);
            renombrarArchivoTemporalUsuarios(tempPath, rutaDBUsuario);

        } catch (IOException e) {
            // Cierro el buffer de lectura
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        return result;
    }

    public boolean actualizarDatosArticulo(String[] array, String idRecibido) {

        /* 
            BufferedWriter: Escribe texto a una salida de texto, almacenando los mismo datos 
            a como se reciben para una eficaz escritura de los caracteres, arreglos y lineas
         */
        // Crear archivo temporal donde se escribiran todos los datos y los nuevos
        boolean result = false;
        BufferedReader br = null;
        boolean primeraLinea = true;
        String tempPath = "src/projectDatabase/tempFile.csv";

        // BufferedReader debe ir en Try con el fin de probar el codigo, puede llegar a devolver errores
        try {

            // BufferedReader me permite leer datos de una entrada de datos recibida (como un archivo en este caso)
            // FileReader: permite leer "Streams" de datos y de archivos (Steam: fuente o destino de bytes) Streams
            // mas comunes --> archivos.
            br = new BufferedReader(new FileReader(rutaDBArticulo));

            // Almacenar una linea del objeto 'br' en una variable tipo String.
            String linea = br.readLine();

            // Se crea el archivo temporal que almacenara
            tempPath = crearArchivoTemp(tempPath);

            // Crear un ciclo que permita leer cada linea del objeto mientras no sea NULA
            while (linea != null) {

                // Separar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR);

                if (primeraLinea) {

                    escribirEnTemp(campos, tempPath);
                    primeraLinea = false;

                } else {

                    if (idEncontrado(campos, idRecibido) == true) {

                        escribirEnTemp(array, tempPath);
                        result = true;

                    } else {

                        escribirEnTemp(campos, tempPath);

                    }

                }

                // Volver a leer otra línea del fichero
                linea = br.readLine();

            }

            br.close();
            borrarArchivo(rutaDBArticulo);
            renombrarArchivoTemporalUsuarios(tempPath, rutaDBArticulo);

        } catch (IOException e) {
            // Cierro el buffer de lectura
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        return result;

    }

    public void escribirEnTemp(String[] array, String path) {

        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
         */
        try {

            FileWriter fw = new FileWriter(path, true);

            try (BufferedWriter bw = new BufferedWriter(fw)) {

                int contadorComas = (array.length - 1);

                for (int i = 0; i < array.length; i++) {
                    bw.write(array[i]);
                    if (i < contadorComas) {
                        bw.write(",");
                    }
                }

                bw.write("\n");
                bw.flush();

            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

    }

    public String crearArchivoTemp(String path) {

        File temp;

        try {

            // Crear nuevo objeto en Path dado + nombre de archivo
            temp = new File(path);

            if (temp.createNewFile()) {
                System.out.println("Archivo temporal creado correctamente");
            }

        } catch (IOException e) {

            System.err.println("El archivo no se pudo crear pues ya existe o bien contacte a su programador");

        }

        return path;

    }

    public void renombrarArchivoTemporalUsuarios(String pathViejo, String pathNuevo) {

        // Renombrar el nuevo archivo trabajado
        File archivoViejo = new File(pathViejo);
        File archivoNuevo = new File(pathNuevo);

        if (archivoViejo.renameTo(archivoNuevo)) {
            System.out.println("Renombrado exitoso.");
        } else {
            System.out.println("Renombrado fallido.");
        }

    }

    public void borrarArchivo(String path) {

        File f = new File(path);

        if (f.delete()) {
            System.out.println(path + ", ha sido borrado.");
        } else {
            System.out.println(path + ", no existe.");
        }

    }

    public void crearUsuarioNuevo(String[] informacionUsuario) {

        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
         */
        try {
            FileWriter fw = new FileWriter(rutaDBUsuario, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("\n");

                int contadorComas = (informacionUsuario.length - 1);

                for (int i = 0; i < informacionUsuario.length; i++) {
                    bw.write(informacionUsuario[i]);
                    if (i < contadorComas) {
                        bw.write(",");
                    }
                }

                bw.flush();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void crearArticuloNuevo(String[] informacionArticulo) {

        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
         */
        try {
            FileWriter fw = new FileWriter(rutaDBArticulo, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("\n");

                int contadorComas = (informacionArticulo.length - 1);

                for (int i = 0; i < informacionArticulo.length; i++) {
                    bw.write(informacionArticulo[i]);
                    if (i < contadorComas) {
                        bw.write(",");
                    }
                }

                bw.flush();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }

    public int setIdNuevoUsuario() {

        // Variables
        boolean primeraLinea = true;
        String[] ultimaLinea = null;
        int idNuevo;

        // Inicializaciones
        BufferedReader br = null;

        try {

            // Abrir el .csv en buffer de lectura
            br = new BufferedReader(new FileReader(rutaDBUsuario));

            // Leer una linea del archivo
            String linea = br.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                // La siguiente linea evita leer la primera linea, la cual son los
                // Headers del archivo CSV.
                if (primeraLinea) {
                    primeraLinea = false;
                } else {

                    // Separar la linea leída con el separador definido previamente
                    String[] campos = linea.split(SEPARADOR);
                    ultimaLinea = campos;

                }

                // Volver a leer otra línea del fichero
                linea = br.readLine();

            }

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        idNuevo = Integer.parseInt(ultimaLinea[0]);
        idNuevo = idNuevo + 1;

        return idNuevo;

    }

    public int setIdNuevoArticulo() {

        // Variables
        boolean primeraLinea = true;
        String[] ultimaLinea = null;
        int idNuevo;

        // Inicializaciones
        BufferedReader br = null;

        try {

            // Abrir el .csv en buffer de lectura
            br = new BufferedReader(new FileReader(rutaDBArticulo));

            // Leer una linea del archivo
            String linea = br.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                // La siguiente linea evita leer la primera linea, la cual son los
                // Headers del archivo CSV.
                if (primeraLinea) {
                    primeraLinea = false;
                } else {

                    // Separar la linea leída con el separador definido previamente
                    String[] campos = linea.split(SEPARADOR);
                    ultimaLinea = campos;

                }

                // Volver a leer otra línea del fichero
                linea = br.readLine();

            }

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        idNuevo = Integer.parseInt(ultimaLinea[0]);
        idNuevo = idNuevo + 1;

        return idNuevo;

    }

    public void setCantidadColumnasUsuarioCSV() {

        // Variables
        int cantidadColumnas = 0;

        // Inicializaciones
        BufferedReader bufferLectura = null;

        try {

            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(rutaDBUsuario));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                String[] campos = linea.split(SEPARADOR);
                cantidadColumnas = campos.length;
                linea = null;

            }

            bufferLectura.close();

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        this.cantidadColumnasUsuarioCSV = cantidadColumnas;

    }

    public int getCantidadColumnasUsuarioCSV() {
        return cantidadColumnasUsuarioCSV;
    }

    public void setCantidadColumnasArticuloCSV() {

        // Variables
        int cantidadColumnas = 0;

        // Inicializaciones
        BufferedReader bufferLectura = null;

        try {

            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(rutaDBArticulo));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();

            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {

                String[] campos = linea.split(SEPARADOR);
                cantidadColumnas = campos.length;
                linea = null;

            }

            bufferLectura.close();

        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        this.cantidadColumnasArticuloCSV = cantidadColumnas;

    }

    public int getCantidadColumnasArticuloCSV() {
        return cantidadColumnasArticuloCSV;
    }

}
