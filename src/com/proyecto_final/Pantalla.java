package com.proyecto_final;

import com.proyecto_final.personajes.Personaje;

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
    }

    public static void mostrarInstrucciones() {
        String str = """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    Blalalblalalblblblablablablablablalb                                       ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
                ║                                                                               ║
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
                ║    %s                                                                  ║\n""", jugador.getNombre());

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

        str += """
                ║                                                                               ║
                ║    [1] Ataque basico                                                          ║
                ║    [2] Usar habilidad especial                                                ║
                ║    [3] Cambiar de personaje                                                   ║
                ║                                                                               ║
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
