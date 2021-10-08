package com.proyecto_final;

import com.proyecto_final.personajes.Personaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {

    private final static Scanner input = new Scanner(System.in);

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
    }

    public static int mostrarSeleccion(int num,  ArrayList<Personaje> personajes) {
        int largo = "╔═══════════════════════════════════════════════════════════════════════════════╗".length();

        // Creamos strings representando los personajes disponibles y los guardamos en un ArrayList
        ArrayList<String> opciones = new ArrayList<>();

        for (int i = 0; i < personajes.size(); i++) {
            opciones.add(
                    Util.strAutoLenght(largo,
                            "║    [" + i + "] " + personajes.get(i).getNombre(),
                            "║\n")
            );
        }

        // Creamos la pantalla con los personajes disponibles
        String str = String.format("""
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║
                ║    JUGADOR %d                                                                  ║\n""", num);

        for (String s : opciones) {
            str += s;
        }

        str += """
        ║                                              Introduce el numero              ║
        ║                                        correspondiente y presiona enter       ║
        ╚═══════════════════════════════════════════════════════════════════════════════╝""";

        // Mostramos la pantalla
        System.out.println(str);
        return input.nextInt();
    }
}
