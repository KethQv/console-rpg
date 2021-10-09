package com.proyecto_final;

import com.proyecto_final.personajes.Personaje;

import javax.swing.plaf.TableUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {

    private static final Scanner input = new Scanner(System.in);
    private static final int largo = "╔═══════════════════════════════════════════════════════════════════════════════╗".length();

    public static void mostrarTitulo() throws InterruptedException {
        String[] title = {
                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n",

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                """,

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                +:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+
                """,

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                +:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+
                +#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:
                """,

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                +:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+
                +#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:
                +#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#
                """,

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                +:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+
                +#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:
                +#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#
                #+#       #+#    #+#    #+#   #+#+#    #+#      #+#    #+##+#       #+#    #+#
                """,

                """
                ::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::
                +:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:
                +:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+
                +#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:
                +#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#
                #+#       #+#    #+#    #+#   #+#+#    #+#      #+#    #+##+#       #+#    #+#
                ###       #################    ###############  ###    ######        ########
                """
        };

        for (int i = 0; i < title.length; i++) {
            System.out.println(title[i]);
            Thread.sleep(800);
            if (i < title.length - 1) Util.limpiarConsola();
        }
    }

    public static int mostrarMenu() {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║      __  ____      _   ___  ___  _____                                        ║
                ║     /  |/  (_)__  (_) / _ \\/ _ \\/ ___/                                        ║
                ║    / /|_/ / / _ \\/ / / , _/ ___/ (_ /                                         ║
                ║   /_/  /_/_/_//_/_/ /_/|_/_/   \\___/                                          ║
                ║                                                                               ║
                ║  [1] Jugar                                                                    ║
                ║  [2] Creditos                                  Introduce el numero            ║
                ║  [3] Salir                              correspondiente y presiona enter      ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";
        System.out.println(str);
        int i = input.nextInt();
        input.nextLine(); // limpia el scanner

        Util.limpiarConsola();

        return i;
    }

    public static void mostrarCreditos() {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    Universidad Autonoma de Baja California Sur                                ║
                ║    Proyecto final IDS S3                                                      ║
                ║                                                                               ║
                ║    Creadores:                                                                 ║
                ║    Raul Aloisy Castro                                                         ║
                ║    Kenneth de Guadalupe Quintero Valles                                       ║
                ║                                                                               ║
                ║                                            Presiona enter para volver atras   ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";
        System.out.println(str);
        input.nextLine();

        Util.limpiarConsola();
    }

    public static void mostrarInstrucciones() {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    Instrucciones                                                              ║
                ║                                                                               ║
                ║    * El Jugador 1 es el primero en escoger personajes.                        ║
                ║    * El Jugador 2 es el primero en atacar.                                    ║
                ║    * Cambiar de personaje cuenta como un turno.                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                               Presiona enter para continuar   ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";
        System.out.println(str);
        input.nextLine();

        Util.limpiarConsola();
    }

    public static int mostrarSeleccion(Jugador jugador,  ArrayList<Personaje> personajes) {
        ArrayList<String> opciones = generarOpciones(personajes);

        String str = String.format("""
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    %s                                  Elige 3 personajes              ║
                ║                                                                               ║\n""",
                jugador.getNombre());

        String startString = "║    Personajes elegidos:";
        for (Personaje elegido : jugador.getPersonajes()) {
            startString += String.format(" %s |", elegido.getNombre());
        }
        str += Util.strAutoLenght(largo, startString, "║\n");

        str += "║                                                                               ║\n";

        for (String s : opciones) {
            str += s;
        }

        str += """
                ║                                              Introduce el numero              ║
                ║                                        correspondiente y presiona enter       ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        // Mostramos la pantalla
        System.out.println(str);
        int i = input.nextInt();
        input.nextLine();

        Util.limpiarConsola();

        return i;
    }

    public static int mostrarTurno(Jugador jugador) {
        float vidaPersonaje = jugador.getPersonajeActual().getVidaActual();

        String str = String.format("""
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    %s                                                                  ║\n""", jugador.getNombre());

        str +=  Util.strAutoLenght(largo, "║    Personaje actual: " + jugador.getPersonajeActual().getNombre(),
                "║\n");

        str += """
                ║                                                                               ║
                ║    [1] Ataque basico                                                          ║
                ║    [2] Usar habilidad especial                                                ║
                ║    [3] Cambiar de personaje                                                   ║
                ║    [4] Ver estadisticas                                                       ║
                ║                                              Introduce el numero              ║
                ║                                        correspondiente y presiona enter       ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        // Mostramos la pantalla
        System.out.println(str);
        int i = input.nextInt();
        input.nextLine();

        return i;
    }

    public static int mostrarPersonajesVivos(Jugador jugador) {
        ArrayList<Personaje> personajes = jugador.getPersonajesVivos();
        ArrayList<String> opciones = generarOpciones(personajes);

        String str = String.format("""
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    %s                                                                  ║
                ║                                                                               ║\n""",
                jugador.getNombre());

        for (String s : opciones) {
            str += s;
        }

        str += """
                ║                                              Introduce el numero              ║
                ║                                        correspondiente y presiona enter       ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        // Mostramos la pantalla
        System.out.println(str);
        int i = input.nextInt();
        input.nextLine();

        Util.limpiarConsola();

        return i;
    }

    public static void mostrarCambioDePersonaje(Jugador jugador) {
        String finalString = "║\n";
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║\n""";

        String startString = String.format("║                    %s ha cambiado de personaje!", jugador.getNombre());
        str += Util.strAutoLenght(largo, startString, finalString);

        str += "║                                                                               ║\n";

        String startString2 = String.format("║                        Personaje actual: %s",
                jugador.getPersonajeActual().getNombre());
        str +=  Util.strAutoLenght(largo, startString2, finalString);

        str += """
                ║                                                                               ║
                ║                                                                               ║
                ║                       Presiona enter para continuar                           ║
                ║                                                                               ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        // Mostramos la pantalla
        System.out.println(str);
        input.nextLine();
    }

    public static void mostrarAtaque(Personaje personaje, Personaje objetivo) {
        float[] info = personaje.atacar(objetivo);

        String startString = String.format("║    %s  ->  %s", personaje.getNombre(), objetivo.getNombre());
        String finalString = "║\n";

        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║\n""";

        str += Util.strAutoLenght(largo, startString, finalString);

        String startString2 = String.format("║    %s : OUUUUUUUUCH!", objetivo.getNombre());
        str += Util.strAutoLenght(largo, startString2, finalString);

        str += "║                                                                               ║\n";

        String startString3 = String.format("║    %s ha hecho %f de danio.", personaje.getNombre(), info[0]);
        str += Util.strAutoLenght(largo, startString3, finalString);

        String startString4 = String.format("║    %s se ha defendio y recibio %f de danio.", objetivo.getNombre(), info[0]);
        str += Util.strAutoLenght(largo, startString4, finalString);

        String startString5 = String.format("║    Vida: %f / %f",objetivo.getVidaActual(), objetivo.getVidaMaxima());
        str += Util.strAutoLenght(largo, startString5, finalString);

        str += """
                ║                                                                               ║
                ║                        Presiona enter para continuar                          ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        System.out.println(str);
        input.nextLine();
    }

    public static void mostrarPersonajeMuerto(Jugador jugador, Personaje personajeMuerto, Personaje nuevoPersonaje) {

        String str = String.format("""
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║                                  %s                                    ║\n""", jugador.getNombre());

        str +=  """
                ║                                                                               ║\n""";

        String startString = String.format("║                               %s ha muerto!", personajeMuerto.getNombre());
        str += Util.strAutoLenght(largo, startString, "║\n");

        str += "║                                                                               ║\n";

        String startString2 = String.format("║                      Tu personaje cambiara a: %s",
                nuevoPersonaje.getNombre());
        str += Util.strAutoLenght(largo, startString2, "║\n");

        str += """
                ║                                                                               ║
                ║                        Presiona enter para continuar                          ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        System.out.println(str);

        input.nextLine();
    }

    public static void mostrarGanador(String ganador) {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║                                                                               ║\n""";

        str += String.format("║                             %s ha ganado!                              ║\n",
                ganador);

        str += """
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                        Presiona enter para continuar                          ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        System.out.println(str);

        input.nextLine();
    }


    public static void mostrarEleccionInvalida() {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║                  La eleccion que introduciste no es valida                    ║
                ║                           intenta con otra opcion                             ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                        Presiona enter para continuar                          ║
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";
        System.out.println(str);
        input.nextLine();
        Util.limpiarConsola();
    }

    public static ArrayList<String> generarOpciones(ArrayList<Personaje> personajes) {
        ArrayList<String> opciones = new ArrayList<>();
        for (int i = 0; i < personajes.size(); i++) {
            opciones.add(
                    Util.strAutoLenght(largo,
                            "║    [" + i + "] " + personajes.get(i).getNombre(),
                            "║\n")
            );
        }
        return opciones;
    }
}
