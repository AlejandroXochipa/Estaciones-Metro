/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba7;

/**
 *
 * @author xochi
 */
import java.util.Scanner;

public class Prueba7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // private String inicio;
        String[] linea1 = {"Pantitlan", "Zaragoza", "Gomez Farias", "Bulevard", "Balbuena", "Moctezuma", "San Lazaro", "Candelaria",
            "Merced",
            "Pino Suarez",
            "Isabel",
            "Salto",
            "Balderas",
            "Cuauhtemoc",
            "Insurgentes",
            "Sevilla", "Chapultepec", "Juanacatlan", "Tacubaya", "Observatorio", "Puebla", "Ciudad Deportiva", "Velodromo", "Mixiuhca",
            "Jamaica", "Chabacano", "Lazaro Cardenas", "Centro Medico", "Chilpancingo", "Patriotismo", "Cuatro Caminos", "Panteones", "Tacuba",
            "Cuitlahuac", "Popotla", "Colegio Militar", "Normal", "San Cosme", "Revolucion", "Hidalgo", "Bellas Artes", "Allende", "Zocalo",
            "San Antonio", "Viaducto", "Xola", "Villa", "Nativitas", "Portales", "Ermita", "General Anaya", "Tasquena", "Indios Verdes",
            "Deportivo", "Potrero", "La Raza", "Tlatelolco", "Guerrero", "Hidalgo", "Juarez", "Ninos Heroes", "Hospital General", "Etiopia",
            "Eugenia", "Division del Norte", "Zapata", "Coyoacan", "Viveros", "Miguel Angel", "Copilco", "Universidad", "Politecnico",
            "Instituto del Petroleo", "Autobuses del Norte", "Misterios", "Valle Gomez", "Consulado", "Eduardo Molina", "Aragon",
            "Oceania", "Terminal Aerea", "Hangares", "Garibaldi", "San Juan de Letran", "Doctores", "Obrera", "La Viga", "Santa Anita",
            "Coyuya", "Iztacalco", "Apatlaco", "Aculco", "Escuadron 201", "Atlilco", "Iztapalapa", "Cerro de la Estrella",
            "UAM I", "Constitucion de 1917", "El Rosario", "Aquiles Serdan", "Camarones", "Refineria", "San Joaquin", "Polanco", "Auditorio", "Constituyentes",
            "San Juan de los Pinos", "Sn Antonio", "Mixcoac", "Barranca del Muerto", "Fray Servando", "Morelos", "Canal del Norte", "Bondojito", "Talisman",
            "Martin Carrera", "Tezozomoc", "Azcapotzalco", "Ferreria", "Norte 45", "Vallejo", "Lindavista", "La Villa-Basilica"

        };
        Grafo g = new Grafo(linea1);

