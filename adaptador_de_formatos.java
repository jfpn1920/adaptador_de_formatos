import java.util.Scanner;
public class adaptador_de_formatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] archivos = new String[10];
        String[] formatosOriginales = new String[10];
        String[] formatosDestino = new String[10];
        double[] tamanos = new double[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_adaptador_de_formatos|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal adaptador de formatos");
            System.out.println("1) Registrar formato");
            System.out.println("2) Editar formato");
            System.out.println("3) Listar formatos");
            System.out.println("4) Buscar formato");
            System.out.println("5) Eliminar formato");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_formato|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del formato");
                    System.out.println("id del formato a registrar: " + id);
                    System.out.print("nombre del archivo: ");
                    archivos[total] = entrada.nextLine();
                    System.out.print("formato original: ");
                    formatosOriginales[total] = entrada.nextLine();
                    System.out.print("formato de destino: ");
                    formatosDestino[total] = entrada.nextLine();
                    System.out.print("tamano del archivo en MB: ");
                    tamanos[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("fecha de conversion: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado de la conversion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Formato registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_formato|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen formatos registrados.");
                        break;
                    }
                    System.out.println("Datos de los formatos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Archivo: " + archivos[i] + " | Formato original: " + formatosOriginales[i] + " | Formato destino: " + formatosDestino[i] + " | Tamano: " + tamanos[i] + " MB | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del formato: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del formato");
                        System.out.print("Nuevo nombre del archivo: ");
                        archivos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo formato original: ");
                        formatosOriginales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo formato de destino: ");
                        formatosDestino[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tamano del archivo en MB: ");
                        tamanos[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nueva fecha de conversion: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la conversion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Formato actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_formatos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen formatos registrados.");
                    } else {
                        System.out.println("Lista de formatos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Archivo: " + archivos[i] + " | Formato original: " + formatosOriginales[i] + " | Formato destino: " + formatosDestino[i] + " | Tamano: " + tamanos[i] + " MB | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_formato|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen formatos registrados.");
                        break;
                    }
                    System.out.println("busqueda de formato");
                    System.out.print("ingresa la id para buscar formato: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del formato encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Archivo: " + archivos[posicion] + " | Formato original: " + formatosOriginales[posicion] + " | Formato destino: " + formatosDestino[posicion] + " | Tamano: " + tamanos[posicion] + " MB | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_formato|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen formatos registrados.");
                        break;
                    }
                    System.out.println("Datos de los formatos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Archivo: " + archivos[i] + " | Formato original: " + formatosOriginales[i] + " | Formato destino: " + formatosDestino[i] + " | Tamano: " + tamanos[i] + " MB | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del formato a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            archivos[i] = archivos[i + 1];
                            formatosOriginales[i] = formatosOriginales[i + 1];
                            formatosDestino[i] = formatosDestino[i + 1];
                            tamanos[i] = tamanos[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Formato eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Adaptador de Formatos.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}