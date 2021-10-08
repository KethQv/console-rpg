package com.proyecto_final;

import java.util.Scanner;

public class Pantalla {

    private final static Scanner input = new Scanner(System.in);

    public static void mostrarTitulo() throws InterruptedException {
        String[] title = {
                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n" +
                "+:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n" +
                "+:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+\n" +
                "+#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n" +
                "+:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+\n" +
                "+#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:\n" +
                "+#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n" +
                "+:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+\n" +
                "+#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:\n" +
                "+#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#\n" +
                "#+#       #+#    #+#    #+#   #+#+#    #+#      #+#    #+##+#       #+#    #+#\n",

                "::::    :::: :::::::::::::::    ::::::::::::::  ::::::::: :::::::::  ::::::::\n" +
                "+:+:+: :+:+:+    :+:    :+:+:   :+:    :+:      :+:    :+::+:    :+::+:    :+:\n" +
                "+:+ +:+:+ +:+    +:+    :+:+:+  +:+    +:+      +:+    +:++:+    +:++:+\n" +
                "+#+  +:+  +#+    +#+    +#+ +:+ +#+    +#+      +#++:++#: +#++:++#+ :#:\n" +
                "+#+       +#+    +#+    +#+  +#+#+#    +#+      +#+    +#++#+       +#+   +#+#\n" +
                "#+#       #+#    #+#    #+#   #+#+#    #+#      #+#    #+##+#       #+#    #+#\n" +
                "###       #################    ###############  ###    ######        ########\n"
        };

        for (int i = 0; i < title.length; i++) {
            System.out.println(title[i]);
            Thread.sleep(800);
            if (i < title.length - 1) Util.limpiarConsola();
        }
    }

    public static int mostrarMenu() {
        String str = "" +
                "╔═══════════════════════════════════════════════════════════════════════════════╗\n" +
                "║      __  ____      _   ___  ___  _____" + "                                        ║\n" +
                "║     /  |/  (_)__  (_) / _ \\/ _ \\/ ___/" + "                                        ║\n" +
                "║    / /|_/ / / _ \\/ / / , _/ ___/ (_ /" + "                                         ║\n" +
                "║   /_/  /_/_/_//_/_/ /_/|_/_/   \\___/" + "                                          ║\n" +
                "║                                                                               ║\n" +
                "║  [1] Jugar                                                                    ║\n" +
                "║  [2] Creditos                                  Introduce el numero            ║\n" +
                "║  [3] Salir                              correspondiente y presiona enter      ║\n" +
                "║                                                                               ║\n" +
                "╚═══════════════════════════════════════════════════════════════════════════════╝";
        System.out.println(str);
        return input.nextInt();
    }
}
