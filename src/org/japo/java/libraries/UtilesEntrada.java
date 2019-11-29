/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class UtilesEntrada {

    //Constantes globales
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Método obtener
    public static final double obtener(String msgUsr, String msgErr) {
        //Variables
        double num = 0;
        boolean entradaOK;

        //Bucle principal
        do {
            //Inicializaión variable
            entradaOK = false;

            //Bloque trycatch
            try {
                //Le pedimos el número al usuario
                System.out.print(msgUsr);
                num = SCN.nextDouble();

                //Y salimos del bucle
                entradaOK = true;
            } catch (Exception e) {
                //Mensaje en caso de error
                System.out.println(msgErr);

            } finally {
                //Limipamos el búfer y decoramos la salida
                SCN.nextLine();
                System.out.println("---");
            }
        } while (!entradaOK);

        //Return
        return num;
    }
}