//Linea 1
        g.agregarRuta("Pantitlan", "Pantitlan", 0);
        g.agregarRuta("Pantitlan", "Zaragoza", 1320);
        g.agregarRuta("Zaragoza", "Zaragoza", 0);
        g.agregarRuta("Zaragoza", "Gomez Farias", 762);
        g.agregarRuta("Gomez Farias", "Gomez Farias", 0);
        g.agregarRuta("Gomez Farias", "Bulevard", 611);
        g.agregarRuta("Bulevard", "Bulevard", 0);
        g.agregarRuta("Bulevard", "Balbuena", 595);
        g.agregarRuta("Balbuena", "Balbuena", 0);
        g.agregarRuta("Balbuena", "Moctezuma", 703);
        g.agregarRuta("Moctezuma", "Moctezuma", 0);
        g.agregarRuta("Moctezuma", "San Lazaro", 478);
        g.agregarRuta("San Lazaro", "San Lazaro", 0);
        g.agregarRuta("San Lazaro", "Candelaria", 866);
        g.agregarRuta("Candelaria", "Candelaria", 0);
        g.agregarRuta("Candelaria", "Merced", 698);
        g.agregarRuta("Merced", "Merced", 0);
        g.agregarRuta("Merced", "Pino Suarez", 745);
        g.agregarRuta("Pino Suarez", "Pino Suarez", 0);
        g.agregarRuta("Pino Suarez", "Isabel", 382);
        g.agregarRuta("Isabel", "Isabel", 0);
        g.agregarRuta("Isabel", "Salto", 445);
        g.agregarRuta("Salto", "Salto", 0);
        g.agregarRuta("Salto", "Balderas", 458);
        g.agregarRuta("Balderas", "Balderas", 0);
        g.agregarRuta("Balderas", "Cuauhtemoc", 409);
        g.agregarRuta("Cuauhtemoc", "Cuauhtemoc", 0);
        g.agregarRuta("Cuauhtemoc", "Insurgentes", 793);
        g.agregarRuta("Insurgentes", "Insurgentes", 0);
        g.agregarRuta("Insurgentes", "Sevilla", 645);
        g.agregarRuta("Sevilla", "Sevilla", 0);
        g.agregarRuta("Sevilla", "Chapultepec", 501);
        g.agregarRuta("Chapultepec", "Chapultepec", 0);
        g.agregarRuta("Chapultepec", "Juanacatlan", 973);
        g.agregarRuta("Juanacatlan", "Juanacatlan", 0);
        g.agregarRuta("Juanacatlan", "Tacubaya", 1158);
        g.agregarRuta("Tacubaya", "Tacubaya", 0);
        g.agregarRuta("Tacubaya", "Observatorio", 1262);
        g.agregarRuta("Observatorio", "Observatorio", 0);

        //Linea 2
        g.agregarRuta("Cuatro Caminos", "Cuatro Caminos", 0);
        g.agregarRuta("Cuatro Caminos", "Panteones", 1639);
        g.agregarRuta("Panteones", "Panteones", 0);
        g.agregarRuta("Panteones", "Tacuba", 1416);
        g.agregarRuta("Tacuba", "Tacuba", 0);
        g.agregarRuta("Tacuba", "Cuitlahuac", 637);
        g.agregarRuta("Cuitlahuac", "Cuitlahuac", 0);
        g.agregarRuta("Cuitlahuac", "Popotla", 620);
        g.agregarRuta("Popotla", "Popotla", 0);
        g.agregarRuta("Popotla", "Colegio Militar", 462);
        g.agregarRuta("Colegio Militar", "Colegio Militar", 0);
        g.agregarRuta("Colegio Militar", "Normal", 516);
        g.agregarRuta("Normal", "Normal", 0);
        g.agregarRuta("Normal", "San Cosme", 657);
        g.agregarRuta("San Cosme", "San Cosme", 0);
        g.agregarRuta("San Cosme", "Revolucion", 537);
        g.agregarRuta("Revolucion", "Revolucion", 0);
        g.agregarRuta("Revolucion", "Hidalgo", 587);
        g.agregarRuta("Hidalgo", "Hidalgo", 0);
        g.agregarRuta("Hidalgo", "Bellas Artes", 447);
        g.agregarRuta("Bellas Artes", "Bellas Artes", 0);
        g.agregarRuta("Bellas Artes", "Allende", 387);
        g.agregarRuta("Allende", "Allende", 0);
        g.agregarRuta("Allende", "Zocalo", 602);
        g.agregarRuta("Zocalo", "Zocalo", 0);
        g.agregarRuta("Zocalo", "Pino Suarez", 745);
        g.agregarRuta("Pino Suarez", "Pino Suarez", 0);
        g.agregarRuta("Pino Suarez", "San Antonio", 817);
        g.agregarRuta("San Antonio", "San Antonio", 0);
        g.agregarRuta("San Antonio", "Chabacano", 642);
        g.agregarRuta("Chabacano", "Chabacano", 0);
        g.agregarRuta("Chabacano", "Viaducto", 774);
        g.agregarRuta("Viaducto", "Viaducto", 0);
        g.agregarRuta("Viaducto", "Xola", 490);
        g.agregarRuta("Xola", "Xola", 0);
        g.agregarRuta("Xola", "Villa", 750);
        g.agregarRuta("Villa", "Villa", 0);
        g.agregarRuta("Villa", "Nativitas", 750);
        g.agregarRuta("Nativitas", "Nativitas", 0);
        g.agregarRuta("Nativitas", "Portales", 924);
        g.agregarRuta("Portales", "Ermita", 748);
        g.agregarRuta("Ermita", "Ermita", 0);
        g.agregarRuta("Ermita", "General Anaya", 838);
        g.agregarRuta("General Anaya", "General Anaya", 0);
        g.agregarRuta("General Anaya", "Tasquena", 1330);
        g.agregarRuta("Tasquena", "Tasquena", 0);

        //Linea 3
        g.agregarRuta("Indios Verdes", "Indios Verdes", 0);
        g.agregarRuta("Indios Verdes", "Deportivo", 1666);
        g.agregarRuta("Deportivo", "Deportivo", 0);
        g.agregarRuta("Deportivo", "Potrero", 966);
        g.agregarRuta("Potrero", "Potrero", 0);
        g.agregarRuta("Potrero", "La Raza", 1106);
        g.agregarRuta("La Raza", "La Raza", 0);
        g.agregarRuta("La Raza", "Tlatelolco", 1445);
        g.agregarRuta("Tlatelolco", "Tlatelolco", 0);
        g.agregarRuta("Tlatelolco", "Guerrero", 1042);
        g.agregarRuta("Guerrero", "Guerrero", 0);
        g.agregarRuta("Guerrero", "Hidalgo", 702);
        g.agregarRuta("Hidalgo", "Hidalgo", 0);
        g.agregarRuta("Hidalgo", "Juarez", 251);
        g.agregarRuta("Juarez", "Juarez", 0);
        g.agregarRuta("Juarez", "Balderas", 659);
        g.agregarRuta("Balderas", "Balderas", 0);
        g.agregarRuta("Balderas", "Ninos Heroes", 665);
        g.agregarRuta("Ninos Heroes", "Ninos Heroes", 0);
        g.agregarRuta("Ninos Heroes", "Hospital General", 559);
        g.agregarRuta("Hospital General", "Hospital General", 0);
        g.agregarRuta("Hospital General", "Centro Medico", 653);
        g.agregarRuta("Centro Medico", "Centro Medico", 0);
        g.agregarRuta("Centro Medico", "Etiopia", 1119);
        g.agregarRuta("Etiopia", "Etiopia", 0);
        g.agregarRuta("Etiopia", "Eugenia", 950);
        g.agregarRuta("Eugenia", "Eugenia", 0);
        g.agregarRuta("Eugenia", "Division del Norte", 715);
        g.agregarRuta("Division del Norte", "Division del Norte", 0);
        g.agregarRuta("Division del Norte", "Zapata", 794);
        g.agregarRuta("Zapata", "Zapata", 0);
        g.agregarRuta("Zapata", "Coyoacan", 1153);
        g.agregarRuta("Coyoacan", "Coyoacan", 0);
        g.agregarRuta("Coyoacan", "Viveros", 908);
        g.agregarRuta("Viveros", "Viveros", 0);
        g.agregarRuta("Viveros", "Miguel Angel", 824);
        g.agregarRuta("Miguel Angel", "Miguel Angel", 0);
        g.agregarRuta("Miguel Angel", "Copilco", 1295);
        g.agregarRuta("Copilco", "Copilco", 0);
        g.agregarRuta("Copilco", "Universidad", 1306);
        g.agregarRuta("Universidad", "Universidad", 0);

        // Linea 4
        g.agregarRuta("Santa Anita", "Santa Anita", 0);
        g.agregarRuta("Santa Anita", "Jamaica", 758);
        g.agregarRuta("Jamaica", "Jamaica", 0);
        g.agregarRuta("Jamaica", "Fray Servando", 1033);
        g.agregarRuta("Fray Servando", "Fray Servando", 0);
        g.agregarRuta("Fray Servando", "Candelaria", 633);
        g.agregarRuta("Candelaria", "Candelaria", 0);
        g.agregarRuta("Candelaria", "Morelos", 1062);
        g.agregarRuta("Morelos", "Morelos", 0);
        g.agregarRuta("Morelos", "Canal del Norte", 910);
        g.agregarRuta("Canal del Norte", "Canal del Norte", 0);
        g.agregarRuta("Canal del Norte", "Consulado", 884);
        g.agregarRuta("Consulado", "Consulado", 0);
        g.agregarRuta("Consulado", "Bondojito", 645);
        g.agregarRuta("Bondojito", "Bondojito", 0);
        g.agregarRuta("Bondojito", "Talisman", 959);
        g.agregarRuta("Talisman", "Talisman", 0);
        g.agregarRuta("Talisman", "Martin Carrera", 1129);
        g.agregarRuta("Martin Carrera", "Martin Carrera", 0);

        // Linea 5
        g.agregarRuta("Politecnico", "Politecnico", 0);
        g.agregarRuta("Politecnico", "Instituto del Petroleo", 1188);
        g.agregarRuta("Instituto del Petroleo", "Instituto del Petroleo", 0);
        g.agregarRuta("Instituto del Petroleo", "Autobuses del Norte", 1067);
        g.agregarRuta("Autobuses del Norte", "Autobuses del Norte", 0);
        g.agregarRuta("Autobuses del Norte", "La Raza", 975);
        g.agregarRuta("La Raza", "La Raza", 0);
        g.agregarRuta("La Raza", "Misterios", 892);
        g.agregarRuta("Misterios", "Misterios", 0);
        g.agregarRuta("Misterios", "Valle Gomez", 969);
        g.agregarRuta("Valle Gomez", "Valle Gomez", 0);
        g.agregarRuta("Valle Gomez", "Consulado", 679);
        g.agregarRuta("Consulado", "Consulado", 0);
        g.agregarRuta("Consulado", "Eduardo Molina", 815);
        g.agregarRuta("Eduardo Molina", "Eduardo Molina", 0);
        g.agregarRuta("Eduardo Molina", "Aragon", 860);
        g.agregarRuta("Aragon", "Aragon", 0);
        g.agregarRuta("Aragon", "Oceania", 1219);
        g.agregarRuta("Oceania", "Oceania", 0);
        g.agregarRuta("Oceania", "Terminal Aerea", 1174);
        g.agregarRuta("Terminal Aerea", "Terminal Aerea", 0);
        g.agregarRuta("Terminal Aerea", "Hangares", 1153);
        g.agregarRuta("Hangares", "Hangares", 0);
        g.agregarRuta("Hangares", "Pantitlan", 1644);
        g.agregarRuta("Pantitlan", "Pantitlan", 0);

        //  linea 6
        g.agregarRuta("El Rosario", "El Rosario", 0);
        g.agregarRuta("El Rosario", "Tezozomoc", 1257);
        g.agregarRuta("Tezozomoc", "Tezozomoc", 0);
        g.agregarRuta("Tezozomoc", "Azcapotzalco", 973);
        g.agregarRuta("Azcapotzalco", "Azcapotzalco", 0);
        g.agregarRuta("Azcapotzalco", "Ferreria", 1173);
        g.agregarRuta("Ferreria", "Ferreria", 0);
        g.agregarRuta("Ferreria", "Norte 45", 1072);
        g.agregarRuta("Norte 45", "Norte 45", 0);
        g.agregarRuta("Norte 45", "Vallejo", 660);
        g.agregarRuta("Vallejo", "Vallejo", 0);
        g.agregarRuta("Vallejo", "Instituto del Petroleo", 755);
        g.agregarRuta("Instituto del Petroleo", "Instituto del Petroleo", 0);
        g.agregarRuta("Instituto del Petroleo", "Lindavista", 1258);
        g.agregarRuta("Lindavista", "Lindavista", 0);
        g.agregarRuta("Lindavista", "Deportivo", 1075);
        g.agregarRuta("Deportivo", "Deportivo", 0);
        g.agregarRuta("Deportivo", "La Villa-Basilica", 570);
        g.agregarRuta("La Villa-Basilica", "La Villa-Basilica", 0);
        g.agregarRuta("La Villa-Basilica", "Martin Carrera", 1141);
        g.agregarRuta("Martin Carrera", "Martin Carrera", 0);

        // linea 7 
        g.agregarRuta("El Rosario", "El Rosario", 0);
        g.agregarRuta("El Rosario", "Aquiles Serdan", 1615);
        g.agregarRuta("Aquiles Serdan", "Aquiles Serdan", 0);
        g.agregarRuta("Aquiles Serdan", "Camarones", 1402);
        g.agregarRuta("Camarones", "Camarones", 0);
        g.agregarRuta("Camarones", "Refineria", 952);
        g.agregarRuta("Refineria", "Refineria", 0);
        g.agregarRuta("Refineria", "Tacuba", 1295);
        g.agregarRuta("Tacuba", "Tacuba", 0);
        g.agregarRuta("Tacuba", "San Joaquin", 1433);
        g.agregarRuta("San Joaquin", "San Joaquin", 0);
        g.agregarRuta("San Joaquin", "Polanco", 1163);
        g.agregarRuta("Polanco", "Polanco", 0);
        g.agregarRuta("Polanco", "Auditorio", 812);
        g.agregarRuta("Auditorio", "Auditorio", 0);
        g.agregarRuta("Auditorio", "Constituyentes", 1430);
        g.agregarRuta("Constituyentes", "Constituyentes", 0);
        g.agregarRuta("Constituyentes", "Tacubaya", 1005);
        g.agregarRuta("Tacubaya", "Tacubaya", 0);
        g.agregarRuta("Tacubaya", "San Juan de los Pinos", 1084);
        g.agregarRuta("San Juan de los Pinos", "San Juan de los Pinos", 0);
        g.agregarRuta("San Juan de los Pinos", "Sn Antonio", 606);
        g.agregarRuta("Sn Antonio", "Sn Antonio", 0);
        g.agregarRuta("Sn Antonio", "Mixcoac", 788);
        g.agregarRuta("Mixcoac", "Mixcoac", 0);
        g.agregarRuta("Mixcoac", "Barranca del Muerto", 1476);
        g.agregarRuta("Barranca del Muerto", "Barranca del Muerto", 0);

        // linea 8
        g.agregarRuta("Garibaldi", "Garibaldi", 0);
        g.agregarRuta("Garibaldi", "Bellas Artes", 634);
        g.agregarRuta("Bellas Artes", "Bellas Artes", 0);
        g.agregarRuta("Bellas Artes", "San Juan de Letran", 456);
        g.agregarRuta("San Juan de Letran", "San Juan de Letran", 0);
        g.agregarRuta("San Juan de Letran", "Salto", 292);
        g.agregarRuta("Salto", "Salto", 0);
        g.agregarRuta("Salto", "Doctores", 564);
        g.agregarRuta("Doctores", "Doctores", 0);
        g.agregarRuta("Doctores", "Obrera", 761);
        g.agregarRuta("Obrera", "Obrera", 0);
        g.agregarRuta("Obrera", "Chabacano", 1143);
        g.agregarRuta("Chabacano", "Chabacano", 0);
        g.agregarRuta("Chabacano", "La Viga", 843);
        g.agregarRuta("La Viga", "La Viga", 0);
        g.agregarRuta("La Viga", "Santa Anita", 633);
        g.agregarRuta("Santa Anita", "Santa Anita", 0);
        g.agregarRuta("Santa Anita", "Coyuya", 968);
        g.agregarRuta("Coyuya", "Coyuya", 0);
        g.agregarRuta("Coyuya", "Iztacalco", 993);
        g.agregarRuta("Iztacalco", "Iztacalco", 0);
        g.agregarRuta("Iztacalco", "Apatlaco", 910);
        g.agregarRuta("Apatlaco", "Apatlaco", 0);
        g.agregarRuta("Apatlaco", "Aculco", 534);
        g.agregarRuta("Aculco", "Aculco", 0);
        g.agregarRuta("Aculco", "Escuadron 201", 789);
        g.agregarRuta("Escuadron 201", "Escuadron 201", 0);
        g.agregarRuta("Escuadron 201", "Atlilco", 1738);
        g.agregarRuta("Atlilco", "Atlilco", 0);
        g.agregarRuta("Atlilco", "Iztapalapa", 732);
        g.agregarRuta("Iztapalapa", "Iztapalapa", 0);
        g.agregarRuta("Iztapalapa", "Cerro de la Estrella", 717);
        g.agregarRuta("Cerro de la Estrella", "Cerro de la Estrella", 0);
        g.agregarRuta("Cerro de la Estrella", "UAM I", 1135);
        g.agregarRuta("UAM I", "UAM I", 0);
        g.agregarRuta("UAM I", "Constitucion de 1917", 1137);
        g.agregarRuta("Constitucion de 1917", "Constitucion de 1917", 0);

        //Linea 9
        g.agregarRuta("Pantitlan", "Pantitlan", 0);
        g.agregarRuta("Pantitlan", "Puebla", 1380);
        g.agregarRuta("Puebla", "Puebla", 0);
        g.agregarRuta("Puebla", "Ciudad Deportiva", 800);
        g.agregarRuta("Ciudad Deportiva", "Ciudad Deportiva", 0);
        g.agregarRuta("Ciudad Deportiva", "Velodromo", 1110);
        g.agregarRuta("Velodromo", "Velodromo", 0);
        g.agregarRuta("Velodromo", "Mixiuhca", 821);
        g.agregarRuta("Mixiuhca", "Mixiuhca", 0);
        g.agregarRuta("Mixiuhca", "Jamaica", 942);
        g.agregarRuta("Jamaica", "Jamaica", 0);
        g.agregarRuta("Jamaica", "Chabacano", 1031);
        g.agregarRuta("Chabacano", "Chabacano", 0);
        g.agregarRuta("Chabacano", "Lazaro Cardenas", 1000);
        g.agregarRuta("Lazaro Cardenas", "Lazaro Cardenas", 0);
        g.agregarRuta("Lazaro Cardenas", "Centro Medico", 1059);
        g.agregarRuta("Centro Medico", "Centro Medico", 0);
        g.agregarRuta("Centro Medico", "Chilpancingo", 1152);
        g.agregarRuta("Chilpancingo", "Chilpancingo", 0);
        g.agregarRuta("Chilpancingo", "Patriotismo", 955);
        g.agregarRuta("Patriotismo", "Patriotismo", 0);
        g.agregarRuta("Patriotismo", "Tacubaya", 1133);
        g.agregarRuta("Tacubaya", "Tacubaya", 0);

        String inicio = "Pantitlan";
        String fin = "Aculco";
        // String inicio = "Pantitlan", fin = "Zaragoza";
      /*   String inicio, fin;
        System.out.println("Ingrese su estacion de origen: ");
          inicio = entrada.nextLine();
        System.out.println("Ingrese su estacion de destino: ");
         fin = entrada.nextLine();*/
        
        //String entrada1 = inicio;
        //String respuesta =
        // String encontrarRutaMinimaDijkstra = g.encontrarRutaMinimaDijkstra(inicio, fin);
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta + "//");

    }

}
